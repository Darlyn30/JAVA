package com.methods;

class Method {
    int carDoor;
    int wheelCar;
    void work(){
        System.out.println("my car has " + carDoor + " door "+" & "+ wheelCar + "WheelCar");
    }
}
// creating objects between methods
public class methods {
    public static void main(String[] args) {
        Method method = new Method(); // this line, initialize the object

        method.carDoor = 4;
        method.wheelCar = 4;
        method.work();
    }
}
