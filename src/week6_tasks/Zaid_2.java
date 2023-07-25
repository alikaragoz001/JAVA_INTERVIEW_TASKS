package week6_tasks;


import java.util.Scanner;

/*
Write a method that can find the maximum number from an int Array
 */
public class Zaid_2 {
    public static void main(String[] args) {

        int[] numbers = {5, 8, 2, 10, 3};
        int maximum = maxNum(numbers);
        System.out.println("The maximum number is: " + maximum);

    }
    public static int maxNum(int[] numbers){


        int maximum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }
        }

        return maximum;
    }

    }

