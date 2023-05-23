
import java.util.Scanner;

public class Ali {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("ODD OR EVEN IDENTIFIER");

        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        String evenOdd = (num % 2 == 0) ? "even" : "odd";

        System.out.println(num + " is " + evenOdd);

    }

    public static void FINRA() {

        String result = "";
        for (int i = 1; i < 101; i++) {

            if (i % 15 == 0) {
                result += "FINRA ";
            } else if (i % 5 == 0) {
                result += "RA ";
            } else if (i % 3 == 0) {
                result += "FIN ";
            } else {
                result += i + " ";
            }

        }

        System.out.println(result);

    }

    public static void dividingWithoutOperator(int num1, int num2) {
        int finalRes = 0;

        while (num1 >= num2) {
            num1 = num1 - num2;
            finalRes++;
        }

        System.out.println("Result: " + finalRes);
        System.out.println("Remainder: " + num1);

    }
}





