package PF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class HomePageGuru99 {

    WebDriver driver;

    public HomePageGuru99 (WebDriver driver){
        driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//div[contains(@class, 'error-copy')]")
    @CacheLookup
    WebElement lblSuccessLogin;

    @FindBy(xpath="//a[contains(text(), 'Selenium')]//following-sibling :: b")
    @CacheLookup
    WebElement mnuSelenium;
    public void verifyHomePageAfterLogin(){
        try{
            Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            wait.until(d -> lblSuccessLogin.isDisplayed());
            String actual = lblSuccessLogin.getText();
            Assert.assertEquals(actual, "Successfully Logged in...");
            System.out.println("Login message "+actual+" Verified");
        }catch(Exception e){

        }
    }

    public void clickOnSeleniumMenu(){
        try{
            Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            wait.until(d -> mnuSelenium.isDisplayed());
            String actual = mnuSelenium.getText();
            Assert.assertEquals(actual, "Selenium ");
            mnuSelenium.click();
            System.out.println("Clicked on menu "+actual);
        }catch(Exception e){

        }
    }

}
