package com.java.intf;

interface IFlight {
    void idProof();
    void ticket();
}

class Asrita implements IFlight {

    @Override
    public void idProof() {
        System.out.println("Id Proof Asritha Passport");
    }

    @Override
    public void ticket() {
        System.out.println("Economy Ticket is there");
    }
}

class Meghana implements IFlight {

    @Override
    public void idProof() {
        System.out.println("Id Proof Meghana Drivinig Liscece");
    }

    @Override
    public void ticket() {
        System.out.println("Execute Class Ticket is there");
    }
}

class Harsh implements IFlight {

    @Override
    public void idProof() {
        System.out.println("Id Proof Harsh Aadhar");
    }

    @Override
    public void ticket() {
        System.out.println("Business Class Ticket is there");
    }
}
public class Example1 {
    public static void main(String[] args) {
        IFlight[] arr = new IFlight[] {
          new Harsh(), new Asrita(),  new Meghana()
        };

        for(IFlight e : arr){
            e.idProof();
            e.ticket();
        }
    }
}
