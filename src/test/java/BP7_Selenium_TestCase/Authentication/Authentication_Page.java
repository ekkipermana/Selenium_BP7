package BP7_Selenium_TestCase.Authentication;

import BP7_Selenium_Object.Recruitment;
import BP7_Selenium_Object.SocialMedia;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import BP7_Selenium_Object.Authentication;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Authentication_Page {
    static WebDriver driver = new ChromeDriver();
    Authentication Auth = new Authentication(driver);
    Recruitment Rec = new Recruitment(driver);
    SocialMedia SM = new SocialMedia(driver);

    @BeforeTest
    public void init() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.get("http://qa.cilsy.id/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        }

    }


