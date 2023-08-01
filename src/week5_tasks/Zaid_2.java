package week5_tasks;
/*
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA
 */
public class Zaid_2 {
    public static void main(String[] args) {

        String word = "cat";
        System.out.println(reverseMethod(word));

    }

    public static String reverseMethod(String str){

        String result = "";

        for (int i = str.length()-1; i >= 0; i--) {
            result += str.charAt(i);
        }

        return result;
    }
}
