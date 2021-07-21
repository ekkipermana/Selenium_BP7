package BP7_Selenium_TestCase.SocialMedia;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SM02_P_Valid_Twitter extends SocialMedia_Page {

    //Open for Twitter Link
    @Test
    public void SocialMedia_SM02_P_Valid_Twitter() throws InterruptedException {
        System.out.println("Open for Twitter Link");

        // Switch browser
        String mainWindow = driver.getWindowHandle();
        SM.ClickTwitter();
        for (String newWindow : driver.getWindowHandles()) {
            driver.switchTo().window(newWindow);
        }
        Thread.sleep(2000);
        String TwitterLink = driver.getCurrentUrl();

        // Assert Link Twitter
        Assert.assertEquals(TwitterLink, "https://twitter.com/orangehrm");

        Thread.sleep(2000);
        driver.close();
        // Back to mainpage login
        driver.switchTo().window(mainWindow);
    }
}