package pages.droppable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Droppable_Accept_Page extends BasePage {
    @FindBy(id = "draggable-nonvalid-accept")
    private WebElement nonDroppableElement;

    @FindBy(id = "draggable-accept")
    private WebElement droppableElement;

    @FindBy(id = "droppable-accept")
    private WebElement targetElement;

    @FindBy(css = "#droppable-accept")
    private WebElement titleOfTargetElement;


    public void dragNonDroppableElement() {
        actions.dragAndDrop(nonDroppableElement, targetElement).build().perform();
    }

    public void dragDroppableElement() {
        actions.dragAndDrop(droppableElement, targetElement).build().perform();
    }

    public String getTitleOfTargetElement() {
        return titleOfTargetElement.getText();
    }

}
