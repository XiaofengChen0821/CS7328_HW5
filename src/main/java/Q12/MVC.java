package Q12;

interface UserAuthenticator {
    boolean authenticate(String username, String password);
}

class UserController {
    UserAuthenticator authenticator;

    public UserController(UserAuthenticator authenticator) {
        this.authenticator = authenticator;
    }

    public boolean login(String username, String password) {
        return authenticator.authenticate(username, password);
    }
}

class SimpleAuthenticator implements UserAuthenticator {
    public boolean authenticate(String username, String password) {
        // Placeholder logic for authentication
        return "user".equals(username) && "pass".equals(password);
    }
}
