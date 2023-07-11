package week6_tasks;

public class T1StringPasswordValidationTask {


    public static boolean validatePassword(String password) {
        // Requirement 1: Password length should be at least 6 characters
        if (password.length() < 6) {
            return false;
        }

        // Requirement 2: Password should contain at least one uppercase letter
        boolean hasUppercase = false;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                hasUppercase = true;
                break;
            }
        }
        if (!hasUppercase) {
            return false;
        }

        // Requirement 3: Password should contain at least one lowercase letter
        boolean hasLowercase = false;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                hasLowercase = true;
                break;
            }
        }
        if (!hasLowercase) {
            return false;
        }

        // Requirement 4: Password should contain at least one special character
        String specialChars = "!@#$%^&*(),.?:{}|<>";  // how to add " to special characters
        boolean hasSpecialChar = false;
        for (int i = 0; i < password.length(); i++) {
            if (specialChars.contains(String.valueOf(password.charAt(i)))) {
                hasSpecialChar = true;
                break;
            }
        }
        if (!hasSpecialChar) {
            return false;
        }

        // Requirement 5: Password should contain at least one digit
        boolean hasDigit = false;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                hasDigit = true;
                break;
            }
        }
        if (!hasDigit) {
            return false;
        }

        return true; // All requirements are met, return true
    }

    public static void main(String[] args) {
        // Test the validatePassword method
        String password1 = "Abc123!"; // valid password
        String password2 = "password"; // invalid password

        System.out.println(validatePassword(password1)); // Output: true
        System.out.println(validatePassword(password2)); // Output: false
    }
}



