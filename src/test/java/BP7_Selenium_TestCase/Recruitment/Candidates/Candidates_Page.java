package BP7_Selenium_TestCase.Recruitment.Candidates;

import BP7_Selenium_Object.Authentication;
import BP7_Selenium_Object.Recruitment;
import BP7_Selenium_Object.SocialMedia;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class Candidates_Page {

    static WebDriver driver = new ChromeDriver();
    Recruitment Rec = new Recruitment(driver);
    Authentication Auth = new Authentication(driver);
    SocialMedia SM = new SocialMedia(driver);

    @BeforeTest
    public void init() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.get("http://qa.cilsy.id/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();


        //Input valid Username
        Auth.inputUsername("Admin");
        Thread.sleep(1000);
        //Input valid Password
        Auth.inputPassword("s3Kol4HQA!*");
        Thread.sleep(1000);
        //Click Button Login
        Auth.ButtonLogin();
        Assert.assertTrue(driver.getPageSource().contains("Welcome Karyawan"));
        Thread.sleep(2000);
    }
}
