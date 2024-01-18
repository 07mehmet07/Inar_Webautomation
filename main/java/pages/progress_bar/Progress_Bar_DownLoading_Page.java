package pages.progress_bar;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Progress_Bar_DownLoading_Page extends BasePage {
    @FindBy(id="downloadButton-download-dialog")
    private WebElement startTab ;

    @FindBy(id="ui-id-82")
    private WebElement fileDownloadText;

    @FindBy(id = "dialog-download-dialog")
    private WebElement closeTab;

    public void clickOnStartTab(){
        startTab.click();
    }

    public String getTextOfPopUp(){
        return fileDownloadText.getText();
    }

    public void clickOnCloseTab(){
        closeTab.click();
    }
}
