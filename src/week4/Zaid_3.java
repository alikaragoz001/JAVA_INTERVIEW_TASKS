package week4;

public class Zaid_3 {

    public static void main(String[] args) {

        /*
        String
        Remove Duplicates
        Write a return method that can remove the duplicated values from
                String
        Ex:
        removeDup (" AAABBBCCC")==> ABC

        System.out.println(removeDup("AAABBBCCC"));
        */

        System.out.println(removeDuplicates("AAAGGGBBCCCC"));

    }

        public static String removeDuplicates(String str) {

            String result = "";

            for (int i = 0; i < str.length(); i++) {

                char each = str.charAt(i);
                if (!result.contains("" + each)) {
                    result += each;
                }
            }
            return result;
        }




}
