package progressbarTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Progress_Bar_DownLoading_Test extends Hooks {

    @Test
    public void ProgressBarDownLoadingTest(){
      pages.getHomePage().clickOnWebAutomationLink();
      pages.getWebAutomationPage().clickOnProgressBarLink();
      pages.getWebAutomationPage().clickOnDownloadDialog();

      pages.getDownLoadingPage().clickOnStartTab();
      String expectedTitle = "File Download";
      String actualTitle = pages.getDownLoadingPage().getTextOfPopUp();
      assertEquals(expectedTitle,actualTitle);
      pages.getDownLoadingPage().clickOnCloseTab();






    }
}
