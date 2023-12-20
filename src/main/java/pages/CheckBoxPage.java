package pages;
import base.BaseTest;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CheckBoxPage extends BasePageObject {
    private By checkboxheader= By.linkText("h3");
    private By firstCheckbox=By.xpath("(//form[@id='checkboxes']//input)[1]");
    private By secondCheckbox=By.xpath("(//form[@id='checkboxes']//input)[2]");

    public CheckBoxPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void validateDriverInCheckboxPage(){
        Assert.assertEquals(driver.findElement(checkboxheader).getText(),"Checkboxes");

    }
    public void selectFirstCheckbox(){
        if (!driver.findElement(firstCheckbox).isSelected()){
            click(firstCheckbox);
        }
        else {
            System.out.println("Checkbox already selected");
        }
    }
    public void selectSecondCheckbox(){
        if (!driver.findElement(secondCheckbox).isSelected()){
            click(secondCheckbox);
        }
        else {
            System.out.println("Checkbox already selected");
        }
    }
    public void validateFirstCheckboxIsSelected(){
        addImplicitWait(5);
        Assert.assertEquals(driver.findElement(firstCheckbox).isSelected(),true);
    }
    public void validateSecondCheckboxIsSelected(){
        addImplicitWait(6);
        Assert.assertEquals(driver.findElement(secondCheckbox).isSelected(),true);
    }
    }
