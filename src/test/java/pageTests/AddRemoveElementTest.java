package pageTests;

import base.TestUtilities;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddRemoveElementPage;
import pages.WelcomePage;

public class AddRemoveElementTest extends TestUtilities {

    /*
     * go to heroku app homepage
     * validate user is homepage
     * click on add/remove elements
     * validate user is add/remove elements page
     * click on add element button
     * validate delete button shows up
     * click on delete button
     * validate delete button doesn't show up
     */
    @Test
    public void validateAddRemoveElement(){
        WelcomePage welcomePage=new WelcomePage(driver,log);
        AddRemoveElementPage addRemove=welcomePage.clickAddRemoveLink();
        Assert.assertEquals(driver.findElement(By.tagName("button")).getText(),"Add Element");

        addRemove.clickAddElement();
        Assert.assertEquals(driver.findElement(By.xpath("//div[@id='content']/div/div/button")).getText(),"Delete");

        addRemove.clickDeleteElemt();


    }
}
