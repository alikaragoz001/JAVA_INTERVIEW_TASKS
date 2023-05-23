package week1_tasks;

public class Konuralp {
    //Task 1
    public static String oddNEven(int num){
        // Even
        if (num % 2 == 0){
            return "Even";
        }
        // Odd
        return "Odd";
    }
    //Task 2
    public static int divideTwoNumbers(int num1, int num2){
        int quotient = 0; // final result

        while (num1 > 0){
            num1 -= num2;
            if (num1 >= 0){     // the result will be added by 1 everytime num1 is reduced by num2 until num1 becomes 0
                quotient ++;
            }
        }
        return quotient;
    }
    //Task 3
    public static String FINRA(int num){

        if (num % 15 == 0){     // if num is divisible by 3 and 5, or 15
            return "FINRA";
        }
        else if (num % 3 == 0){ // if num is only divisible by 3
            return "FIN";
        }
        else if (num % 5 == 0){  // if num is only divisible by 5
            return "RA";
        }
        return "" + num;    // if num isn't divisible by 3 or 5
    }


    public static void main(String[] args) {
        //oddNEven(7);
        System.out.println(oddNEven(0));
        System.out.println(divideTwoNumbers(28, 4));
        System.out.println(FINRA(45));
    }
}
