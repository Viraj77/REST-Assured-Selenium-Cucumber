package utills;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserFactory {

    public static WebDriver driver;
    public void openBrowser(){
        String file = "C:\\Users\\Good\\Downloads\\chromedriver-win64";
        System.setProperty("wedriver.chrome.driver",file);
        driver = new ChromeDriver();

    }
}
