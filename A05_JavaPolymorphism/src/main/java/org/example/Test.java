package org.example;

public class Test {

    public static void main(String[] args) {

       /*RbiBank bank = new RbiBank();
       bank.getRateOfInterest();
       bank.getCustomerAccountDetails("AT123455");

        System.out.println("********");
        AxisBank bank1 = new AxisBank();
        bank1.getRateOfInterest();
        bank1.getCustomerAccountDetails("BN235");

        System.out.println("********");
        HdfcBank bank2 = new HdfcBank();
        bank2.getRateOfInterest();
        bank2.getCustomerAccountDetails("BN235");
*/

        // method overriding or Runtime Polymorphism

        RbiBank bank = new HdfcBank();
        bank.getRateOfInterest();
        bank.getBalance();

        HdfcBank.getBalance();



       // bank.getCustomerAccountDetails(1234);

       // bank.getName();


 // sumarry:
  //  Method Overriding :
     //1. Method name must be same in super and sub class
     //2. Parameter list must not be change
     //3. Return type must bot be change
     //4. Access modifier must be same or less restrictive


   // Method overloading
    // 1. Method name must be same in same class
    // 2. Paramater list must be change
    // 3 . Return type can be change
    // 4. Access modifier you are allow to change







    }



}
