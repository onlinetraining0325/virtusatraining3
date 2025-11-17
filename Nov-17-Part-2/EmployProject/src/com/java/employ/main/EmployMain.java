package com.java.employ.main;

import com.java.employ.bal.EmployBal;
import com.java.employ.exception.EmployException;
import com.java.employ.model.Employ;
import com.java.employ.model.Gender;

import java.util.List;
import java.util.Scanner;

public class EmployMain {

    static EmployBal employBal;
    static {
        employBal = new EmployBal();
    }

    public static void searchEmployMain() {
        int empno;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employ no:  ");
        empno = sc.nextInt();
        Employ employ = employBal.searchEmployBal(empno);
        if (employ != null) {
            System.out.println(employ);
        } else {
            System.out.println("Employe Not Found");
        }
    }

    public  static void deleteEmployMain() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employ no:  ");
        int empno = sc.nextInt();
        System.out.println(employBal.deleteEmployBal(empno));
    }

    public static void showEmployMain() {
        List<Employ> employList = employBal.showEmployBal();
        employList.forEach(x -> {
            System.out.println(x);
        });
    }
    public static void addEmployMain() throws EmployException {
        Scanner sc = new Scanner(System.in);
        Employ employ = new Employ();
        System.out.println("Enter Employ Number   ");
        employ.setEmpno(sc.nextInt());
        System.out.println("Enter Employ Name   ");
        employ.setName(sc.next());
        System.out.println("Enter Gender (MALE/FEMALE)    ");
        employ.setGender(Gender.valueOf(sc.next()));
        System.out.println("Enter Department   ");
        employ.setDept(sc.next());
        System.out.println("Enter Designation      ");
        employ.setDesig(sc.next());
        System.out.println("Enter Salary            ");
        employ.setBasic(sc.nextDouble());
        System.out.println(employBal.addEmployBal(employ));
    }

    public static void updateEmployMain() throws EmployException {
        Scanner sc = new Scanner(System.in);
        Employ employ = new Employ();
        System.out.println("Enter Employ Number   ");
        employ.setEmpno(sc.nextInt());
        System.out.println("Enter Employ Name   ");
        employ.setName(sc.next());
        System.out.println("Enter Gender (MALE/FEMALE)    ");
        employ.setGender(Gender.valueOf(sc.next()));
        System.out.println("Enter Department   ");
        employ.setDept(sc.next());
        System.out.println("Enter Designation      ");
        employ.setDesig(sc.next());
        System.out.println("Enter Salary            ");
        employ.setBasic(sc.nextDouble());
        System.out.println(employBal.updateEmployBal(employ));
    }
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("O P T I O N S");
            System.out.println("1. Add Employ");
            System.out.println("2. Show Employ");
            System.out.println("3. Search Employ");
            System.out.println("4. Delete Employ");
            System.out.println("5. Update Employ");
            System.out.println("6. Exit");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            switch(choice) {
                case 1 :
                    try {
                        addEmployMain();
                    } catch (EmployException e) {
                       System.err.println(e.getMessage());
                    }
                    break;
                case 2 :
                    showEmployMain();
                    break;
                case 3 :
                    searchEmployMain();
                    break;
                case 4 :
                    deleteEmployMain();
                    break;
                case 5 :
                    try {
                        updateEmployMain();
                    } catch (EmployException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 6 :
                    System.exit(0);
            }
        } while(choice !=6);
    }
}
