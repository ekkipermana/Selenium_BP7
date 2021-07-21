package BP7_Selenium_Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SocialMedia {

    WebDriver driver;

    public SocialMedia(WebDriver driver) {
        this.driver = driver;
    }


    /////SOCIAL_MEDIA_URL/////

    // Linkedin button
    By LinkedIn_Link = By.cssSelector("img[alt='LinkedIn OrangeHRM group']");
    public void ClickLinkedIn() {
        driver.findElement(LinkedIn_Link).click();

    }

    //  Facebook button
    By Facebook_Link = By.cssSelector("img[alt='OrangeHRM on Facebook']");
    public void ClickFacebook() {
        driver.findElement(Facebook_Link).click();
    }

    //  Twitter button
    By Twitter_Link = By.cssSelector("img[alt='OrangeHRM on twitter']");
    public void ClickTwitter () {
        driver.findElement(Twitter_Link).click();

    }

    //  Youtube button
    By Youtube_Link = By.cssSelector("img[alt='OrangeHRM on youtube']");
    public void ClickYouTube() {
        driver.findElement(Youtube_Link).click();
    }

    //  OrangeHRM LinkURL
    By OrangeHRM_Link = By.linkText("OrangeHRM, Inc");
    public void ClickLinkOrangeHRM() {
        driver.findElement(OrangeHRM_Link).click();
    }

}
