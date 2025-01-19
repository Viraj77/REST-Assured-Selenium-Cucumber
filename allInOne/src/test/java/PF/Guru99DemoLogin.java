package PF;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class Guru99DemoLogin {

    WebDriver driver;

    public Guru99DemoLogin (WebDriver driver){
        driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="email")
    @CacheLookup
    WebElement txtEmail;

    @FindBy(id="passwd")
    @CacheLookup
    WebElement txtPassword;

    @FindBy(id="SubmitLogin")
    @CacheLookup
    WebElement btnSignIn;


    public void signIn(String username, String password){

        try {

            Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));

            wait.until(d -> txtEmail.isDisplayed());
            wait.until(ExpectedConditions.visibilityOf(txtPassword));
            wait.until(ExpectedConditions.visibilityOf(btnSignIn));

            txtEmail.sendKeys(username);
            txtPassword.sendKeys(password);
            btnSignIn.click();

        }catch(Exception e){
            e.printStackTrace();
        }


    }


}
