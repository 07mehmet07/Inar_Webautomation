package controlgruopTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ToolBar_Test extends Hooks {

    @Test
    public void toolbarTest() {

        pages.getHomePage().clickOnWebAutomationLink();

        pages.getWebAutomationPage().clickOnControlGroup();

        String initialValues = pages.getToolbarTab().style();

        pages.getToolbarTab().selectAll("150%", "Red", "Blue");

        pages.getToolbarTab().clickOnAllButtons();

        pages.getToolbarTab().clickOnPrintButton();

        String finalValues = pages.getToolbarTab().style();
        assertNotEquals(initialValues, finalValues);


    }
}
