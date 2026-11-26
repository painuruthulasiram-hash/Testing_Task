package Practice;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testng.practice.LoginValidator;

public class LoginTests {

    LoginValidator validator = new LoginValidator();

    // TEST 1: Valid Login
    @Test(groups = {"smoke"})
    public void validLoginTest() {

        String actual = validator.login("Admin", "Admin123");

        Assert.assertEquals(actual, "Dashboard");

        System.out.println("Valid Login Passed");
    }

    // TEST 2: Invalid Username
    @Test(groups = {"regression"})
    public void invalidUsernameTest() {

        String actual = validator.login("User", "Admin123");

        Assert.assertEquals(actual, "Invalid credentials");

        System.out.println("Invalid Username Test Passed");
    }

    // TEST 3: Invalid Password
    @Test(groups = {"smoke", "regression"})
    public void invalidPasswordTest() {

        String actual = validator.login("Admin", "Wrong123");

        Assert.assertEquals(actual, "Invalid credentials");

        System.out.println("Invalid Password Test Passed");
    }

    // TEST 4: Empty Username
    @Test(groups = {"smoke", "regression"})
    public void emptyUsernameTest() {

        String actual = validator.login("", "Admin123");

        Assert.assertEquals(actual, "Username required");

        System.out.println("Empty Username Test Passed");
    }

    // TEST 5: Empty Password
    @Test(groups = {"regression"})
    public void emptyPasswordTest() {

        String actual = validator.login("Admin", "");

        Assert.assertEquals(actual, "Password required");

        System.out.println("Empty Password Test Passed");
    }

    // TEST 6: Both Fields Empty
    @Test(groups = {"regression"})
    public void bothFieldsEmptyTest() {

        String actual = validator.login("", "");

        Assert.assertEquals(actual, "Username required");

        System.out.println("Both Empty Test Passed");
    }

    // TEST 7: Username With Spaces
    @Test(groups = {"regression"})
    public void usernameWithSpacesTest() {

        String actual = validator.login(" Admin ", "Admin123");

        Assert.assertEquals(actual, "Dashboard");

        System.out.println("Username Spaces Test Passed");
    }

    // TEST 8: Multiple Invalid Inputs
    @DataProvider(name = "invalidLoginData")
    public Object[][] getInvalidData() {

        return new Object[][] {
            {"WrongUser", "Admin123"},
            {"Admin", "WrongPassword"},
            {"Guest", "Guest123"}
        };
    }

    @Test(
        dataProvider = "invalidLoginData",
        groups = {"regression"}
    )
    public void multipleInvalidLoginTest(
            String username, String password) {

        String actual = validator.login(username, password);

        Assert.assertEquals(actual, "Invalid credentials");

        System.out.println(
            "Tested Username: " + username
        );
    }
}

