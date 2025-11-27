package com.java.mongo;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import org.bson.Document;

import java.util.Scanner;

public class UpdateEmployMain {
  public static void main(String[] args) {
    MongoClient client = MongoClients.create("mongodb://localhost:27017");

    MongoDatabase db = client.getDatabase("virtusa");
    MongoCollection<Document> col = db.getCollection("employ");
    Scanner sc = new Scanner(System.in);
    Employ employ = new Employ();
    System.out.println("Enter Employ Number  ");
    employ.setEmpno(sc.nextInt());
    System.out.println("Enter Employ Name  ");
    employ.setName(sc.next());
    System.out.println("Enter Employ Department  ");
    employ.setDept(sc.next());
    System.out.println("Enter Employ Designation  ");
    employ.setDesig(sc.next());
    System.out.println("Enter Employ Basic  ");
    employ.setBasic(sc.nextInt());

    col.updateOne(
      Filters.eq("empno", employ.getEmpno()),   // search condition
      Updates.combine(
        Updates.set("name", employ.getName()),
        Updates.set("dept", employ.getDept()),
        Updates.set("desig", employ.getDesig()),
        Updates.set("basic", employ.getBasic())
      )
    );
    System.out.println("Employ Record Updated Successfully...");
  }
}
