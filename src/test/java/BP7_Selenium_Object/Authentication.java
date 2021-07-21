package BP7_Selenium_Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Authentication {
    WebDriver driver;

    public Authentication(WebDriver driver) {
        this.driver = driver;
    }

    ///////LOGIN///////
    //  Input Username
    By LoginUsername = By.id("txtUsername");

    public void inputUsername(String username) {
        driver.findElement(LoginUsername).sendKeys(username);
    }

    //  Input Password
    By LoginPassword = By.id("txtPassword");

    public void inputPassword(String password) {
        driver.findElement(LoginPassword).sendKeys(password);
    }

    //  Button Login
    By ButtonLogin = By.id("btnLogin");

    public void ButtonLogin() {
        driver.findElement(ButtonLogin).click();
    }


    //////FORGOT PASSWORD/////
    //  Forgot Password
    By LinkForgotPass = By.linkText("Forgot your password?");

    public void ButtonForgotPassword () {
        driver.findElement(LinkForgotPass).click();
    }

    // Input username for reset password
    By InputUserForgotPassword = By.id("securityAuthentication_userName");

    public void inputUsernameForgot(String username) {
        driver.findElement(InputUserForgotPassword).sendKeys(username);
    }

    // Button Reset
    By ButtonResetPassword = By.id("btnSearchValues");

    public void ButtonReset() {
        driver.findElement(ButtonResetPassword).click();
    }

}