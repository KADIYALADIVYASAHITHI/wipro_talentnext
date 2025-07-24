package com.automobile.def;

import com.automobile.wheeler.Hero;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero("Splendor+", "AP01AB1234", "Ravi Kumar", 65);

        System.out.println("Model Name: " + hero.getModelName());
        System.out.println("Registration Number: " + hero.getRegistrationNumber());
        System.out.println("Owner Name: " + hero.getOwnerName());
        System.out.println("Speed: " + hero.getSpeed());
        hero.radio();
    }
}
