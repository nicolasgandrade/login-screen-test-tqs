import org.junit.Assert;
import org.junit.Test;

public class LoginScreenTest {
    @Test
    public void testSuccessLogin() {
        LoginScreen loginScreen = new LoginScreen();
        Assert.assertTrue(loginScreen.login("john", "password123"));
    }

    @Test
    public void testFailedLogin() {
        LoginScreen loginScreen = new LoginScreen();
        Assert.assertFalse(loginScreen.login("john", "wrongpassword"));
    }

    @Test
    public void testAddUser() {
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.addUser("testuser", "testpassword");
        Assert.assertTrue(loginScreen.login("testuser", "testpassword"));
    }
}
