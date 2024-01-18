package pages.resizable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Resizable_DefFunc_Page extends BasePage {
    @FindBy(id = "resizable-1")
    private WebElement resizableElement;

    @FindBy(css = "#resizable-1 > div.ui-icon")
    private WebElement resizeHandle;

    public void resizeTheWebElement(int xOffset, int yOffset){
        actions.clickAndHold(resizeHandle).moveByOffset(xOffset, yOffset).release().build().perform();
    }

    public int getWidthOfResizableElement(){
        return resizableElement.getSize().getWidth();
    }

    public int getHeightOfResizableElement(){
        return resizableElement.getSize().getHeight();
    }
}
