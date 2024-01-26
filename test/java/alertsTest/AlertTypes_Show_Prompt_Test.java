package alertsTest;

import BaseTest.Hooks;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
/**
 * 1. Land on home page
 * 2. click on web automation link
 * 3. click on the Alerts button
 * 4. click on the Alert Types button
 * 5. click on the Show Prompt button
 * 6. verify that alert text is "Enter your name:"
 * 7. Enter "Mehmet Aykut" as a name to the text box
 * 8. confirm the alert
 * 9. Verify that alert text is "Hello, Mehmet Aykut!"
 * 10. confirm the alert
 * 11. click on the Show Prompt button
 * 12. cancel the alert
 */
public class AlertTypes_Show_Prompt_Test extends Hooks {

    @Test
    void testShowPrompt() {

        //1. Land on home page
        //2. click on web automation link
        pages.getHomePage().clickOnWebAutomationLink();

        //3. click on the Alerts button
        pages.getWebAutomationPage().clickOnAlertsLink();

        //5. click on the Show Prompt button
        pages.getAlertTypesPage().clickOnPromptButton();

        //6. verify that alert text is "Enter your name:"
        String expectedAlert = "Enter your name:";
        String actualAlert = pages.getAlertTypesPage().getTextOfTheAlert();
        assertEquals(expectedAlert, actualAlert);

        //7. Enter "Mehmet Aykut" as a name to the text box
        pages.getAlertTypesPage().enterInputIntoAlert("Mehmet Aykut");

        //8. confirm the alert
        pages.getAlertTypesPage().confirmTheAlert();

        //9. Verify that alert text is "Hello, Mehmet Aykut!"
        String expectedInput = "Hello, Mehmet Aykut!";
        String actualInput = pages.getAlertTypesPage().getTextOfTheAlert();
        assertEquals(expectedInput, actualInput);

        //10. confirm the alert
        pages.getAlertTypesPage().confirmTheAlert();

        //11. click on the Show Prompt button
        pages.getAlertTypesPage().clickOnPromptButton();

        //12. cancel the alert
        pages.getAlertTypesPage().cancelTheAlert();


    }

}
