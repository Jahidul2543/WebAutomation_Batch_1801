package ApplicationBasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ApplicationBasePage {

    public static WebDriver driver = null;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","/Users/jahidul/IdeaProjects/WebAutomation_Batch_1801/driver/chromedriver");

        // ChromDriver Reference variable or object, in simple we say driver object
        driver   = new ChromeDriver();

        driver.get("http://automationpractice.com/index.php");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
