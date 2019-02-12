import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumDemo {

    @Test
    public void searchTest() {

        System.setProperty("webdriver.chrome.driver", "/Users/jahidul/IdeaProjects/WebAutomation_Batch_1801/driver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://automationpractice.com/index.php");
        /**
         * It will go to search box and write dresses
         * */
        driver.findElement(By.id("search_query_top")).sendKeys("Dresses");
        /**
         * This will go to submit/search button and click
         * */

        driver.findElement(By.name("submit_search")).click();

        /**
         * Close all open tab
         * */
        driver.quit();

    }
}
