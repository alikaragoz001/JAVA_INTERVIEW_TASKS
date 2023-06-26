package week2_tasks;
/*
Numbers-- Divisible by 3, 5, 15
Write a program that can print the numbers between 1-100 that can be divisible by 3, 5, and 15.
if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15' section
if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section
if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5' section
ex:
OutPut:
Divisible By 15 15 30 45 60 75 90
Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
Divisible By3 3 69 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 9699
 */
public class T2_DivisibleBy_3_5_15 {
        public static void main(String[] args) {
            // StringBuilder objects to store the numbers based on divisibility
            StringBuilder divisibleBy15 = new StringBuilder("Divisible By 15 ");
            StringBuilder divisibleBy5 = new StringBuilder("Divisible By 5 ");
            StringBuilder divisibleBy3 = new StringBuilder("Divisible By 3 ");

            // Loop through the numbers from 1 to 100
            for (int i = 1; i <= 100; i++) {
                if (i % 15 == 0) {
                    // If number is divisible by 15, append it to divisibleBy15
                    divisibleBy15.append(i).append(" ");
                } else if (i % 5 == 0) {
                    // If number is divisible by 5 but not by 15, append it to divisibleBy5
                    divisibleBy5.append(i).append(" ");
                } else if (i % 3 == 0) {
                    // If number is divisible by 3 but not by 15, append it to divisibleBy3
                    divisibleBy3.append(i).append(" ");
                }
            }

            // Print the numbers in their respective categories
            System.out.println(divisibleBy15);
            System.out.println(divisibleBy5);
            System.out.println(divisibleBy3);
        }
    }

/*
public class DivisibleNumbers {
    public static void main(String[] args) {
        String divisibleBy15 = "";
        String divisibleBy5 = "";
        String divisibleBy3 = "";

        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                divisibleBy15 += i + " ";
            } else {
                if (i % 5 == 0) {
                    divisibleBy5 += i + " ";
                }
                if (i % 3 == 0) {
                    divisibleBy3 += i + " ";
                }
            }
        }

        System.out.println("Divisible By 15 " + divisibleBy15);
        System.out.println("Divisible By 5 " + divisibleBy5);
        System.out.println("Divisible By 3 " + divisibleBy3);
    }
}

 */
