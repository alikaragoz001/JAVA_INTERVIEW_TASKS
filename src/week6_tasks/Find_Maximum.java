package week6_tasks;
/*
Array -- Find Maximum
Write a method that can find the maximum number from an int Array
 */
public class Find_Maximum {

    public static void main(String[] args) {
        // DO NOT TOUCH BELOW
//            Scanner input = new Scanner(System.in);
//            int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        int[] nums= {1, 33, 5, 7, 9,900,400000};

        //WRITE YOUR CODE BELOW
        int max = nums[0];
        for (int each : nums){
            if(each > max){
                max = each;
            }
        }
        System.out.println(max);
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


