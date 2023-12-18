package pageTests;
import base.TestUtilities;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.WelcomePage;

public class LogInPositiveTest extends TestUtilities {


    @Test
    public void testLoginPage(){
        WelcomePage welcomePage = new WelcomePage(driver, log);

        LoginPage loginPage = welcomePage.clickFormAuthenticationButton();

        loginPage.loginWithCredentials("tomsmith", "SuperSecretPassword!");

        Assert.assertTrue(loginPage.getSuccessText(), "You logged into a secure area!");



    }



}