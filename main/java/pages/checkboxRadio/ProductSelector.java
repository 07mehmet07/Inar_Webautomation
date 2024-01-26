package pages.checkboxRadio;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class ProductSelector extends BasePage {

    @FindBy(css = ".brand-options>label")
    private List<WebElement> brandOptions;

    @FindBy(css = ".shape-options > label")
    private List<WebElement> shapeOptions;

    @FindBy(css = ".toggle-options>label")
    private List<WebElement> styleOptions;

    @FindBy(css = ".preview>.align-items-center")
    private WebElement brandText;

    public void clickOnBranOptions(int i) {
        brandOptions.get(i).click();
    }

    public void clickOnShapeOptions(int i) {
        shapeOptions.get(i).click();
    }

    public void clickOnStyleOptions(int i) {
        styleOptions.get(i).click();
    }

    public String getBrandText() {
        return brandText.getText();
    }

    public boolean getShape(int i) {
        String shape = shapeOptions.get(i).getText().toLowerCase();
        return getStyle().contains(shape);
    }

    private String getStyle() {
        return brandText.getAttribute("class").toLowerCase();
    }

    public boolean isBorderSelected() {
        return getStyle().contains("border");
    }
}
