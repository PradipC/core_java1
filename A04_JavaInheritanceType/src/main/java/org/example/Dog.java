package org.example;

public class Dog extends Animal  {

    int height;

    int weight;
    
    public Dog(){
        super(10,5);
        System.out.println("Dog Object creatd");
    }

    public void bark(){
        int height1 = super.height;
        int height2 = this.height;
        System.out.println("Animal can bark");
    }


}
