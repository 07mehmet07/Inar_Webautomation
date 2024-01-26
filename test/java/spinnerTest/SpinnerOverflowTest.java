package spinnerTest;

import BaseTest.Hooks;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * 1. Open the browser and navigate to the URL
 * 2. Click on Web automation link
 * 3. Click on Spinner button
 * 4. Click on spinner overflow button
 * 5. Verify navigate to -10 with up button
 * 6. Verify navigate to 10 with down button
 */

public class SpinnerOverflowTest extends Hooks {

    @Test
    public void spinnerOverFlowTest() {

        //1. Open the browser and navigate to the URL
        //2. Click on Web automation link
        pages.getHomePage().clickOnWebAutomationLink();

        //3. Click on Spinner button
        pages.getWebAutomationPage().clickOnSpinnerTab();

        //4. Click on spinner overflow button
        pages.getWebAutomationPage().clickOnSpinnerOverFlowTab();

        //5. Verify navigate to -10 with up button
        pages.getSpinnerOverflow().clickOnUpButton(6);
        int upClickAfter10 = pages.getSpinnerOverflow().getValue();
        assertEquals(-10, upClickAfter10);

        //6. Verify navigate to 10 with down button
        pages.getSpinnerOverflow().clickDownButton(1);
        int downClickAfter_10 = pages.getSpinnerOverflow().getValue();
        assertEquals(10, downClickAfter_10);

    }
}
