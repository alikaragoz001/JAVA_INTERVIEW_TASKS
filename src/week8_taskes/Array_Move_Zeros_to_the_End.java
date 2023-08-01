package week8_taskes;

public class Array_Move_Zeros_to_the_End {


    public static void moveZerosToEnd(int[] nums) {
        int nonZeroIndex = 0;

        // Traverse the array and move non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }

        // Fill the remaining elements with zeros
        while (nonZeroIndex < nums.length) {
            nums[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 3, 0, 4, 0};
        moveZerosToEnd(arr);
        System.out.println(java.util.Arrays.toString(arr)); // Output: [1, 2, 3, 4, 0, 0, 0, 0]
    }
}

