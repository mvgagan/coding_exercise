package com.company;

public class DiagonalStar {

    public static void printSquareStar (int number) {

        if (number < 5) {
            System.out.println("Invalid Value");
        }


    }
}

//public class DiagonalStar {
//    public static void printSquareStar(int number) {
//
//        if(number < 5){
//            System.out.println("Invalid Value");
//        } else {
//
//            for(int i = 1; i <= number; i++) { // i = rows
//                for(int j = 1; j <= number; j++) { // j = columns
//
//                    if(i == 1 || i == number || j == 1 || j == number || j == i || i + j == number + 1) {
//                        System.out.print("*");
//                    } else {
//                        System.out.print(" ");
//                    }
//                }
//                System.out.println();
//            }
//        }
//    }
//}