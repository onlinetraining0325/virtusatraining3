package com.java.abs;

public class AbsMain1 {

    public static void main(String[] args) {
        Training[] arr = new Training[] {
          new Anusri(),new Harsh(),new Subham()
        };

        for(Training t:arr){
            t.name();
            t.email();
        }
    }
}
