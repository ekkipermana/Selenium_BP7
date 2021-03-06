package BP7_Selenium_TestCase.SocialMedia;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SM01_P_Valid_YouTube extends SocialMedia_Page {

    //Open for YouTube Link
    @Test
    public void SocialMedia_SM01_P_Valid_YouTube() throws InterruptedException {
        System.out.println("Open for YouTube Link");

        // Switch browser
        String mainWindow = driver.getWindowHandle();
        SM.ClickYouTube();
        for (String newWindow : driver.getWindowHandles()){
            driver.switchTo().window(newWindow);
        }
        Thread.sleep(2000);
        String TwitterLink = driver.getCurrentUrl();

        // Assert Link YouTube
        Assert.assertEquals(TwitterLink, "https://www.youtube.com/c/OrangeHRMInc");

        driver.close();
        // Back to mainpage login
        driver.switchTo().window(mainWindow);

    }
}
