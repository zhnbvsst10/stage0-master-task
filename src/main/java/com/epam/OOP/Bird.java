package com.epam.OOP;

public class Bird extends Animal{
    private static String color;
    private static int numberOfPaws;
    private static boolean hasFur;

    public Bird() {
        // super("blue", 2, false);
        super(color, numberOfPaws, hasFur);
        Bird.color = "blue";
        Bird.numberOfPaws = 2;
        Bird.hasFur = false;
    }
    @Override
    public String getDescription() {
            String paw;
            String fur;
            if (Bird.hasFur == true) {
                fur = "a";
            } else {
                fur = "no";
            }
    
            if (Bird.numberOfPaws == 1) {
                paw = "paw";
            } else {
                paw = "paws";
            }
    
            return "This animal is mostly " + Bird.color + ". It has " + Bird.numberOfPaws + " " + paw + " and " + fur + " fur. Moreover, it has 2 wings and can fly.";
    
    }

}
