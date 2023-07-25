package week6_tasks;

public class Find_Maximum {

    /*
    Array -- Find Maximum
    Write a method that can find the maximum number from an int Array
     */
        public static int findMaximum(int[] arr) {

            if (arr == null || arr.length == 0) {
                throw new IllegalArgumentException("Array is empty or null");    // Check if the array is empty or null
            }

            int max = arr[0];   // Assume the first element as the maximum value


            for (int i = 1; i < arr.length; i++) {       // Loop through the array starting from the second element

                if (arr[i] > max) {    // Compare the current element with the current maximum value
                    max = arr[i];       // If the current element is greater, update the maximum value
                }
            }
            return max;    // Return the maximum value found in the array
        }

        public static void main(String[] args) {

            int[] numbers = { 4, 9, 2, 6, 14};
            int maxNumber = findMaximum(numbers);
            System.out.println("Maximum number: " + maxNumber);

        }

    }
