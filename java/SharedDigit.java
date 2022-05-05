package com.company;

public class SharedDigit {

    public static boolean hasSharedDigit (int num1, int num2) {

        if ((num1 < 10) || (num1 > 99) || (num2 < 10) || (num2 > 99)) {
            return false;
        }
        int num1Digit, num2Digit;
        int startNum2 = num2;
        while (num1 > 0) {
            num1Digit = num1 % 10;
            num2 = startNum2; // imp to reset num2 every time.
            while (num2 > 0) {
                num2Digit = num2 % 10;
                if (num1Digit == num2Digit) {
                    return true;
                }
                num2 = num2 / 10;
            }
            num1 = num1 / 10;
        }

        return false;
    }
}



