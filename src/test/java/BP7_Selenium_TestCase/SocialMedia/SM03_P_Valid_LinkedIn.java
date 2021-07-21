package BP7_Selenium_TestCase.SocialMedia;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SM03_P_Valid_LinkedIn extends SocialMedia_Page {


    //Open for LinkedIn Link
    @Test
    public void SocialMedia_SM03_P_Valid_LinkedIn() throws InterruptedException {
        System.out.println("Open for LinkedIn Link");

        // Switch browser
        String mainWindow = driver.getWindowHandle();
        SM.ClickLinkedIn();
        for (String newWindow : driver.getWindowHandles()) {
            driver.switchTo().window(newWindow);
        }
        Thread.sleep(2000);
        String TwitterLink = driver.getCurrentUrl();

        // Assert Link LinkedIn
        Assert.assertEquals(TwitterLink, "https://www.linkedin.com/signup/cold-join?session_redirect=https%3A%2F%2Fwww%2Elinkedin%2Ecom%2Fgroups%3Fhome%3D%26gid%3D891077&trk=login_reg_redirect");

        Thread.sleep(2000);
        driver.close();
        // Back to mainpage login
        driver.switchTo().window(mainWindow);
    }
}
