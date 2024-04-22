package Q12;

import java.util.Scanner;

// Controller (server-side)
class UserController {
    public boolean login(String username, String password) {
        // Authenticate user
        if (authenticate(username, password)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean authenticate(String username, String password) {
        // Logic to authenticate user
        return true; // Placeholder for actual authentication logic
    }
}

// Model (server-side)
class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

// View (client-side - smartphone app)
class UserView {
    public void displayLoginPrompt() {
        System.out.println("Please enter your username and password:");
    }

    public String[] getUserInput() {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = scanner.nextLine();
        return new String[]{username, password};
    }
}





