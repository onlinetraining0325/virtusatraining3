package com.java.jdk8;

@FunctionalInterface
interface IExam {
    String examDetails(String name);

}

public class FunctionalInterfaceEx1 {
    public static void main(String[] args) {
        IExam obj1 = (name) -> "Taking MCQ Exam";
        IExam obj2 = (name) -> "Taking Practical Test";
        IExam obj3 = (name) -> "Taking Final Exam";

        System.out.println(obj1.examDetails("Shaili"));
        System.out.println(obj2.examDetails("Lokesh"));
        System.out.println(obj3.examDetails("Kratika"));
    }
}
