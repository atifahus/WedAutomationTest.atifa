package pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

public class HoverPage extends BasePageObject{

    private WebElement firstPic= driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]"));



    public HoverPage(WebDriver driver, Logger log) {
        super(driver, log);
    }
    public void hoverOverOnFirstPic(){
       hoverOverElement(firstPic);


    }
}
