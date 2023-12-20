package pageTests;

import base.TestUtilities;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasicAuthPage;
import pages.WelcomePage;

public class BasicAuthTest extends TestUtilities {

    @Test
    public void valiudateBasicAuth(){
        WelcomePage welcomePage=new WelcomePage(driver,log);
        BasicAuthPage basicAuth=welcomePage.clickBasicAuthLink();

        basicAuth.loginWithBasicAuth();
        Assert.assertEquals(basicAuth.getHeader(),"Congratulations! You must have the proper credentials.");

    }
}
