package pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddRemoveElementPage extends BasePageObject{

    private By addElement= By.xpath("//div[@id='content']/div/button");
    private By deleteElementt=By.xpath("//div[@id='content']/div/div/button");


    public AddRemoveElementPage(WebDriver driver, Logger log) {
        super(driver, log);
    }
    public void clickAddElement(){
        click(addElement);
    }
    public void clickDeleteElemt(){
        click(deleteElementt);
    }
    public String getDeleteHeader(){
       return getCurrentHeader(deleteElementt);

    }

}
