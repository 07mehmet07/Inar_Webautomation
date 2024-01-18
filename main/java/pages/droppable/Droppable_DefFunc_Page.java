package pages.droppable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Droppable_DefFunc_Page extends BasePage {
    @FindBy(id = "draggable-def-func")
    private WebElement draggableElement;

    @FindBy(id = "droppable-def-func")
    private WebElement droppableElement;

    public void dragAndDrop() {
        actions.dragAndDrop(draggableElement, droppableElement).perform();
    }

    public String getDroppableElementText() {
        return droppableElement.getText();
    }

    public int getLocationOfDraggableX() {
        return draggableElement.getLocation().getX();
    }

    public int getLocationOfDraggableY() {
        return draggableElement.getLocation().getY();
    }

    public int getLocationOfDroppableX() {
        return droppableElement.getLocation().getX();
    }

    public int getLocationOfDroppableY() {
        return droppableElement.getLocation().getY();
    }

    public void dragAndDropByOffsets(int xOffset, int yOffset) {
        actions.dragAndDropBy(draggableElement, xOffset, yOffset).perform();
    }

    public int getDroppableElementRightEdge() {
        return droppableElement.getLocation().getX() + droppableElement.getSize().getWidth();
    }

    public int getDroppableElementBottomEdge() {
        return droppableElement.getLocation().getY() + droppableElement.getSize().getHeight();
    }

    public int getDroppableElementLeftEdge() {
        return droppableElement.getLocation().getX();
    }

    public int getDroppableElementTopEdge() {
        return droppableElement.getLocation().getY();
    }

    public int getDraggableElementRightEdge() {
        return draggableElement.getLocation().getX() + draggableElement.getSize().getWidth();
    }

    public int getDraggableElementBottomEdge() {
        return draggableElement.getLocation().getY() + draggableElement.getSize().getHeight();
    }

    public int getDraggableElementLeftEdge() {
        return draggableElement.getLocation().getX();
    }

    public int getDraggableElementTopEdge() {
        return draggableElement.getLocation().getY();
    }


}
