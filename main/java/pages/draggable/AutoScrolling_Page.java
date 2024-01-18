package pages.draggable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class AutoScrolling_Page extends BasePage {

    @FindBy(id = "draggable2")
    private WebElement firstDraggable;

    @FindBy(id = "draggable3")
    private WebElement secondDraggable;

    @FindBy(id = "draggable4")
    private WebElement thirdDraggable;

    public void dragFirstDraggableByXOffset(int xOffset) {
        actions.dragAndDropBy(firstDraggable, xOffset, 0).perform();
    }

    public void dragSecondDraggableByXOffset(int xOffset) {
        actions.dragAndDropBy(secondDraggable, xOffset, 0).perform();
    }

    public void dragThirdDraggableByXOffset(int xOffset) {
        actions.dragAndDropBy(thirdDraggable, xOffset, 0).perform();
    }

    public int getLocationOfFirstDraggableX() {
        return firstDraggable.getLocation().getX();
    }

    public int getLocationOfSecondDraggableX() {
        return secondDraggable.getLocation().getX();
    }

    public int getLocationOfThirdDraggableX() {
        return thirdDraggable.getLocation().getX();
    }

}
