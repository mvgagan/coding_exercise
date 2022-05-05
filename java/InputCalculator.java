package com.company;

import java.util.Scanner;

public class InputCalculator {


    public static void inputThenPrintSumAndAverage () {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int avg = 0;
        int count = 0;

        while (true) {
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int num = scanner.nextInt();
                sum = sum + num;scanner.nextLine();
                count++;
            } else {
                avg = (int) Math.round((double) sum/count);
                System.out.println("SUM = " + sum + " AVG = " + avg);
                scanner.nextLine();
                break;
            }
        }

        scanner.close();
    }
}

