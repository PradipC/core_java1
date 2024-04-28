package org.example;

public class A {

    public static void main(String[] args) {
     // to call static method , we not require object
     // it will load the class , and static variable
     // initialize 1st , then static block execute
     // then it call m1 method
        B.m1();

          //B.m2();
        //B bVariable = new B();
        //bVariable.m2();

    // to call non static method , we require object
    // when we create object , then constructor will execute
    // and if we using param constructor , then it initialize non static variable
    // then it call m2 method
       B bVariable = new B(50);
       bVariable.m2();
    }



}
