package BP7_Selenium_TestCase.Authentication;

import org.testng.Assert;
import org.testng.annotations.Test;
public class AUTH10_P_Valid_ForgotPassword extends Call_PageObject_Browser {

    //Valid Forgot Password
    @Test
    public void Login_AUTH10_P_Valid_ForgotPassword() throws InterruptedException {
        System.out.println("Valid Forgot Password");
        Thread.sleep(1000);

        //Click Forgot Password
        Auth.clickBtnForgotPass();
        Thread.sleep(1000);

        //Input Valid username
        Auth.inputUserForgot("Admin");
        Thread.sleep(1000);

        //Click button Reset Password
        Auth.clickBtnReset();
        Thread.sleep(2000);

        //Verify message
        // Assert.assertTrue(driver.getPageSource().contains("Please contact HR admin in order to reset the password"));
        //Thread.sleep(2000);
    }
}
