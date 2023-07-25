package week6_tasks;


import java.util.Scanner;

/*
Write a return method that can verify if a password is valid or not.
requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
-if all requirements above are met,
the method returns true, otherwise returns false
 */
public class Zaid_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a valid Password: ");
        String password = input.nextLine();


        if (passwordVerification(password)) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("PASSWORD IS INVALID, PLEASE TRY AGAIN.");
        }

        input.close();
    }

    public static boolean passwordVerification(String passWord) {

        if (passWord.length() < 6 || passWord.contains(" ")) {
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialChar = false;
        boolean hasDigit = false;

        // here we are converting the string to char since Strings are immutable
        // and go through each char one by one to check req
        for (char ch : passWord.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else {
                hasSpecialChar = true;
            }
        }


        return hasUpperCase && hasLowerCase && hasSpecialChar && hasDigit;
    }

}
