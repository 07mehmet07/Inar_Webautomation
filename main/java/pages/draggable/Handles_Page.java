package pages.draggable;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class Handles_Page extends BasePage {
    @FindBy(id = "draggable13")
    private WebElement firstDraggableElement;

    @FindBy(id = "draggable14")
    private WebElement secondDraggableElement;

    @FindBy(css = "#draggable13 > p")
    private WebElement textOfFirstDraggableElement;

    @FindBy(xpath = "//div[@id='draggable14']/p")
    private List<WebElement> textsOfSecondDraggableElement;


    public void dragAndDropFirstDraggableElement(int xOffset, int yOffset) {
        actions.clickAndHold(textOfFirstDraggableElement)
                .dragAndDropBy(firstDraggableElement, xOffset, yOffset)
                .release()
                .build()
                .perform();
    }

    public void dragAndDropSecondDraggableElement(int index, int xOffset, int yOffset) {
        actions.clickAndHold(textsOfSecondDraggableElement.get(index - 1))
                .dragAndDropBy(secondDraggableElement, xOffset, yOffset)
                .release()
                .build()
                .perform();
    }

    public Point locationOfFirstDraggableElement() {
        return firstDraggableElement.getLocation();
    }


    public Point locationOfSecondDraggableElement() {
        return secondDraggableElement.getLocation();
    }

}
