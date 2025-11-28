package com.java.mongo.util;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

import java.util.ResourceBundle;

public class ConnectionHelper {
  public static MongoDatabase getConnection() {
    ResourceBundle rb = ResourceBundle.getBundle("db");
    String driver = rb.getString("driver");
    String db = rb.getString("db");
    MongoClient client = MongoClients.create(driver);

    MongoDatabase dbs = client.getDatabase(db);
    return dbs;
  }
}
