package alertsTest;

import BaseTest.Hooks;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import utils.BrowserUtils;

/**
 * 1. Land on home page
 * 2. click on web automation link
 * 3. click on the Alerts button
 * 4. click on the Alert Types button
 * 5. click on the Show Alert button
 * 6. verify that alert text is "This is an alert!"
 * 7. confirm the alert
 *
 */
public class AlertTypes_ShowAlert_Test extends Hooks {

    @Test
    void testShowAlert(){
        //1. Land on home page
        //2. click on web automation link
        pages.getHomePage().clickOnWebAutomationLink();

        BrowserUtils.scrollDownWithPageDown();

        //3. click on the Alerts button
        pages.getWebAutomationPage().clickOnAlertsLink();

        BrowserUtils.scrollUpWithPageUp();

        //4. click on the Alert Types button
        //5. click on the Show Alert button
        pages.getAlertTypesPage().clickOnShowAlertButton();

        BrowserUtils.wait(2);

        //6. verify that alert text is "This is an alert!"
        String expectedText = "This is an alert!";
        String actualText = pages.getAlertTypesPage().getTextOfTheAlert();
        assertEquals(expectedText, actualText, "Wrong Text Prompted !");

        BrowserUtils.wait(2);

        //7. confirm the alert
        pages.getAlertTypesPage().confirmTheAlert();
    }
}
