package pages.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class AlertTypes_Page extends BasePage {

    Alert alert;

    @FindBy(xpath = "//button[text()='Show Alert']")
    private WebElement showAlertButton;

    @FindBy(xpath = "//button[text()='Show Prompt']")
    private WebElement showPromptButton;

    @FindBy(xpath = "//button[text()='Show Confirm']")
    private WebElement showConfirmButton;

    public void clickOnShowAlertButton() {
        showAlertButton.click();
    }

    public void clickOnShowConfirmButton() {
        showConfirmButton.click();
    }

    public void clickOnPromptButton() {
        showPromptButton.click();
    }

    public void switchToAlert() {
        alert = DRIVER.switchTo().alert();
    }

    public void confirmTheAlert() {
        switchToAlert();
        alert.accept();
    }

    public String getTextOfTheAlert() {
        switchToAlert();
        return alert.getText();
    }

    public void enterInputIntoAlert(String input) {
        switchToAlert();
        alert.sendKeys(input);
    }

    public void cancelTheAlert() {
        switchToAlert();
        alert.dismiss();
    }
}
