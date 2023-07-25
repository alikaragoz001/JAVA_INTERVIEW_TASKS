package week6_tasks;
/*
Array -- Find Maximum
Write a method that can find the maximum number from an int Array
 */
public class Find_Maximum {

    public static void main(String[] args) {
        // Sample array to find the maximum number
        int[] nums= {1, 33, 5, 7, 9, 900, 400000};

        // Initialize a variable to store the maximum number and set it to the first element of the array
        int max = nums[0];

        // Loop through each element of the array
        for (int each : nums){
            // Compare each element with the current maximum value
            // If the current element is greater than the current maximum, update the maximum value
            if(each > max){
                max = each;
            }
        }

        // After the loop, 'max' will hold the maximum number in the array
        System.out.println("Maximum number: " + max);
    }
}





/*
public class Find_Maximum {


    public static int findMaximum(int[] arr) {


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

 */


