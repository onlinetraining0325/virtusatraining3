package com.java.mongo;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.Scanner;

public class AddEmployMain {
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

    // Convert Employ object into a MongoDB Document
    Document doc = new Document()
      .append("empno", employ.getEmpno())
      .append("name", employ.getName())
      .append("dept", employ.getDept())
      .append("desig", employ.getDesig())
      .append("basic", employ.getBasic());

    // Insert into MongoDB
    col.insertOne(doc);

    System.out.println("Employ record inserted successfully!");
  }
}
