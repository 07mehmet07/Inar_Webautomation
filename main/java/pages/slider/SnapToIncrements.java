package pages.slider;

import pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class SnapToIncrements extends BasePage {
    @FindBy(id = "amount-snap-to-increments")
    private WebElement moneyAmount;

    @FindBy(css = "#slider-snap-to-increments>span")
    private WebElement buttonToSlide;

    public String getMoneyAmount() {
        return moneyAmount.getAttribute("value").substring(1);
    }

    public void dragAndDropButton(int x, int y) {
        actions.dragAndDropBy(buttonToSlide, x, y).perform();
    }
}
