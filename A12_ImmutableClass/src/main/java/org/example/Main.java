package org.example;

public class Main {
    public static void main(String[] args) {

    // Q. Create Employee as Immutable
    // Once you create Employee class Object ,
    // then no one can modify it


// Rule 1: If you want to make your class as
  // Immutable , then define class as Final
  // so no child classes will able to modify it

     System.out.println("***  RULE 1 ****");
    Developer developer = new Developer();
    developer.empId = 101;
    developer.name = "madhav";

    System.out.println(developer);
    System.out.println(developer.hashCode());
    developer.name = "pradip";


    System.out.println(developer);
    System.out.println(developer.hashCode());


    System.out.println("***  RULE 2 ****");

// Rule 2 : Make variables as Private
   /* Employee employee = new Employee();
    employee.empId = 110;
    employee.name = "sachin";
    System.out.println(employee);
    System.out.println(employee.hashCode());


     employee.name = "dhoni";
    System.out.println(employee);
    System.out.println(employee.hashCode());*/

        System.out.println("***********");

// Rule 3 : Remove setters method , so no one will modify the values

/*
      Employee employee = new Employee();
       *//* employee.setEmpId(101);
        employee.setName("sachin");*//*
        System.out.println(employee);
        System.out.println(employee.hashCode());


      *//*  employee.setName("dhoni");*//*
        System.out.println(employee);
        System.out.println(employee.hashCode());*/


// Rule 4 : Create the Param constructor and Initialize values in that
    // so if anyone want to modify , then always they need to create new Object
        // But they cant modify existing Object

/*

      Employee employee = new Employee(101,"sachin");
        System.out.println(employee);
        System.out.println(employee.hashCode());


        Employee employee1 = new Employee(101,"dhoni");
        System.out.println(employee1);
        System.out.println(employee1.hashCode());

*/


// Rule 5 - If our Immutable class contains any Object ( e.g Address )
     // so if anyone want that Object , then dont share current Employee class Address Object
     // share the new Address Object , so if anyone want to update the Address Object
     // then our Employee class will not modify


        Address address = new Address();
        address.setStreetName("Lane 10");
        address.setCity("Mumbai");


        Employee employee = new Employee(101,"sachin" , address);
        System.out.println(employee);

        int empIdValue = employee.getEmpId();
        System.out.println(empIdValue);

       String nameValue =  employee.getName();
        System.out.println(nameValue);

       Address addressValue  = employee.getAddress();
        System.out.println(addressValue);


        addressValue.setCity("delhi");
        addressValue.setStreetName("Lane 20");


        System.out.println(employee);



    }
}