package week4_tasks;

public class T3_Remove_Duplicates {

    public static String removeDup(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);
            if (!result.contains("" + each)) {
                result += each;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(removeDup("AAABBBCCC"));   // prints ABC
    }
}

