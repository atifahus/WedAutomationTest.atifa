package pageTests;

import base.TestUtilities;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropDownPage;
import pages.WelcomePage;

public class DropDownTest extends TestUtilities {
    /*
     * go to homepage
     * click on drop down option
     * select option1 from drop down menu
     * validate option1 is selected
     * close the browser
     * */
    @Test
    public void validateDropDownTest(){
        WelcomePage welcomePage=new WelcomePage(driver,log);
        DropDownPage dropDown=welcomePage.clickDropDownLink();
        dropDown.selectDropDown();
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"dropdown\"]/option[2]")).isSelected(),true);









    }



}
