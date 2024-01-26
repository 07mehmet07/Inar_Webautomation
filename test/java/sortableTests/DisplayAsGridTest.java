package sortableTests;

import BaseTest.Hooks;
import org.testng.annotations.Test;
import utils.BrowserUtils;

import static org.testng.Assert.assertNotEquals;
import static org.testng.AssertJUnit.assertEquals;

/**
 * 1. Open the browser and navigate to the URL
 * 2. Click on Web automation link
 * 3. Click on Sortable button
 * 4. Click on Display as grid button
 * 5. Hold '1' and move it to place of '6'
 * 6. Verify that location of '1' is now '6'
 * 7. Verify that arrangement of numbers changed
 */

public class DisplayAsGridTest extends Hooks {

    private final String moveToNumber = "1";
    private final String destinationNumber = "6";

    @Test
    public void testDisplayAsGridTab() {

        //1. Open the browser and navigate to the URL
        //2. Click on Web automation link
        pages.getHomePage().clickOnWebAutomationLink();

        //3. Click on Sortable button
        pages.getWebAutomationPage().clickOnSortable();

        //4. Click on Display as grid button
        pages.getWebAutomationPage().clickOnDisplay();

        //5. Hold '1' and move it to place of '6'
        BrowserUtils.scrollDownWithPageDown();
        BrowserUtils.wait(1);
        String initialArrangement = pages.getDisplayAsGrid().lineageOfNumbers();
        pages.getDisplayAsGrid().moveElementByOffset(moveToNumber, 110, 100);

        //6. Verify that location of '1' is now '6'
        String expectedLocation = moveToNumber;
        String actualLocation = pages.getDisplayAsGrid().getNumberElementLocation(destinationNumber);
        assertEquals(expectedLocation, actualLocation);

        //7. Verify that arrangement of numbers changed
        String finalArrangement = pages.getDisplayAsGrid().lineageOfNumbers();
        assertNotEquals(initialArrangement, finalArrangement);

    }
}
