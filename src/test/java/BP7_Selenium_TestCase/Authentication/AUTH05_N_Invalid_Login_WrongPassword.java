package BP7_Selenium_TestCase.Authentication;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AUTH05_N_Invalid_Login_WrongPassword extends Authentication_Page {

    //Login with valid username but wrong password
    @Test
    public void Login_AUTH05_N_Invalid_Login_WrongPassword() throws InterruptedException {
        System.out.println("Login with valid username but wrong password");

        //Input Valid Username
        Auth.inputUsername("Admin");
        Thread.sleep(1000);

        //Input Wrong Password
        Auth.inputPassword("hehehe");
        Thread.sleep(1000);

        //Click button login
        Auth.ButtonLogin();
        Thread.sleep(1000);

        //Verify error message
        Assert.assertTrue(driver.getPageSource().contains("Invalid credentials"));
    }
}
