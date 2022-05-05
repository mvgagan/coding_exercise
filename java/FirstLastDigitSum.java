package com.company;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit (int number) {

        if (number < 0) {
            return -1;
        } else {

            int lastDigit = number % 10;
            int firstDigit = 0;
            while (number > 0) {
                if (number < 10) {
                    firstDigit = number;
                    break;
                }
                number = number / 10;
            }

            return lastDigit + firstDigit;
        }
    }
}
