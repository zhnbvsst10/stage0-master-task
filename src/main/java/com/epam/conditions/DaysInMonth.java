package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {

        if (month == 1) {
            System.out.println(31);
        } else if ((month == 2) & (year % 4 == 0 )) {
            System.out.println(29);
        } else if ((month == 2) & (year % 4 > 0)) {
            System.out.println(28);
        } else if (month == 3)  {
            System.out.println(31);
        } else if (month == 4)  {
            System.out.println(30);
        } else if (month == 5)  {
            System.out.println(31);
        } else if (month == 6)  {
            System.out.println(30);
        } else if (month == 7)  {
            System.out.println(31);
        } else if (month == 8)  {
            System.out.println(31);
        } else if (month == 9)  {
            System.out.println(30);
        } else if (month == 10)  {
            System.out.println(31);
        } else if (month == 11)  {
            System.out.println(30);
        } else if (month == 12)  {
            System.out.println(31);
        } else {
            System.out.println("invalid date");
        }
        }

    }


