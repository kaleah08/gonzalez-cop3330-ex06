package exercise;

/*UCF COP3330 Fall 2021 Assignment 1 Solution
Copyright 2021 Kaleah Gonzalez */

import java.util.Calendar;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

       Scanner input = new Scanner(System.in);
       System.out.print("What is your current age? ");
       String s = input.next();
       int age = Integer.parseInt(s);

       System.out.print("At what age would you like to retire? ");
       String retire = input.next();
       int retireAge = Integer.parseInt(retire);

       int year = Calendar.getInstance().get(Calendar.YEAR);
       int retireYear = retireAge - age;

       System.out.println("You have " + (retireAge - age) + " years left until you can retire." + "\n" + "It's " + year + ", so you can retire in " + (year + retireYear) + ".");
    }
}
