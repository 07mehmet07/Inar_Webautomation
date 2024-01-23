package controlgruopTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * 1.Open the browser and navigate to the page
 * 2.Enter the "%150" for zoom , "Red" for background color and "Blue" for text color
 * 3.Click on bold , italic and underline buttons
 * 4.Verify all changes are done successfully
 */

public class ToolBar_Test extends Hooks {

    @Test
    public void toolbarTest() {

        //1.Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickOnControlGroup();

        //2.Enter the "%150" for zoom , "Red" for background color and "Blue" for text color and
        String initialValues = pages.getToolbarTab().style();
        pages.getToolbarTab().selectAll("150%", "Red", "Blue");
        pages.getToolbarTab().clickOnAllButtons();

        //3.Click on bold , italic and underline buttons
        pages.getToolbarTab().clickOnPrintButton();

        //4.Verify all changes are done successfully
        String finalValues = pages.getToolbarTab().style();
        assertNotEquals(initialValues, finalValues);


    }
}
