package Q12;

// Client code
public class Client {
    public static void main(String[] args) {
        UserView userView = new UserView();
        UserController userController = new UserController();

        userView.displayLoginPrompt();
        String[] userInput = userView.getUserInput();
        String username = userInput[0];
        String password = userInput[1];

        if (userController.login(username, password)) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
        }
    }
}

