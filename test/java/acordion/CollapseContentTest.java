package acordion;

import BaseTest.Hooks;
import org.testng.annotations.Test;
import utils.BrowserUtils;

import static org.testng.AssertJUnit.assertFalse;

/**
 * 1. Open the browser and navigate to the URL
 * 2. Click on Web automation link
 * 3. Click on Accordion button
 * 4. Click on Collapse Content button
 * 5. Click on first Section
 * 6. Verify that its pane collapsed
 */

public class CollapseContentTest extends Hooks {

    @Test
    public void CollapseContentTesting() {

        //1. Open the browser and navigate to the URL
        //2. Click on Web automation link
        pages.getHomePage().clickOnWebAutomationLink();

        //3. Click on Accordion button
        pages.getWebAutomationPage().ClickOnAcordion();

        //4. Click on Collapse Content button
        pages.getWebAutomationPage().ClickOnCollapseContent();

        //5. Click on first section
        pages.getCollapseContentPage().clickOnClicksOnSectoin(0);
        BrowserUtils.wait(2);

        //6. Verify that its pane collapsed
        boolean contentPane = pages.getCollapseContentPage().isDisplayed();
        assertFalse(contentPane);

    }


}
