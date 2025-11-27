package com.java.mongo;

import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import org.bson.Document;

import java.util.Scanner;

public class EmploySearchMain {
  public static void main(String[] args) {
    MongoClient client = MongoClients.create("mongodb://localhost:27017");

    MongoDatabase db = client.getDatabase("virtusa");
    MongoCollection<Document> col = db.getCollection("employ");
    int empno;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Employ Number   ");
    empno = sc.nextInt();

    Document doc = col.find(Filters.eq("empno", empno)).first();

    if (doc != null) {
      System.out.println("Empno : " + doc.getInteger("empno"));
      System.out.println("Name : " + doc.getString("name"));
      System.out.println("Department : " + doc.getString("dept"));
      System.out.println("Designation : " + doc.getString("desig"));
      System.out.println("Basic : " + doc.getInteger("basic"));
    } else {
      System.out.println("Employ Not Found...");
    }

    client.close();
  }
}
