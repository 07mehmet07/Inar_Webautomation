package pages.iframe;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Iframe_Normal_Page extends BasePage {
    @FindBy(xpath = "//iframe[@id='nestedIframe']")
    private WebElement iframeElement;

    @FindBy(tagName = "a")
    private WebElement iframeLink;
    @FindBy(tagName = "h1")
    private WebElement titleOfIframe;



    public void switchToIframe() {
        DRIVER.switchTo().frame(iframeElement);
    }


    public String getTitleOfIframe() {
        switchToIframe();
        return titleOfIframe.getText();
    }
    public void switchToParentFrame(){
        DRIVER.switchTo().parentFrame();
    }

}
