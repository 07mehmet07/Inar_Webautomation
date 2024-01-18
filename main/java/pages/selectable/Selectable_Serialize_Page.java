package pages.selectable;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class Selectable_Serialize_Page extends BasePage {
    @FindBy(css = "#selectable-serialize > li")
    private List<WebElement> itemList;

    @FindBy(id = "select-result")
    private WebElement selectedResult;

    public void clickOnElementByIndex(int index) {
        itemList.get(index - 1).click();
    }

    public void clickOnElementsWithDraggingMouse(int i1, int i2, int i3) {
        actions.clickAndHold(itemList.get(i1 - 1)).moveToElement(itemList.get(i2 - 1)).moveToElement(itemList.get(i3 - 1))
                .release().build().perform();
    }

    public void clickOnElementsWithCtrl(int i1, int i2) {
        actions.keyDown(Keys.CONTROL).click(itemList.get(i1 - 1)).click(itemList.get(i2 - 1)).keyUp(Keys.CONTROL).build().perform();
    }

    public boolean isTheItemSelectedByIndex(int index) {
        boolean isSelected = itemList.get(index - 1).getAttribute("class").contains("ui-selected");
        return isSelected;
    }

    public String getTextResult() {
        return selectedResult.getText();
    }


}





