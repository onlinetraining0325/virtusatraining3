package com.java.mongo.dao;

import com.java.mongo.model.Employ;
import com.java.mongo.util.ConnectionHelper;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class EmployDaoImpl implements EmployDao {

  MongoDatabase db;
  @Override
  public List<Employ> showEmployDao() {
     db = ConnectionHelper.getConnection();
    MongoCollection<Document> col = db.getCollection("employ");
    List<Employ> employList = new ArrayList<Employ>();
    FindIterable<Document> list = col.find();
    for (Document d : list) {
      Employ emp = new Employ();
      emp.setEmpno(d.getInteger("empno"));
      emp.setName(d.getString("name"));
      emp.setDept(d.getString("dept"));
      emp.setDesig(d.getString("desig"));
      emp.setBasic(d.getInteger("basic"));
      employList.add(emp);
    }
    return employList;
  }

  @Override
  public Employ searchEmployDao(int empno) {
    db = ConnectionHelper.getConnection();
    MongoCollection<Document> col = db.getCollection("employ");
    Document query = col.find(new Document("empno", empno)).first();
    if (query == null) {
      return null;
    }
    Employ emp = new Employ();
    emp.setEmpno(empno);
    emp.setName(query.getString("name"));
    emp.setDept(query.getString("dept"));
    emp.setDesig(query.getString("desig"));
    emp.setBasic(query.getInteger("basic"));
    return emp;
  }

  @Override
  public String addEmployDao(Employ employ) {
    db = ConnectionHelper.getConnection();
    MongoCollection<Document> col = db.getCollection("employ");
    Document doc = new Document();
    doc.put("empno", employ.getEmpno());
    doc.put("name", employ.getName());
    doc.put("dept", employ.getDept());
    doc.put("desig", employ.getDesig());
    doc.put("basic", employ.getBasic());
    col.insertOne(doc);
    return "Employ Record Inserted...";
  }

  @Override
  public String updateEmployDao(Employ employ) {
    db = ConnectionHelper.getConnection();
    MongoCollection<Document> col = db.getCollection("employ");
    col.updateOne(
      Filters.eq("empno", employ.getEmpno()),   // search condition
      Updates.combine(
        Updates.set("name", employ.getName()),
        Updates.set("dept", employ.getDept()),
        Updates.set("desig", employ.getDesig()),
        Updates.set("basic", employ.getBasic())
      )
    );
    return "Employ Record Updated...";
  }

  @Override
  public String deleteEmployDao(int empno) {
    db = ConnectionHelper.getConnection();
    MongoCollection<Document> col = db.getCollection("employ");
    col.deleteOne(Filters.eq("empno", empno));
    return "Employ Record Deleted...";
  }
}
