package com.java.thr;

class Subham extends Thread{

    Resource resource;

    Subham(Resource resource){
        this.resource=resource;
    }
    public void run(){
        resource.displayMsg("Subham");
    }
}

class Anusri implements Runnable{

    Resource resource;

    Anusri(Resource resource){
        this.resource = resource;
    }
    @Override
    public void run() {
        resource.displayMsg("Anusri");
    }
}

class Harsh extends Thread{

    Resource resource;
    Harsh(Resource resource){
        this.resource = resource;
    }

    @Override
    public void run() {
        resource.displayMsg("Harsh");
    }
}
class Resource {
    synchronized void displayMsg(String name) {
        System.out.print("Hello  " +name);
        try {
            Thread.sleep(1000);
            System.out.println(" How are You...!");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
public class SyncEx1 {
    public static void main(String[] args) {
        Resource resource = new Resource();
        Harsh harsh = new Harsh(resource);
        Subham subham = new Subham(resource);
        Anusri anusri = new Anusri(resource);
        Thread th1 = new Thread(subham);
        Thread th2 = new Thread(anusri);
        Thread th3 = new  Thread(harsh);

        th1.start();
        th2.start();
        th3.start();
    }
}
