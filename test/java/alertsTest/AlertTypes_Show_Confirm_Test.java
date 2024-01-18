package alertsTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 1. Land on home page
 * 2. click on web automation link
 * 3. click on the Alerts button
 * 4. click on the Alert Types button
 * 5. click on the Show Confirm button
 * 6. verify that alert text is "Are you sure?"
 * 7. confirm the alert
 * 8. verify that alert text is "Confirmed!"
 * 9. confirm the alert
 * 10. click on the Show Alert button
 * 11. cancel the alert
 */
public class AlertTypes_Show_Confirm_Test extends Hooks {

    @Test
    void testAlertShowConfirm() {

        //1. Land on home page
        //2. click on web automation link
        pages.getHomePage().clickOnWebAutomationLink();

        //3. click on the Alerts button
        //4. click on the Alert Types button
        pages.getWebAutomationPage().clickOnAlertsLink();

        //5. click on the Show Confirm button
        pages.getAlertTypesPage().clickOnShowConfirmButton();

        //6. verify that alert text is "Are you sure?"
        String expectedAlertMessage = "Are you sure?";
        String actualAlertMessage = pages.getAlertTypesPage().getTextOfTheAlert();
        assertEquals(expectedAlertMessage, actualAlertMessage);

        //7. confirm the alert
        pages.getAlertTypesPage().confirmTheAlert();

        //8. verify that alert text is "Confirmed!"
        String expectedAlertMessage1 = "Confirmed!";
        String actualAlertMessage1 = pages.getAlertTypesPage().getTextOfTheAlert();
        assertEquals(expectedAlertMessage1, actualAlertMessage1);

        //9. confirm the alert
        pages.getAlertTypesPage().confirmTheAlert();

        //10. click on the Show Alert button
        pages.getAlertTypesPage().clickOnShowConfirmButton();

        //11. cancel the alert
        pages.getAlertTypesPage().cancelTheAlert();
    }
}
