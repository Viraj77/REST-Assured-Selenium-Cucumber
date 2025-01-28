package PF;

import jdk.internal.org.jline.terminal.TerminalBuilder;
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

    @FindBy(xpath="//a[contains(text(), 'Radio & Checkbox Demo')]")
    @CacheLookup
    WebElement mnuRadioAndCheckBox;

    //Radio buttons and Checkbox
    @FindBy(xpath="//input[@id='vfb-7-1']")
    @CacheLookup
    WebElement rb1;

    @FindBy(xpath="//input[@id='vfb-7-2']")
    @CacheLookup
    WebElement rb2;

    @FindBy(xpath="//input[@id='vfb-7-3']")
    @CacheLookup
    WebElement rb3;

    @FindBy(xpath="//input[@id='vfb-6-0']")
    @CacheLookup
    WebElement cb1;

    @FindBy(xpath="//input[@id='vfb-6-1']")
    @CacheLookup
    WebElement cb2;

    @FindBy(xpath="//input[@id='vfb-6-2']")
    @CacheLookup
    WebElement cb3;

    Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    public void verifyHomePageAfterLogin(){
        try{
            wait.until(d -> lblSuccessLogin.isDisplayed());
            String actual = lblSuccessLogin.getText();
            Assert.assertEquals(actual, "Successfully Logged in...");
            System.out.println("Login message "+actual+" Verified");
        }catch(Exception e){

        }
    }

    public void clickOnSeleniumMenu(){
        try{
            wait.until(d -> mnuSelenium.isDisplayed());
            String actual = mnuSelenium.getText();
          //  Assert.assertEquals(actual, "Selenium ");
            mnuSelenium.click();
            System.out.println("Clicked on menu "+actual);
        }catch(Exception e){

        }
    }

    public void clickOnRadioAndCheckboxMenu(){
        try{
            wait.until(d -> mnuRadioAndCheckBox.isDisplayed());
            String actual = mnuRadioAndCheckBox.getText();
            //  Assert.assertEquals(actual, "Selenium ");
            mnuRadioAndCheckBox.click();
            System.out.println("Clicked on menu "+actual);
        }catch(Exception e){

        }
    }

    public void selectRadioButton(String value){
        wait.until(d -> rb1.isDisplayed());
        wait.until(d -> rb2.isDisplayed());
        wait.until(d -> rb3.isDisplayed());

        String rb1Value = rb1.getText();
        System.out.println(rb1Value);
        
    //Write for loop to get the rb value and then select the rb which is matching with the given data in value string

    }

}
