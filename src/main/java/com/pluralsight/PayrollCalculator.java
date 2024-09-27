package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {

    public static void main(String[] args) { //static is for members/properties directly inside class

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Name");
        String Name = scanner.nextLine();
        //return Name;

        System.out.println("Enter number of hours you worked in this pay period");
        float hours = scanner.nextFloat(); //result and variable type need to match ex float n float
        //return hours;

        System.out.println("Enter your pay rate");
        float rate = scanner.nextFloat();
        //return rate;

        //hours x rate = gross pay
        float gpay = hours * rate;

        System.out.println("Your name is "+Name);
        System.out.println("You worked "+ hours +" this week");
        System.out.println("At a pay rate of "+ rate + " dollars per hour");
        System.out.println("Your gross pay is "+ gpay);
    }
}
