package com.automobile.wheeler;
import com.automobile.Vehicle;
public class Hero extends Vehicle {
    private String modelName;
    private String registrationNumber;
    private String ownerName;
    private int speed;
    public Hero(String modelName, String regNo, String ownerName, int speed) {
        this.modelName = modelName;
        this.registrationNumber = regNo;
        this.ownerName = ownerName;
        this.speed = speed;
    }
    public int getSpeed() {
        return speed;
    }
    public void radio() {
        System.out.println("Radio is playing in Hero");
    }
    public String getModelName() {
        return modelName;
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public String getOwnerName() {
        return ownerName;
    }
}


