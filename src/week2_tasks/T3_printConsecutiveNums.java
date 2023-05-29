package week2_tasks;

public class T3_printConsecutiveNums {

   public static void printNums(int N){

            for (int i = 1; i <= N; i++) {
                String result = "";

                if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                    result += "CodilityTestCoders";
                }
                if (i % 2 == 0) {
                    result += "Codility";
                }
                if (i % 3 == 0) {
                    result += "Test";
                }
                if (i % 5 == 0) {
                    result += "Coders";
                }
                if (result.equals(""))
                    System.out.println(i);
                System.out.println(result);
            }

        }

        public static void main(String[] args) {
        int N = 24;
        printNums(N);
    }
}






