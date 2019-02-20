package test.objects;

import ApplicationBasePage.ApplicationBasePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.HomePage;
import page.objects.SignInPage;

public class SignInPageTest extends ApplicationBasePage {

   HomePage objHomePage =null;
    SignInPage objSignInPage = null;

    @BeforeMethod
    public void initElements(){

        objHomePage = PageFactory.initElements(driver, HomePage.class);
        objSignInPage = PageFactory.initElements(driver, SignInPage.class);
    }


    @Test
    public void invalidCredentialTest(){

        objHomePage.clickSignIn();
        objSignInPage.login();

        objSignInPage.verifyErrorMessage();

    }
}
