package pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class NestedFramesPage extends BasePageObject{
    private By parentFrame=By.xpath("//frame[@name='frame-top']");
    private By leftFrameLocator= By.xpath("//frame[@name='frame-left']");
    private By middleFrameLocator=By.xpath("//div[@id='content']");
    private By rightFrameLocator=By.xpath("//body[contains(text(),'RIGHT')]");
    private By bottomFrameLocator=By.tagName("body");

    String actual=driver.findElement(leftFrameLocator).getText();

    public NestedFramesPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void validateLeftFrame(){
        switchToFrame(parentFrame);
        switchToFrame(leftFrameLocator);

        Assert.assertEquals(actual,"LEFT");

    }
    public void validateMiddleFrame(){
        switchToFrame(parentFrame);
        switchToFrame(middleFrameLocator);
        Assert.assertEquals(driver.findElement(middleFrameLocator).isDisplayed(),true);



    }
    public void validateRightFrame(){
        switchToFrame(rightFrameLocator);
        Assert.assertEquals(driver.findElement(rightFrameLocator).isDisplayed(),true);
    }
    public void validateBottomFrame(){
        switchToFrame(bottomFrameLocator);
        Assert.assertEquals(driver.findElement(bottomFrameLocator).isDisplayed(),true);
    }

}
