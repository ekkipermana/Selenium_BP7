package BP7_Selenium_TestCase.Authentication;

import org.testng.annotations.Test;

public class AUTH11_N_Invalid_ForgotPassword_BlankUsername extends Authentication_Page {

    //Invalid Forgot Password, blank username
    @Test
    public void AUTH11_N_Invalid_ForgotPassword_BlankUsername() throws InterruptedException {
        System.out.println("Invalid Forgot Password, blank username");
        Thread.sleep(1000);

        //Click Forgot Password
        Auth.ButtonForgotPassword();
        Thread.sleep(1000);

        //Input Blank username
        Auth.inputUsernameForgot("");
        Thread.sleep(1000);

        //Click button Reset Password
        Auth.ButtonReset();
        Thread.sleep(2000);

        //Verify message
        // Assert.assertTrue(driver.getPageSource().contains("Please contact HR admin in order to reset the password"));
        //Thread.sleep(2000);
    }
}
