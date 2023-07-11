package week6_tasks;

public class T2_Array_Find_Maximum {


    public static int findMaxNumber(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("The array must not be empty or null.");
        }

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }



    public static void main(String[] args) {
        int[] numbers = {10, 5, 8, 15, 2, 18, 27};

        int maxNumber = findMaxNumber(numbers);
        System.out.println("maxNumber = " + maxNumber);

    }




}

/*

In this example, the findMaxNumber method takes an array of integers (numbers) as input. It initializes the max variable with the first element of the array. Then, it iterates through the remaining elements of the array, comparing each element with the current maximum (max) and updating max if a larger element is found.

The method throws an IllegalArgumentException if the array is empty or null, indicating that the array must contain at least one element.

The main method demonstrates the usage of the findMaxNumber method by passing a sample array ({10, 5, 8, 3, 15, 2}) and printing the resulting maximum number

 */