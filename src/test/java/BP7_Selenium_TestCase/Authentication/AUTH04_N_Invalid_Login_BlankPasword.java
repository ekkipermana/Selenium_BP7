package BP7_Selenium_TestCase.Authentication;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AUTH04_N_Invalid_Login_BlankPasword extends Authentication_Page {

    //Login with valid password but blank password
    @Test
    public void Login_AUTH04_N_Invalid_Login_BlankPassword() throws InterruptedException {
        System.out.println("Login with valid username but blank password");

        //Input Valid Username
        Auth.inputUsername("Admin");
        Thread.sleep(1000);

        //Input Blank Password
        Auth.inputPassword("");
        Thread.sleep(1000);

        //Click button login
        Auth.ButtonLogin();
        Thread.sleep(1000);

        //Verify error message
        Assert.assertTrue(driver.getPageSource().contains("Password cannot be empty"));
    }
}
