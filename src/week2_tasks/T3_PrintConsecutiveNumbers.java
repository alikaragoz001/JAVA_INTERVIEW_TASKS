package week2_tasks;
/*
Numbers -- print consecutive numbers
Write a function:
that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line. However, any number
divisible by 2, 3 or 5 should be replaced by the word Codility. Test or Coders respectively. Ifa number is divisible by more than
one of the numbers: 2,3 or 5. it should be replaced by a concatenation of the respective words Codility. Test and Coders in this
given order. For example, numbers divisible by both 2 and 3 should be replacée by CodilityTest and numbers divisible by all
three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.
For example, here is the output for N = 24:
1
Codility
Test
Codility
Coders
CodilityTest
7
Codility
Test
CodilityCoders
11
CodilityTest
13
Codility
TestCoders
Codility
17
 */
public class T3_PrintConsecutiveNumbers {
        public static void printConsecutiveNumbers(int N) {
            for (int i = 1; i <= N; i++) {
                if (i % 2 == 0) {
                    System.out.print("Codility"); // Divisible by 2, print "Codility"
                }
                if (i % 3 == 0) {
                    System.out.print("Test"); // Divisible by 3, print "Test"
                }
                if (i % 5 == 0) {
                    System.out.print("Coders"); // Divisible by 5, print "Coders"
                }
                if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
                    System.out.print(i); // Not divisible by 2, 3, or 5, print the number itself
                }
                System.out.println(); // Move to the next line
            }
        }

        public static void main(String[] args) {
            int N = 24;
            printConsecutiveNumbers(N);
        }
    }


