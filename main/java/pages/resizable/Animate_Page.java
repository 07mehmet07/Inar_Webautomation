package pages.resizable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Animate_Page extends BasePage {

    @FindBy(id = "resizable-2")
    private WebElement resizableElement;

    @FindBy(css = "#resizable-2 > .ui-icon")
    private WebElement resizeHandle;

    public void resizeTheWebElementByOffsets(int xOffset, int yOffset) {
        actions.clickAndHold(resizeHandle).moveByOffset(xOffset, yOffset).release().build().perform();
    }

    public int getWidthReleasePerformed(){
        return resizableElement.getSize().getWidth();
    }

    public int getHeightReleasePerformed(){
        return resizableElement.getSize().getHeight();
    }



}
