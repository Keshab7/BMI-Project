package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard;
        int userHeight, userWeight;
        double userHeightInMeters, userWeightInKilograms, userHeightSquared, BMI;
        keyboard = new Scanner(System.in);
        System.out.print("What is your height in inches?");
        userHeight = keyboard.nextInt();
        userHeightInMeters = userHeight/39.37;
        System.out.println(userHeightInMeters);
        System.out.println("What is your weight in pounds?");
        userWeight = keyboard.nextInt();
        userWeightInKilograms = userWeight/2.205;
        System.out.println(userWeightInKilograms);

        userHeightSquared = userHeightInMeters*userHeightInMeters;

        System.out.println(userHeightSquared);

        BMI = userWeightInKilograms/userHeightSquared;

        System.out.print("Your BMI is " + BMI);

    }
}
