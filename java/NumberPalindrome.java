package com.company;

public class NumberPalindrome {

    public static boolean isPalindrome (int number) {

        if (number < 0) {
            number = number * -1;
        }
        int temp = number;
        int reverseNumber = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            reverseNumber = reverseNumber * 10;
            reverseNumber = reverseNumber + lastDigit;
            number = number / 10;
        }

        return temp == reverseNumber;
    }
}
