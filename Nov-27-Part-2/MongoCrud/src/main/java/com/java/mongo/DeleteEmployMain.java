package com.java.mongo;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;

import java.util.Scanner;

public class DeleteEmployMain {
  public static void main(String[] args) {
    MongoClient client = MongoClients.create("mongodb://localhost:27017");
    MongoDatabase db = client.getDatabase("virtusa");
    MongoCollection<Document> col = db.getCollection("employ");
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Employ Number  ");
    int empno = sc.nextInt();
    col.deleteOne(Filters.eq("empno", empno));
    System.out.println("*** Employ Record Deleted ***");
    client.close();

  }
}
