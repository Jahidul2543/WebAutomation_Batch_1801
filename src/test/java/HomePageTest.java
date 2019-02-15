import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest {

    /**
     * Open url> Done>  driver.get("url")
     * Click sign in> write invalid email>invalid  password> click submit button > verify the text
     */

    @Test
    public void signInWithInvalidCredentialsTest(){
        System.setProperty("webdriver.chrome.driver","/Users/jahidul/IdeaProjects/WebAutomation_Batch_1801/driver/chromedriver");

        // ChromDriver Reference variable or object, in simple we say driver object
        WebDriver driver = new ChromeDriver();

        driver.get("http://automationpractice.com/index.php");
        // find by class name
        driver.findElement(By.className("login")).click();
        // find by id
        driver.findElement(By.id("email")).sendKeys("xyz@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("pshdbf");
        //find by name
        driver.findElement(By.name("SubmitLogin")).click();
        //find element by xpath
        String actualErrorMessage = driver.findElement(By.xpath("//div[@id='center_column']/div[1]/p")).getText(); // getText() gives the tag value in String

        System.out.println(actualErrorMessage);
        // This line compare the error message with expected error message

        Assert.assertEquals(actualErrorMessage, "There is 1 error");

        System.out.println("Test Passed");

    }

}
