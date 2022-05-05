package com.company;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor (int first, int second) {

        if ((first < 10) || (second < 10)) {
            return -1;
        }

        int divisor, big, small;
        big = Math.max(first,second);
        small = Math.min(first, second);
        divisor = small;
        while (divisor > 0) {
            if ((big % divisor == 0) && (small % divisor == 0)) {
                return divisor;
            }
            divisor--;
        }
        return -1;
    }
}
