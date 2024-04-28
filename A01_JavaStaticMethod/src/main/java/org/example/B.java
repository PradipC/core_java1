package org.example;

public class B {

    static int a = 20 ;
    int x = 10;
    int y = 10;

    static {
        System.out.println("static block - A is :"+a);
      //  System.out.println("static block - X is :"+x);

    }


    public B(){
        System.out.println("This is B constructor - It execute when we create Object");
    }

    public B(int xInit){
        System.out.println("This is B non param constructor - It execute when we create Object with param ");
        this.x  = xInit;
    }


    public B(int xInit, int yInit){
        System.out.println("This is B non param constructor - It execute when we create Object with param ");
        this.x  = xInit;
        this.y  = yInit;
    }


    public static void m1(){
        System.out.println("This is B class - m1 static method");
    }

    public void m2(){
        System.out.println("This is B class - m2 non-static method and X is :"+x);
    }



}
