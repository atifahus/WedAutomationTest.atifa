package pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MultipleWindowsPage extends BasePageObject{
    private By parentWindowHeader= By.xpath("//h3");
    private By clickHereLink=By.xpath("//a[text()='Click Here']");
    private By newWindowHeader= By.xpath("//h3");

    private String newWindowTitle="New Window";



    public MultipleWindowsPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void validateDriverHeader(){
        Assert.assertEquals(driver.findElement(parentWindowHeader).getText(),"Opening a new window");

    }
    public void clickToLink(){
        click(clickHereLink);
    }

    public void switchToNewWindow(){

        switchToWindowWithTitle(newWindowTitle);
    }

    public void validateNewWindowHeader(){
        Assert.assertEquals(driver.findElement(newWindowHeader).getText(),"New Window");

    }
}
