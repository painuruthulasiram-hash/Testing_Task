package testng.practice;

public class LoginValidator {

    public String login(String username, String password) {

        if (username == null || username.trim().isEmpty()) {
            return "Username required";
        }

        if (password == null || password.isEmpty()) {
            return "Password required";
        }

        if (username.trim().equals("Admin")
                && password.equals("Admin123")) {

            return "Dashboard";
        }

        return "Invalid credentials";
    }
}

