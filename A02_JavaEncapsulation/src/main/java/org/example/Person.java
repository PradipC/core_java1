package org.example;

public class Person {

    // how to achieve encapsulation
    // -> 2 steps
       // 1. make all variables private
       // 2. define setter, getter to access those private variables
     private String name;

     private String address="India";

      public String getName() {
            return name;
      }

      public void setName(String name) {
            this.name = name;
      }
      public String getAddress() {
            return address;
      }

      public void setAddress(String address) {
            this.address = address;
      }
}
