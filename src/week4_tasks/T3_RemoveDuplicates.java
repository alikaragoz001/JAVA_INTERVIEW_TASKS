package week4_tasks;

import java.util.Scanner;

/*
String -- Remove Duplicates
Write a return method that can remove the duplicated values from
String
Ex: removeDup("AAABBBCCC") ==> ABC
 */
public class T3_RemoveDuplicates {

        public static String removeDup (String str){
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
            System.out.println(removeDup("AAAFFFIIIIIII"));
    }
    }

