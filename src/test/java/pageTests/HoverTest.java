package pageTests;

import base.TestUtilities;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HoverPage;
import pages.WelcomePage;

public class HoverTest extends TestUtilities {
    /*
     * go to homepage
     * click on hovers link
     * hover over 1st pic
     * validate username and view profile link displays
     * close browser
     * */

    @Test
    public void validateHoverTest(){
        WelcomePage welcomePage = new WelcomePage(driver, log);
        HoverPage hoverPage=welcomePage.clickHoverLink();
        hoverPage.hoverOverOnFirstPic();
        Assert.assertEquals(driver.findElement(By.tagName("h5")).getText(),"name: user1");


    }
}
