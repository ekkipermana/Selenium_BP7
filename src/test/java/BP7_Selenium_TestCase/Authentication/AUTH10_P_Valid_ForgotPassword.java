package BP7_Selenium_TestCase.Authentication;

import org.testng.Assert;
import org.testng.annotations.Test;
public class AUTH10_P_Valid_ForgotPassword extends Authentication_Page {

    //Valid Forgot Password
    @Test
    public void Login_AUTH10_P_Valid_ForgotPassword() throws InterruptedException {
        System.out.println("Valid Forgot Password");
        Thread.sleep(1000);

        //Click Forgot Password
        Auth.ButtonForgotPassword();
        Thread.sleep(1000);

        //Input Valid username
        Auth.inputUsernameForgot("Admin");
        Thread.sleep(1000);

        //Click button Reset Password
        Auth.ButtonReset();

        //Verify message
        Assert.assertTrue(driver.getPageSource().contains("Password reset email could not be sent"));
        Thread.sleep(1000);
    }
}
