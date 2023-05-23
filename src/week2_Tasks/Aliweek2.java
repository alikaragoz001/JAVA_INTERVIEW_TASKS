package week2_Tasks;

import java.util.Scanner;

public class Aliweek2 {
    public static void main(String[] args) {
            // TASK #1
            int a = 10;
            int b = 20;

            a = a + b;
            b = a - b;
            a = a - b;

            System.out.println("a = " + a);
            System.out.println("b = " + b);

            System.out.println("--------");


        Scanner input = new Scanner(System.in);
        System.out.println("ENTER NUMBER");
        int numeral = input.nextInt();

        if (numeral >= 1 && numeral <= 100) {
            if (numeral % 3 == 0 && numeral % 5 == 0 && numeral % 15 == 0) {
                System.out.println("divisibleBy15 = " + numeral);
            } else if (numeral % 5 == 0 ) {
                System.out.println("divisibleBy5 = " + numeral);
            }else{
                System.out.println("divisibleBy3 = " + numeral);
            }
        }

        input.close();

        System.out.println("--------");


        int n = 24;
        printNumbers(n);
    }
    public static void printNumbers(int n) {

        for (int i = 1; i <= n; i++) {

            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                System.out.println("codilitytestcoders");
            } else if (i % 2 == 0 && i % 3 == 0) {
                System.out.println("codilitytest");
            } else if (i % 2 == 0 && i % 5 == 0) {
                System.out.println("codilitycoders");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("testcoders");
            } else if (i % 2 == 0) {
                System.out.println("codility");
            } else if (i % 3 == 0) {
                System.out.println("test");
            } else if (i % 5 == 0) {
                System.out.println("coders");
            } else {
                System.out.println(i);
            }
        }
    }
}