package week7_tasks;



/*
Write a method that can find the maximum number from an int Array
 */
public class Zaid_1 {
    public static void main(String[] args) {

        int[] num = {10, 300, 40, 20, 50};
        System.out.println(maxNumber(num));
    }
    public static int maxNumber(int[] number){

        int max = number[0];


        for (int i = 0; i < number.length; i++) {
            if (number[i] > max){
                max = number[i];
            }
        }
        return max;

    }

}
