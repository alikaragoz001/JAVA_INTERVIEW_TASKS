package week4_tasks;

public class T3_RemoveDuplicates {
    public static String removeDup (String str ) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (result.indexOf(String.valueOf(ch)) == -1){
                result.append(ch);
            }

        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDup("AAABBBCCC"));
    }
}
