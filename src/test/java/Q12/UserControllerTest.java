package Q12;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class UserControllerTest {
    private UserController userController;
    private UserAuthenticator mockAuthenticator;

    @BeforeEach
    void setUp() {
        mockAuthenticator = mock(UserAuthenticator.class);
        userController = new UserController(mockAuthenticator);
    }

    @Test
    void testLoginSuccess() {
        when(mockAuthenticator.authenticate("user", "pass")).thenReturn(true);
        assertTrue(userController.login("user", "pass"), "User should be logged in successfully");
    }

    @Test
    void testLoginFailure() {
        when(mockAuthenticator.authenticate("user", "wrongpass")).thenReturn(false);
        assertFalse(userController.login("user", "wrongpass"), "User login should fail with wrong password");
    }
}
