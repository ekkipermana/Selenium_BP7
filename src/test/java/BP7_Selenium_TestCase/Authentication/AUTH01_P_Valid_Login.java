package BP7_Selenium_TestCase.Authentication;

import BP7_Selenium_Object.Authentication;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AUTH01_P_Valid_Login extends Call_PageObject_Browser {

    //Login with Valid Username and Password
    @Test
    public void Login_AUTH01_P_Valid_Login() throws InterruptedException {
        System.out.println("Login with Valid Username and Password");

        //Input valid Username
        Auth.inputUsername("Admin");
        Thread.sleep(1000);

        //Input valid Password
        Auth.inputPassword("s3Kol4HQA!*");
        Thread.sleep(1000);

        //Click Button Login
        Auth.clickBtnLogin();

        Assert.assertTrue(driver.getPageSource().contains("Welcome Karyawan"));
    }
}
