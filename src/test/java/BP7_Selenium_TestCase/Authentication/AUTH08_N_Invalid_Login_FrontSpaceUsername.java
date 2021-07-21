package BP7_Selenium_TestCase.Authentication;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AUTH08_N_Invalid_Login_FrontSpaceUsername extends Authentication_Page {

    //Login with add space in front of username
    @Test
    public void Login_AUTH08_N_Invalid_Login_FrontSpaceUsername() throws InterruptedException {
        System.out.println("Login with add space in front of username");

        //Input wrong Username adding space in front of username
        Auth.inputUsername(" Admin");
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
