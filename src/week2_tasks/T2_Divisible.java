package week2_tasks;

public class T2_Divisible {
    public static void main(String[] args) {

        String divisibleBy3 = "";
        String divisibleBy5 = "";
        String divisibleBy15 = "";

        for (int i = 0; i <= 100 ; i++) {
            if (i % 15 == 0) {
                divisibleBy15 += i + " ";
            }else if (i % 3 == 0) {
                divisibleBy15 +=i + " ";
            }else if (i % 5 == 0) {
                divisibleBy5 += i + " ";
            }

        }

        System.out.println("Divisible By 3 = " + divisibleBy3);
        System.out.println("Divisible By 5 = " + divisibleBy5);
        System.out.println("Divisible By 15 = " + divisibleBy15);

    }
}
