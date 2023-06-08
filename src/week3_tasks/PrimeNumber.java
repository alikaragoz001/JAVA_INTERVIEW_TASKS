package week3_tasks;

public class PrimeNumber {

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        boolean[] isComposite = new boolean[number + 1];

        for (int i = 2; i * i <= number; i++) {
            if (!isComposite[i]) {
                for (int j = i * i; j <= number; j += i) {
                    isComposite[j] = true;
                }
            }
        }

        return !isComposite[number];
    }
}
