package BP7_Selenium_TestCase.SocialMedia;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SM05_Valid_OrangeHRM extends SocialMedia_Page {

    //Open for OrangeHRM Link
    @Test
    public void SocialMedia_SM05_Valid_OrangeHRM() throws InterruptedException {
        System.out.println("Open for OrangeHRM Link");

        // Switch browser
        String mainWindow = driver.getWindowHandle();
        SM.ClickLinkOrangeHRM();
        for (String newWindow : driver.getWindowHandles()) {
            driver.switchTo().window(newWindow);
        }
        Thread.sleep(2000);
        String TwitterLink = driver.getCurrentUrl();

        // Assert Link OrangeHRM
        Assert.assertEquals(TwitterLink, "https://www.orangehrm.com/");

        Thread.sleep(2000);
        driver.close();
        // Back to mainpage login
        driver.switchTo().window(mainWindow);
    }
}
