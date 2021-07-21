package BP7_Selenium_Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SocialMedia {

    WebDriver driver;

    public SocialMedia(WebDriver driver) {
        this.driver = driver;
    }


    /////SOCIAL_MEDIA_URL/////

    //  Locator and method for Linkedin button
    By BtnLinkedin = By.cssSelector("img[alt='LinkedIn OrangeHRM group']");
    public void clickBtnLinkedin() {
        driver.findElement(BtnLinkedin).click();
    }

    //  Locator and method for Facebook button
    By BtnFacebook = By.cssSelector("img[alt='OrangeHRM on Facebook']");
    public void clickBtnFacebook() {
        driver.findElement(BtnFacebook).click();
    }

    //  Locator and method for Twitter button
    By BtnTwitter = By.cssSelector("img[alt='OrangeHRM on twitter']");
    public void clickBtnTwitter() {
        driver.findElement(BtnTwitter).click();
    }

    //  Locator and method for Youtube button
    By BtnYoutube = By.cssSelector("img[alt='OrangeHRM on youtube']");
    public void clickBtnYoutube() {
        driver.findElement(BtnYoutube).click();
    }

    //  Locator and method for OrangeHRM hyperlink
    By BtnOrangeHRM = By.linkText("OrangeHRM, Inc");
    public void clickBtnOrangeHRM() {
        driver.findElement(BtnOrangeHRM).click();
    }

}
