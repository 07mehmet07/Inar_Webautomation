package pages.resizable;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Resizable_Synchronous_Resize_Page extends BasePage {
    @FindBy(id = "resizable-synchr-resize")
    private WebElement mainElement;

    @FindBy(id = "also-synchr-resize")
    private WebElement alsoElement;

    @FindBy(css = "#resizable-synchr-resize > div.ui-icon")
    private WebElement holdingElement;

    public void pullHoldingElement(int width, int height){
        actions.clickAndHold(holdingElement).moveByOffset(width, height).release().build().perform();
    }
    public Dimension getDimensionOfMainBox(){
        return mainElement.getSize();
    }
    public Dimension getDimensionOfAlsoBox(){
        return alsoElement.getSize();
    }

}
