package week3_tasks;

public class Zaid2 {
    public static void main(String[] args) {
        System.out.println(reverseNum(-34));
    }
//    Numbers -- Reverse negative number
//    Write a return method that can reverse digits of a negative number and return it as int
//    input: -35  output: -53
    public static String reverseNum(int num) {


        String num1 = Integer.toString(num);
        String result = "";

        for (int i = num1.length() - 1; i >= 1; i--) {
            result += num1.charAt(i);
        }
        return ("-" + result);
    }


}



