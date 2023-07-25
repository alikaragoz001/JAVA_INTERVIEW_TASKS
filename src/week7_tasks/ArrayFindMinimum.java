package week7_tasks;
/*
Array - Find Minimum
Write a method that can find the maximum number from an int Array
 */
public class ArrayFindMinimum {

        public static void main(String[] args) {
            // Example int array
            int[] numbers = {10, 5, 8, 3, 15};

            // Call the findMinimum method to get the minimum number from the array
            int minNumber = findMinimum(numbers);

            // Display the result
            System.out.println("Minimum number in the array: " + minNumber);
        }

        public static int findMinimum(int[] arr) {
            // Check if the array is not empty
            if (arr.length == 0) {
                throw new IllegalArgumentException("Array is empty. Cannot find minimum.");
            }

            // Initialize a variable to store the minimum number
            int min = arr[0];

            // Iterate through the array to find the minimum number
            for (int i = 1; i < arr.length; i++) {
                // Compare each element with the current minimum
                if (arr[i] < min) {
                    // Update the minimum if a smaller element is found
                    min = arr[i];
                }
            }

            // Return the minimum number
            return min;
        }
    }


