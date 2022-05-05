package com.company;

public class SumOddRange {

    public static boolean isOdd (int number) {

        if(number > 0) {
            if (number % 2 == 0) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static int sumOdd (int start, int end) {

        int sum = 0;
        if ((start > 0) && (end > 0)) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum = sum + i;
                }
            }
        } else {
            return -1;
        }
        if (start == end && start % 2 ==0) {
            return 0;
        } else if (start > end) {
            return -1;
        }
        return sum;
    }
}
