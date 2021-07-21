package BP7_Selenium_TestCase.Authentication;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AUTH06_N_Login_WrongUsername extends Authentication_Page {

    //Login with wrong username but valid password
    @Test
    public void Login_AUTH06_N_Invalid_Login_WrongUsername() throws InterruptedException {
        System.out.println("Login with wrong username but valid password");

        //Input wrong Username
        Auth.inputUsername("Okeee");
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
