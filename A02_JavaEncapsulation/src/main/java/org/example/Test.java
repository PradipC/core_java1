package org.example;

public class Test {


    public static void main(String[] args) {

       Person person  = new Person();

      // System.out.println(person.address);

      // person.address = "AUS";

      // System.out.println(person.address);

       String addressResult  = person.getAddress();
       System.out.println(addressResult);

        person.setAddress("AUS");



        String addressResult2  = person.getAddress();
        System.out.println(addressResult2);

    }



}
