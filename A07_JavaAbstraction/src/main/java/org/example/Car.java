package org.example;

public interface Car {

// it we using to just declare methods
// we not define the logic in Interface
// we define the logic in there implemented sub classes


     void startEngine();

     void stopEngine();

     void changeTheGear();
    // public void moveToTheLeft();


     default void m1(){
          System.out.println("this is m1 method");
     }

     static void m2(){
          System.out.println(" this is m2 method");
     }





}
