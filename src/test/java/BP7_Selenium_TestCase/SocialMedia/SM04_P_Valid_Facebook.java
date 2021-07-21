package BP7_Selenium_TestCase.SocialMedia;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SM04_P_Valid_Facebook extends SocialMedia_Page {

    //Open for YouTube Link
    @Test
    public void SocialMedia_SM04_P_Valid_Facebook() throws InterruptedException {
        System.out.println("Open for Facebook Link");

        // Switch browser
        String mainWindow = driver.getWindowHandle();
        SM.ClickFacebook();
        for (String newWindow : driver.getWindowHandles()) {
            driver.switchTo().window(newWindow);
        }
        Thread.sleep(2000);
        String TwitterLink = driver.getCurrentUrl();

        // Assert Link Facebook
        Assert.assertEquals(TwitterLink, "https://www.facebook.com/OrangeHRM");

        Thread.sleep(2000);
        driver.close();
        // Back to mainpage login
        driver.switchTo().window(mainWindow);
    }
}