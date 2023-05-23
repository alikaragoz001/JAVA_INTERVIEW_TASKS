package week1_tasks;

public class Task_2 {
    //task2
    public static void dividingWithoutOperator(int num1, int num2) {
        int finalRes = 0;

        while (num1 >= num2) {
            if (num2 == 0) {
                finalRes = 0;
            } else {
                num1 = num1 - num2;
                finalRes++;
            }
        }
        System.out.println("Result: " + finalRes);
        System.out.println("Remainder: " + num1);
    }

    public static void main(String[] args) {
        //task2
        dividingWithoutOperator(10, 5);
    }

}
