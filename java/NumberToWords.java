package com.company;

public class NumberToWords {

    public static void numberToWords (int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int num = reverse(number);

        for ( int i = 0; i < getDigitCount(number); i++) {

            switch (num % 10) {
                case 0:
                    System.out.println("Zero");
                    break;

                case 1:
                    System.out.println("One");
                    break;

                case 2:
                    System.out.println("Two");
                    break;

                case 3:
                    System.out.println("Three");
                    break;

                case 4:
                    System.out.println("Four");
                    break;

                case 5:
                    System.out.println("Five");
                    break;

                case 6:
                    System.out.println("Six");
                    break;

                case 7:
                    System.out.println("Seven");
                    break;

                case 8:
                    System.out.println("Eight");
                    break;

                case 9:
                    System.out.println("Nine");
                    break;

                default:
                    break;
            }
            num = num / 10;
        }
        System.out.println();
    }

    public static int reverse (int number) {

        int rev = 0;
        int num = number;
        if (number < 0) {
            number = number * -1;
        }
        while (number > 0) {
            int rem = number % 10;
            rev = rev * 10 + rem;
            number = number / 10;
        }
        if (num < 0) {
            return rev * -1;
        } else {
            return rev;
        }
    }

    public static int getDigitCount (int number) {

        if (number < 0) {
            return -1;
        }

        int count = 1;
        while (number > 9) {
            number /= 10;
            count = count + 1;
        }
        return count;
    }
}
