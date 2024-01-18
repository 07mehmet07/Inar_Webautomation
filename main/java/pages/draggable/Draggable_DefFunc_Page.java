package pages.draggable;

import pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Draggable_DefFunc_Page extends BasePage {

    @FindBy(id = "draggable")
    private WebElement draggable;

    public void dragAndDrop() {
        actions.dragAndDropBy(draggable, 100, 100).perform();
    }

    public void dragAndDropByOffsets(int xOffset, int yOffset) {
        actions.dragAndDropBy(draggable, xOffset, yOffset).perform();
    }

    public int getLocationOfDraggableX() {
        return draggable.getLocation().getX();
    }

    public int getLocationOfDraggableY() {
        return draggable.getLocation().getY();
    }

}
