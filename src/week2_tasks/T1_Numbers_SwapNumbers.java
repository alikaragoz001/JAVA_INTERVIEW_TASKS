package week2_tasks;
/*
Swap two variable's values without using the third variable
 */
public class T1_Numbers_SwapNumbers {
        public static void swapVariables(int a, int b) {
            System.out.println("Before swapping:");
            System.out.println("a = " + a);
            System.out.println("b = " + b);

            a = a + b; // Add the values of 'a' and 'b' and store the result in 'a'
            b = a - b; // Subtract the original value of 'b' from the new value of 'a' and store it in 'b'
            a = a - b; // Subtract the original value of 'a' from the new value of 'b' and store it in 'a'

            System.out.println("After swapping:");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }

        public static void main(String[] args) {
            int num1 = 10;
            int num2 = 20;

            swapVariables(num1, num2);
        }
    }


