package pages.accordion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utils.BrowserUtils;

import java.util.List;

public class CollapseContentPage extends BasePage {

    @FindBy(css = "#accordion-2-cc > h3 >span")
    List<WebElement> clicksOfSection;

    @FindBy(id = "ui-id-10")
    WebElement textAreaForFirstSection;

    @FindBy(id = "ui-id-12")
    private WebElement secondAccordionElementContentPane;


    public void clickOnClicksOnSectoin(int i) {
        clicksOfSection.get(i).click();
    }

    public void clickOnSecondAccordionElement() {
        clicksOfSection.get(2).click();
        BrowserUtils.wait(1);
    }

    public boolean isDisplayed() {
        return textAreaForFirstSection.isDisplayed();
    }


}
