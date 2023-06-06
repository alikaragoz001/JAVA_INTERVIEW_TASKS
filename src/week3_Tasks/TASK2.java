package week3_Tasks;

public class TASK2 {

    public static int reverseNegativeNumber(int number) {
        if (number >= 0) {
            return number;  // If the number is non-negative, return it as is
        }

        String numString = String.valueOf(number);
        StringBuilder reversedString = new StringBuilder(numString.substring(1)).reverse();
        int reversedNumber = Integer.parseInt(reversedString.toString());
        return -reversedNumber;
    }

    public static void main(String[] args) {
        int num = -35;
        int reversedNum = reverseNegativeNumber(num);
        System.out.println("Original Number: " + num);
        System.out.println("Reversed Number: " + reversedNum);
    }

}
//Original Number: -35
//Reversed Number: -53