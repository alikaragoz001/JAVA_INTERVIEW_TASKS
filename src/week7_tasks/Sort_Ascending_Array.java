package week7_tasks;

import java.util.Arrays;

/*
Array - Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};

 */
public class Sort_Ascending_Array {

    public static void main(String[] args) {

        int[] arr = {15, 4, 55, 5, 12};

        int[] sortedArr = sortAscending(arr);  // Call the sortAscending method to sort the array in ascending order

        System.out.println(Arrays.toString(sortedArr));  // Display the sorted array using Arrays.toString() method
    }

    public static int[] sortAscending(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {   // Outer loop: Select each element as the minimum one by one

            for (int j = i + 1; j < numbers.length; j++) {  // Inner loop: Find the actual minimum element in the remaining unsorted part
                // Check if the current element is smaller than the selected minimum
                // If true, swap the elements to bring the smaller one to the front
                if (numbers[i] > numbers[j]) {
                    // Temporary variable to hold the value during the swap
                    int tempInt = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tempInt;
                }
            }
        }
        return numbers;
    }
}




