package week5_tasks;
/*
String -- Reverse
Write a return method that can reverse String Ex: Reverse("ABCD"); ==> DCBA
 */
public class T2_StringReverse {

    public static String reverseString(String string) {

        String reversed = "";                          // creating an empty string to store the reversed string

        int lnt = string.length();                     // getting the length of the string

        for (int i = lnt - 1; i >= 0; i--) {            // iterate through the characters of the input string in reverse order
            reversed = reversed + string.charAt(i);      // append each character to the reversed string
        }
        return reversed;
    }

    public static void main(String[] args) {


        System.out.println("reverseString(\"ABCD\") = " + reverseString("ABCD"));


        StringBuffer easyReverse = new StringBuffer("ABCD");
        System.out.println("Reverse using StringBuffer = "  + easyReverse.reverse());

    }

}
