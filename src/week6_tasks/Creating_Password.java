package week6_tasks;
public class Creating_Password {

    private String username, password;

    public Creating_Password(String username, String password){
        setUsername(username);
        setPassword(password);
    }

    public String getUsername() {
        if(username.isEmpty() || username.isBlank()) {
            System.err.println("Invalid User name!");
        }
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (!isStrongPassword(password)) {
            System.err.println("Password \"" + password + "\" is not a strong password");
            System.exit(1);
        }
        this.password = password;
    }
    public boolean isStrongPassword(String password){
        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = false;  // has Upper case letter
        boolean r3 = false;  // has lower case letter
        boolean r4 = false;  // has Digit
        boolean r5 = false; // has Special Character

        for (char each : password.toCharArray()) {

            if (Character.isUpperCase(each)) {
                r2 = true;
            } else if (Character.isLowerCase(each)) {
                r3 = true;
            } else if (Character.isDigit(each)) {
                r4 = true;
            } else {
                r5 = true;
            }

        }

        return r1 && r2 && r3 && r4 && r5;
    }

}
