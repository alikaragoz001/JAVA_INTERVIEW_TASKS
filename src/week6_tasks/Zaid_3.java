package week6_tasks;
/*
Write a method that can return the sum of the digits in a string
 */
public class Zaid_3 {
    public static void main(String[] args) {

        String input = "Hello5280Colorado";
        int sum = sumNumber(input);
        System.out.println("Sum of the digit in the word is = " + sum);

    }

    public static int sumNumber(String digits){
        int sum = 0;

        for (int i = 0; i < digits.length(); i++) {
            char c = digits.charAt(i);
            if (Character.isDigit(c)) {
                int digit = Character.getNumericValue(c);
                sum += digit;
            }
        }

        return sum;
    }
}
