package week2_tasks;

import java.util.Scanner;

public class Zaid {
    public static void main(String[] args) {

        // swap two variable values without a third variable
        // task 1

        int a = 10;
        int b = 20;

        a = a + b; // 10 + 20 = 30 for a
        b = a - b; // 30 - 20 = 10 for b
        a = a - b; // 30 - 10 = 20 for a

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("----------------------------------");

        // write a program that can print the numbers between 1 ~ 100 that can be divisible by 3,5 and 15
        // task two
/*
        Scanner input =new Scanner(System.in);
        System.out.println("enter a number");
        int number = input.nextInt();

            if (number >= 1 && number <= 100) {

                if (number % 3 == 0 && number % 5 == 0 && number % 15 == 0) {
                    System.out.println("divisibleBy15 = " + number);
                } else if (number % 5 == 0 ) {
                    System.out.println("divisibleBy5 = " + number);
                }else{
                    System.out.println("divisibleBy3 = " + number);
                }
            }

        input.close();
            */


        System.out.println("------------------------------------");

        // task # 3
        int N = 24;
        printNumbers(N);



    }

    public static void printNumbers(int N) {

        for (int i = 1; i <= N; i++) {

            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                System.out.println("CodilityTestCoders");
            } else if (i % 2 == 0 && i % 3 == 0) {
                System.out.println("CodilityTest");
            } else if (i % 2 == 0 && i % 5 == 0) {
                System.out.println("CodilityCoders");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("testCoders");
            } else if (i % 2 == 0) {
                System.out.println("Codility");
            } else if (i % 3 == 0) {
                System.out.println("Test");
            } else if (i % 5 == 0) {
                System.out.println("Coders");
            } else {
                System.out.println(i);
            }
        }
    }



}
