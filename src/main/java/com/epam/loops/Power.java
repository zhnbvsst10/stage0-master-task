package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
        int val = 1;
        for (int i = 1; i <= power; i++) {
            val = numberToPrint * val;
        }
        System.out.println(val);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
