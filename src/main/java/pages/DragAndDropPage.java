package pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DragAndDropPage extends BasePageObject{
    private By aLocator=By.id("column-a");
    private By bLocator=By.id("column-b");

    public DragAndDropPage(WebDriver driver, Logger log){
        super(driver, log);
    }

    public void dragFromDropTo(){
        dragAndDrop(aLocator,bLocator);
    }
}
