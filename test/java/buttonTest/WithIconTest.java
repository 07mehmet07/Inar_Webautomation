package buttonTest;

import BaseTest.Hooks;
import org.testng.annotations.Test;

/**
 * 1. Navigate to the WebAutomation page
 * 2. Click on the Droppable button
 * 3. Click on the Accept button
 * 4. Click on widget elements respectively
 * 5. Click on css elements respectively
 */

public class WithIconTest extends Hooks {

    @Test
    public void withIconTest() {

        //1. Navigate to the WebAutomation page
        pages.getHomePage().clickOnWebAutomationLink();

        //2. Click on the Droppable button
        pages.getWebAutomationPage().clickOnButtonLink();

        //3. Click on the Accept button
        pages.getWebAutomationPage().clickOnWithIconLink();

        //4. Click on widget elements respectively
        pages.getWithIconPage().clickOnWidgetButtons();

        //5. Click on css elements respectively
        pages.getWithIconPage().clickOnCssButtons();


    }
}
