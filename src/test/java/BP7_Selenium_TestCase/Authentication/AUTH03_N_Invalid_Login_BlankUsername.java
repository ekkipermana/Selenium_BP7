package BP7_Selenium_TestCase.Authentication;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AUTH03_N_Invalid_Login_BlankUsername extends Call_PageObject_Browser{

    //Login with empty username but valid password
    @Test
    public void Login_AUTH03_N_Invalid_Login_BlankUsername() throws InterruptedException {
        System.out.println("Login with empty username but valid password");
        //Input Blank Username
        Auth.inputUsername("");
        Thread.sleep(1000);

        //Input Valid Password
        Auth.inputPassword("s3Kol4HQA!*");
        Thread.sleep(1000);

        //Click button login
        Auth.clickBtnLogin();
        Thread.sleep(1000);

        //Verify erorr message
        Assert.assertTrue(driver.getPageSource().contains("Username cannot be empty"));

    }
}