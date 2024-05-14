package org.example;

public class RbiBank {

     public void getRateOfInterest(){
         System.out.println("we will give this time 7.8 roi");
     }

     public static void getBalance(){
         System.out.println("balance is 1 crode");
     }



     // Method overloading or compile time
     public void getCustomerAccountDetails(String accId){
         System.out.println("This is Madhav account and acc id is "+accId);
     }


  public void m1(String x){}

    private String m1(Integer x){return "a";}

    protected void m1(Integer x,Integer y){}


}
