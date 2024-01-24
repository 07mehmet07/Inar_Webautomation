package pages.buttons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

import java.util.List;

public class WithIconPage extends BasePage {

    @FindBy(xpath = "//div[@class='widget']/child::button")
    List<WebElement> widgetsButtons;

    @FindBy(css = ".css > button")
    List<WebElement> cssButtons;

    public void clickOnWidgetButtons(){
        for (int i = 0; i < widgetsButtons.size(); i++) {
            wait.until(ExpectedConditions.elementToBeClickable(widgetsButtons.get(i)));
            widgetsButtons.get(i).click();
        }
    }

    public void clickOnCssButtons(){
        for (int i = 0; i < cssButtons.size(); i++) {
            wait.until(ExpectedConditions.elementToBeClickable(cssButtons.get(i)));
            cssButtons.get(i).click();
        }
    }



}
