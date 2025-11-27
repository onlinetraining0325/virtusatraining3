package com.java.mongo;

import com.mongodb.client.MongoClient;
import com.mongodb.client.*;
import org.bson.Document;

public class EmployShowMain {
  public static void main(String[] args) {
    MongoClient client = MongoClients.create("mongodb://localhost:27017");

    MongoDatabase db = client.getDatabase("virtusa");
    MongoCollection<Document> col = db.getCollection("employ");

//    for (Document d : col.find()) {
//      System.out.println(d.toJson());
//    }

    for (Document d : col.find()) {
      System.out.println("Empno : " + d.getInteger("empno"));
      System.out.println("Name : " + d.getString("name"));
      System.out.println("Department : " + d.getString("dept"));
      System.out.println("Designation : " + d.getString("desig"));
      System.out.println("Basic : " + d.getInteger("basic"));
      System.out.println("----------------------------");
    }



  }
}
