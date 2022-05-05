package com.company;

public class LastDigitChecker {

    public static boolean hasSameLastDigit (int num1, int num2, int num3) {

        if ((isValid(num1)) && (isValid(num2)) && (isValid(num3))) {

            int num1Last, num2Last, num3Last;
            num1Last = num1 % 10;
            num2Last = num2 % 10;
            num3Last = num3 % 10;
            return ((num1Last == num2Last) || (num2Last == num3Last) || (num3Last == num1Last));
        }
        return false;
    }

    public static boolean isValid (int number) {

        return (number >= 10) && (number <= 1000);
    }
}
