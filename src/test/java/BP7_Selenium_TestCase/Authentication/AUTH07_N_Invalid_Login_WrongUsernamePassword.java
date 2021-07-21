package BP7_Selenium_TestCase.Authentication;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AUTH07_N_Invalid_Login_WrongUsernamePassword extends Call_PageObject_Browser {

    //Login with wrong username and wrong password
    @Test
    public void Login_AUTH07_N_Invalid_Login_WrongUsernamePassword() throws InterruptedException {
        System.out.println("Login with wrong username and wrong password");

        //Input wrong Username
        Auth.inputUsername("Okeee");
        Thread.sleep(1000);

        //Input wrong Password
        Auth.inputPassword("yayyyaa");
        Thread.sleep(1000);

        //Click button login
        Auth.clickBtnLogin();
        Thread.sleep(1000);

        //Verify error message
        Assert.assertTrue(driver.getPageSource().contains("Invalid credentials"));
    }
}
