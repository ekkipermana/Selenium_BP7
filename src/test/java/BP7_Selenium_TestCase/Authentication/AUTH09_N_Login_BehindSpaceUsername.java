package BP7_Selenium_TestCase.Authentication;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AUTH09_N_Login_BehindSpaceUsername extends Authentication_Page {

    //Login with add space in behind of username
    @Test
    public void Login_AUTH09_N_Invalid_Login_BehindSpaceUsername() throws InterruptedException {
        System.out.println("Login with add space in behind of username");

        //Input wrong Username adding space in behind of username
        Auth.inputUsername("Admin ");
        Thread.sleep(1000);

        //Input valid Password
        Auth.inputPassword("s3Kol4HQA!*");
        Thread.sleep(1000);

        //Click button login
        Auth.ButtonLogin();
        Thread.sleep(1000);

        //Verify error message
        Assert.assertTrue(driver.getPageSource().contains("Invalid credentials"));
    }
}
