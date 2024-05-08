package org.example;

public class HdfcBank extends RbiBank {

    @Override
    public void getRateOfInterest(){
        System.out.println("we will give this time 6.4 roi");
    }

    @Override
    public void getCustomerAccountDetails(String accId){
        System.out.println("This is Madhav account and acc id is "+accId);
    }

    public void getCustomerAccountDetails(String mobNumber , String email){
        System.out.println("This is Madhav account and acc id is "+mobNumber+ " and email : "+email);
    }

    public void getCustomerAccountDetails(Integer pinCode){
        System.out.println("all customer of this Area : "+pinCode);
    }



}
