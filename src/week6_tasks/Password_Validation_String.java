package week6_tasks;
/*
String -- Password Validation Task
1. Write a return method that can verify if a password is valid or not. requirements:
1. Password MUST be at least have 6 characters and should not contain space 2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns false

 */
public class Password_Validation_String {

        public static void main(String[] args) {
            String password = "Abc123@";
            boolean isValid = isValidPassword(password);
            System.out.println("Is the password valid? " + isValid);
        }

        public static boolean isValidPassword(String password) {
            // Check if password length is at least 6 characters and does not contain space
            if (password.length() < 6 || password.contains(" ")) {
                return false;
            }

            // Check if password contains at least one uppercase letter
            if (!password.matches(".*[A-Z].*")) {
                return false;
            }

            // Check if password contains at least one lowercase letter
            if (!password.matches(".*[a-z].*")) {
                return false;
            }

            // Check if password contains at least one special character
            // Special characters are defined using a regular expression pattern [!@#$%^&*(),.?\":{}|<>]
            if (!password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
                return false;
            }

            // Check if password contains at least one digit
            if (!password.matches(".*\\d.*")) {
                return false;
            }

            // If all requirements are met, the password is valid
            return true;
        }
    }



