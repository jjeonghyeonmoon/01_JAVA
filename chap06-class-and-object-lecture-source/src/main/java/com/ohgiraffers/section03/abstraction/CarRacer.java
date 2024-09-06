package com.ohgiraffers.section03.abstraction;

public class CarRacer {

    Car car = new Car();

    public  void starUp(){
        car.startUp();
    }

    public  void stepAccelator(){
        car.go();
    }

    public  void stepBreak(){
        car.stop();
    }

    public  void turn0ff(){
        car.turn0ff();
    }

}
