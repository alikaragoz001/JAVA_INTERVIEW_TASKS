package week5_tasks;
/*
String -- Reverse
Write a return method that can reverse String Ex: Reverse("ABCD"); ==> DCBA
 */
public class T2_StringReverse {

    public static void main(String[] args) {

       String s = "ABCD";

        int lnt = s.length();  // getting the length of the string
        String rev = "";       // creating an empty string to store the reversed string

        for (int i = lnt - 1; i >= 0; i--) {   // iterate through the characters of the input string in reverse order

            rev = rev + s.charAt(i);    // append each character to the reversed string

        }

        System.out.println(rev);


        //   StringBuffer sf = new StringBuffer(s);
        //  System.out.println(sf.reverse());

    }

}
