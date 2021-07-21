package BP7_Selenium_TestCase.Authentication;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AUTH02_N_Invalid_Login_BlankUsernamePassword extends Authentication_Page {

    //Login with empty username and empty password
    @Test
    public void Login_AUTH02_N_Invalid_Login_BlankUsernamePassword() throws InterruptedException {
        System.out.println("Login with empty username and empty password");

        //Input Blank Username
        Auth.inputUsername("");
        Thread.sleep(1000);

        //Input Blank Password
        Auth.inputPassword("");
        Thread.sleep(1000);

        //Click button login
        Auth.ButtonLogin();
        Thread.sleep(1000);

        //Verify error message
        Assert.assertTrue(driver.getPageSource().contains("Username cannot be empty"));
    }
}
