package pages.spinner;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class SpinnerOverflow extends BasePage {

    @FindBy(id = "spinner-overflow")
    private WebElement textArea;

    @FindBy(xpath = "(//span[@class='ui-button-icon ui-icon ui-icon-triangle-1-n'])[6]")
    private WebElement upButton;

    @FindBy(xpath = "(//span[@class='ui-button-icon ui-icon ui-icon-triangle-1-s'])[6]")
    private WebElement downButton;

    public int getValue() {
        return Integer.parseInt(textArea.getAttribute("aria-valuenow"));
    }

    public void clickOnUpButton(int times) {
        for (int i = 0; i < times; i++) {
            upButton.click();
        }
    }

    public void clickDownButton(int times) {
        for (int i = 0; i < times; i++) {
            downButton.click();
        }
    }
}
