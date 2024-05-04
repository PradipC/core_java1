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

        // method overiding + Runtime Polymorphism

        RbiBank bank = new HdfcBank();
        bank.getRateOfInterest();
       // bank.getName();








    }



}
