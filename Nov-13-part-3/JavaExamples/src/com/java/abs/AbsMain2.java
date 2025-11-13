package com.java.abs;

public class AbsMain2 {

    public static void main(String[] args) {
        Animal[] arr = new Animal[] {
          new Lion(), new Cow()
        };

        for(Animal animal : arr){
            animal.name();
            animal.type();
        }
    }
}
