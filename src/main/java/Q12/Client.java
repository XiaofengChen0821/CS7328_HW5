package Q12;

public class Client {

    public static void main(String[] args) {
        // Create an instance of the authenticator
        UserAuthenticator authenticator = new SimpleAuthenticator();

        // Create the UserController with the specific authenticator
        UserController userController = new UserController(authenticator);

        // Sample username and password
        String username = "user";
        String password = "pass";

        // Attempt to login with the given username and password
        boolean loginResult = userController.login(username, password);

        // Print out the result of the login attempt
        if (loginResult) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed!");
        }

        // Attempt to login with incorrect credentials
        String wrongPassword = "wrongpass";
        boolean wrongLoginResult = userController.login(username, wrongPassword);

        // Print out the result of the login attempt with incorrect credentials
        if (wrongLoginResult) {
            System.out.println("Login successful with wrong password!");
        } else {
            System.out.println("Login failed with wrong password.");
        }
    }
}
