package com.epam.OOP;

public class Animal {
    
    private static String color;
    private static int numberOfPaws;
    private static boolean hasFur;

    public Animal(String color, int value, boolean furs) {
        Animal.color = color;
        Animal.numberOfPaws = value;
        Animal.hasFur = furs;
    }

 
    public String getDescription() {
        String paw;
        String fur;
        if (Animal.hasFur == true) {
            fur = "a";
        } else {
            fur = "no";
        }

        if (Animal.numberOfPaws == 1) {
            paw = "paw";
        } else {
            paw = "paws";
        }

        return "This animal is mostly " + Animal.color + ". It has " + Animal.numberOfPaws + " " + paw + " and " + fur + " fur.";

    }

    
}

