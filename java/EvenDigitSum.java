package com.company;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {

        int sum = 0;
        if (number < 0) {
            return -1;
        } else {
            while (number > 0) {
                int digit = number % 10;
                if (digit % 2 == 0) {
                    sum = sum + digit;
                }
                number = number / 10;
            }
        }
        return sum;
    }
}
