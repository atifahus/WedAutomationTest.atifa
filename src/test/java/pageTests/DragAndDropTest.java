package pageTests;

import base.TestUtilities;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DragAndDropPage;
import pages.WelcomePage;

public class DragAndDropTest extends TestUtilities {
    /*
     * go to homepage
     * click on drag and drop link
     * validate it is drag and drop page
     * drag a to b
     * validate a is dragged and dropped to b location
     * */
    @Test
    public void validateDragDropTest(){
        WelcomePage welcomePage=new WelcomePage(driver,log);
        DragAndDropPage dragDrop=welcomePage.clickDragDropLink();
        Assert.assertEquals(driver.findElement(By.tagName("h3")).getText(),"Drag and Drop");

        dragDrop.dragFromDropTo();

        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"column-a\"]/header")).getText(),"B");
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"column-b\"]/header")).getText(),"A");


    }
}
