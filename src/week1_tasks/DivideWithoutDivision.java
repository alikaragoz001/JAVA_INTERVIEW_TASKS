package week1_tasks;

public class DivideWithoutDivision {


    public static void divideWithoutDivision(int dividend, int divisor) {
        int quotient = 0;
        int remainder = dividend;

        while (remainder >= divisor) {
            remainder -= divisor;
            quotient++;
        }

        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }



    public static void main(String[] args) {

        divideWithoutDivision(40,2);


    }
}