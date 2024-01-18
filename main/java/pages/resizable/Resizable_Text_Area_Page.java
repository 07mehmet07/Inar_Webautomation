package pages.resizable;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Resizable_Text_Area_Page extends BasePage {
    @FindBy(id = "resizable-text-area-res")
    private WebElement textArea;

    @FindBy(css = ".ui-wrapper > .ui-icon")
    private WebElement handle;

    public void writeTextArea(String text){
        textArea.sendKeys(text);
    }
    public void resizeTextArea(int x , int y){
        actions.dragAndDropBy(handle , x , y).perform();
    }

    public String getTextFromTextArea(){
        return textArea.getAttribute("value");
    }
    public void clearTextArea(){
        textArea.clear();
    }
    public Dimension getSizeOfTextArea(){
        return textArea.getSize();
    }
}
