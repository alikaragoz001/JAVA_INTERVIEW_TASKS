package week1_tasks;

public class T2_DivideWOoperator {

    public static void dividingWithoutOperator(int num1, int num2) {
        int result = 0;

        while (num1 >= num2) {
            num1 = num1 - num2;
            result++;
        }

        System.out.println("Result: " + result);
        System.out.println("Remainder: " + num1);
    }
}
