package org.example;

public class BMW extends CarAC  implements Car  {


    @Override
    public void startEngine() {
        System.out.println("bmw started");
    }

    @Override
    public void stopEngine() {
        System.out.println("bmw stoped");
    }

    public void changeTheGear(){
        System.out.println("bmw changing the gear");
    }




}
