package pages.dialog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.ArrayList;
import java.util.List;

public class Dialog_Modal_Form_Page extends BasePage {
    @FindBy(id = "name")
    private WebElement name;

    @FindBy(id = "surname")
    private WebElement surname;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(xpath = "//button[contains(text(),'Create Account')]")
    private WebElement createAccountTab;

    @FindBy(id = "dialog-modalForm-sbt")
    private List<WebElement> basicDialog;

    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    private WebElement submitTab;

    @FindBy(css = ".ui-widget.ui-widget-content.mb-4 > tbody > tr")
    protected List<WebElement> users;

    public void clickOnCreateAccountTab() {
        createAccountTab.click();
    }

    public List<String> enterAllDataOnDiologPage(String name1, String surname1, String email1) {
        List<String> data = new ArrayList<>();
        name.sendKeys(name1);
        data.add(name1);
        surname.sendKeys(surname1);
        data.add(surname1);
        email.sendKeys(email1);
        data.add(email1);
        return data;
    }

    public void clickOnSubmit() {
        submitTab.click();
    }

    public List<String> getAllDataOfLastUser() {
        List<String> result = new ArrayList<>();
        for (WebElement userData : users.get(users.size() - 1).findElements(By.xpath("td"))) {
            result.add(userData.getText());
        }
        return result;
    }


}
