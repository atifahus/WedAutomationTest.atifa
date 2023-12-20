package pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropDownPage extends BasePageObject{

    private WebElement option1= driver.findElement(By.id("dropdown"));

    public DropDownPage(WebDriver driver, Logger log) {
        super(driver, log);
    }
    public void selectDropDown(){

        dropDownElementByValue(option1,"1");
    }
}
