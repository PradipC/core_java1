package org.example;

public class Animal {

    int height;

    int weight;


    public Animal(){
        super();
        System.out.println("Animal Object creatd");
    }

    public Animal(int heightVar, int weightVar  ){
        this.height = heightVar;
        this.weight = weightVar;
        System.out.println("Animal Object creatd with Paramemter");

    }



      public void eat(){
          System.out.println("Animal can eat");
      }

     public void sleep(){
        System.out.println("Animal can sleep");
     }



}
