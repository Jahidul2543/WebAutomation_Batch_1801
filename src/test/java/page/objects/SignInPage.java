package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SignInPage {

    @FindBy(id ="email")
    private WebElement emailBox ;

    @FindBy(id = "passwd")
    private WebElement password;

    @FindBy(name = "SubmitLogin")
    private WebElement submitButton;

    @FindBy(xpath = "//div[@id='center_column']/div[1]/p")
    private WebElement errorMessage;


    public void login(){
        emailBox.sendKeys("abcd@Ggmail.com");
        password.sendKeys("123abcd");
        submitButton.click();

    }


    public void verifyErrorMessage(){

        String actualErrorMessage = errorMessage.getText();
        Assert.assertEquals(actualErrorMessage, "There is 1 error");
    }

}
