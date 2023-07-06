package wek5_tasks;

public class T1_Write_return_method_that_can_reverse_String {

    /*
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA
 */
        public static void main(String[] args) {

            String word = "ABCD";
            System.out.println(reverseMethod(word));

        }

        public static String reverseMethod(String str){

            String result = "";

            for (int i = str.length()-1; i >= 0; i--) {
                result += str.charAt(i);
            }

            return result;    //  DCBA
        }
    }



