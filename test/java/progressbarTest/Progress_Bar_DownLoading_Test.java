package progressbarTest;

import BaseTest.Hooks;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * 1.Open the url and navigate to Download dialog Link
 * 2.Click the start button
 * 3.Verify that the download popup is displayed
 * 4.Click on cancel download button
 */

public class Progress_Bar_DownLoading_Test extends Hooks {

    @Test
    public void ProgressBarDownLoadingTest() {

        //1.Open the url and navigate to Download dialog Link
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickOnProgressBarLink();
        pages.getWebAutomationPage().clickOnDownloadDialog();


        //2.Click the start button
        pages.getDownLoadingPage().clickOnStartTab();

        //3.Verify that the download popup is displayed
        String expectedTitle = "File Download";
        String actualTitle = pages.getDownLoadingPage().getTextOfPopUp();
        assertEquals(expectedTitle, actualTitle);

        //4.Click on cancel download button
        pages.getDownLoadingPage().clickOnCloseTab();


    }
}
