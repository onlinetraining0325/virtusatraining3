package org.example;

public class First extends Thread {

    private Resource resource1;
    private Resource resource2;

    public First(Resource resource1, Resource resource2) {
        this.resource1 = resource1;
        this.resource2 = resource2;
    }

    @Override
    public void run() {
        resource1.test1(resource2);
    }
}
