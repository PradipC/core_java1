package org.example;

public class Audi extends CarAC implements Car  {

    public void startEngine(){
        System.out.println("start engine ");
    }


    public void stopEngine(){
        System.out.println("stop engine");
    }

    @Override
    public void changeTheGear() {
        System.out.println("audi change the gear execution");
    }






}
