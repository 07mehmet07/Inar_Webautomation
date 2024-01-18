package pages.menu;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class Menu_Icons_Page extends BasePage {

    @FindBy(id = "ui-id-76")
    private WebElement playbackTab;

    @FindBy(xpath = "//ul[@id='menu-w-icons']/li/ul/li")
    private List<WebElement> elementsOfPlayback;

    public void hoverOnPlayback(){
        actions.moveToElement(playbackTab).build().perform();

    }

    public List<String> selectElementsOfPlayback(){
        return elementsOfPlayback.stream().map(WebElement::getText).toList();
    }





}
