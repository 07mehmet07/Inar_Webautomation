package pages.autocomplete;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class Autocomplete_Accent_Folding_Page extends BasePage {
    @FindBy(id = "developer-accentFolding")
    private WebElement textField;

    @FindBy(css = "#ui-id-40 > li > div")
    private List<WebElement> elementList;

    public void sendDataToInput(String text){
        textField.sendKeys(text);
    }

    public void cleanInput(){
      textField.clear();
    }
    public List<String> getElementList(){
        return elementList.stream().map(WebElement::getText).toList();
    }


}
