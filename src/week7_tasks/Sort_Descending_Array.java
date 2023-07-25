package week7_tasks;

import java.util.Arrays;

/*
Sort Descending
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class Ex: int[] arr = {10,20,7, 8, 90};
arr = Sort(arr); ==> {90, 20, 10, 8, 7};
 */

public class Sort_Descending_Array {

    public static void main(String[] args) {
        int[] arr = {10, 20, 7, 8, 90};
        int[] sortedArr = sortDescending(arr);
        System.out.println(Arrays.toString(sortedArr));
    }

    // Method to sort the array in descending order
    public static int[] sortDescending(int[] numbers) {
        // Outer loop to traverse the array elements
        for (int i = 0; i < numbers.length; i++) {
            // Inner loop to compare the current element with the rest of the elements
            for (int j = i + 1; j < numbers.length; j++) {
                // Check if the current element is greater than the selected maximum
                // If true, swap the elements to bring the greater one to the front
                if (numbers[i] < numbers[j]) {
                    int tempInt = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tempInt;
                }
            }
        }
        // Return the sorted array in descending order
        return numbers;
    }
}

