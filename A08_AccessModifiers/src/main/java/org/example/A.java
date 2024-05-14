package org.example;

public class A {

    private void m1(){
        System.out.println("m1 private");
    }


    public void m2(){
        this.m1();
        System.out.println("m2 public");
    }

   void m3(){
        System.out.println("m3 default");
    }

    protected void m4(){
        System.out.println("m4 protected");
    }


}
