package week2_tasks;

import java.util.Scanner;

public class Zaid_2 {
    public static void main(String[] args) {


        // write a program that can print the numbers between 1 ~ 100 that can be divisible by 3,5 and 15
        // task two

        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int number = input.nextInt();

        if (number >= 1 && number <= 100) {

            if (number % 3 == 0 && number % 5 == 0 && number % 15 == 0) {
                System.out.println("divisibleBy15 = " + number);
            } else if (number % 5 == 0) {
                System.out.println("divisibleBy5 = " + number);
            } else {
                System.out.println("divisibleBy3 = " + number);
            }
        }

        input.close();
    }
}