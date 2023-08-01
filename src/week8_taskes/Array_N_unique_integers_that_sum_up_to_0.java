package week8_taskes;

import java.util.Arrays;

public class Array_N_unique_integers_that_sum_up_to_0 {

    public static int[] generateZeroSumArray(int N) {
        if (N < 2 || N > 99) {
            throw new IllegalArgumentException("N should be between 2 and 99 (exclusive).");
        }

        // Calculate the common difference between elements
        int commonDifference = N % 2 == 0 ? 1 : 2;

        // Calculate the first element such that the last element will be -firstElement
        int firstElement = -((N - 1) / 2) * commonDifference;

        // Generate the array
        int[] zeroSumArray = new int[N];
        for (int i = 0; i < N; i++) {
            zeroSumArray[i] = firstElement + i * commonDifference;
        }

        return zeroSumArray;
    }

    public static void main(String[] args) {
        int N = 4;
        int[] result = generateZeroSumArray(N);
        System.out.println(Arrays.toString(result)); // Output: [0, -2, 2, 4]
    }
}
