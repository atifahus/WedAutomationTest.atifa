package pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class KeyPressesPage extends BasePageObject{
    private By keyPressBoxLocator= By.xpath("//input[@id='target']");
    private By keyPressResultLocator=By.xpath("//p[@id='result']");
    private By outsideOfTheBoxLocator=By.xpath("//div[@class='example']");

    String expectedTabResult="You entered: TAB";
    String expectedEnterResult="You entered: ENTER";

    public KeyPressesPage(WebDriver driver, Logger log) {
        super(driver, log);
    }


    public void pressTabKey(){

        pressKey(keyPressBoxLocator, Keys.TAB);
    }
    public void validateKeyPressedResult(){
        assertion(driver.findElement(keyPressResultLocator),expectedTabResult);
    }
/*    public void pressEnterKey(){
        click(keyPressResultLocator);
        pressKey(keyPressBoxLocator,Keys.ENTER);
    }
    public void validateEnterKeyResult(){
        Assert.assertEquals(driver.findElement(keyPressResultLocator).getText(),expectedEnterResult);
    }*/

}
