package utills;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrowserFactory {

    public static WebDriver driver;
    public void openBrowser(String browserName){
        try {
            switch(browserName){
                case "Chrome":
                    String file = "C:\\Users\\Good\\Downloads\\chromedriver-win64(1)\\chromedriver-win64";
                    System.setProperty("wedriver.chrome.driver",file);
                    ChromeOptions opt = new ChromeOptions();
                    opt.addArguments("disable-extensions");
                    opt.addArguments("--start-maximized");
                    driver = new ChromeDriver(opt);
                    break;

                case "Edge":

                    EdgeOptions ept = new EdgeOptions();
                    ept.addArguments("disable-extensions");
                    ept.addArguments("--start-maximized");
                    driver = new EdgeDriver(ept);
                    break;

                case "Firefox":
                    FirefoxOptions ff = new FirefoxOptions();
                    ff.addArguments("disable-extensions");
                    ff.addArguments("--start-maximized");
                    driver = new FirefoxDriver(ff);
                    break;

            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public void closeBrowser(){
        driver.close();
    }

    public void quitBrowser(){
        driver.quit();
    }
}
