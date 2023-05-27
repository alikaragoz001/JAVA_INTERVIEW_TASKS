package week2_tasks;

public class Konuralp {

    // Task 1: Swap Two Variables
    public static void swapTwoVariables(int num1, int num2){

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);

    }

    // Task 2: Divisible by 3, 5, 15
    public static void divisibleBy(){

        String divisible15 = "Divisible By 15: ";
        String divisible3 = "Divisible By 3: ";
        String divisible5 = "Divisible By 5: ";

        for (int n = 1; n <= 100; n ++){
            if (n % 15 == 0){
                divisible15 += n + " ";
            }
            else if (n % 3 == 0){
                divisible3 += n + " ";
            }
            else if (n % 5 == 0){
                divisible5 += n + " ";
            }
        }

        System.out.println(divisible15);
        System.out.println(divisible5);
        System.out.println(divisible3);
    }

    // Task 3: Print Consecutive Numbers
    public static void printConsecutiveNumbers(int N){

        for (int i = 1; i <= N; i++){

            if (i % 2 == 0){        // if a number is divisible by 2
                System.out.print("Codility");
                if (i % 3 == 0){    // if a number is divisible by 2 and 3
                    System.out.print("Test");
                }
                if (i % 5 == 0){    // if a number is divisible by 2 and 5 or 2, 3, and 5
                    System.out.print("Coders");
                }
                System.out.println();
            }
            else if (i % 3 == 0){   // if a number is divisible by 3
                System.out.print("Test");
                if (i % 5 == 0){    // if a number is divisible by 3 and 5
                    System.out.print("Coders");
                }
                System.out.println();
            }
            else if (i % 5 == 0){   // if a number is just divisible by 5
                System.out.println("Coders");
            }

            else{   // if a number isn't divisible by 2, 3, or 5
                System.out.println(i);
            }
            //System.out.println();
        }

    }

    public static void main(String[] args) {
        System.out.println("--------TASK 1----------");
        swapTwoVariables(5, 7);
        System.out.println("--------TASK 2----------");
        divisibleBy();
        System.out.println("--------TASK 3----------");
        printConsecutiveNumbers(30);
    }
}
