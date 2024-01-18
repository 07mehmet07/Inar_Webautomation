package selectableTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * 1. Open the browser and navigate to the URL
 * 2. Click on webautomation link
 * 3. Click on Selectable button
 * 4. Click on Serialize button
 * 5. Click on Item 5
 * 6. Verify that Item 5 is selected
 * 7. Verify that "You've selected: #5" is displayed
 * 8. Click on Item 6
 * 9. Verify that Item 6 is selected
 * 10. Verify that "You've selected: #6" is displayed
 * 11. Click on Item 1, Item 3 by holding down the Ctrl key
 * 12. Verify that Item 1, Item 3 are selected
 * 13. Verify that "You've selected: #1 #3 #6" is displayed(6 selected because Item 6 is still selected)
 * 14. Click on Item 1, Item2, Item 3 by holding mouse down and dragging
 * 15. Verify that Item 1, Item 2, Item 3 are selected
 * 16. Verify that "You've selected: #1 #2 #3" is displayed
 */

public class Selectable_Select_Test extends Hooks {

    @Test
    public void selectableSelect() {
        //1. Open the browser and navigate to the URL
        //2. Click on webautomation link
        pages.getHomePage().clickOnWebAutomationLink();

        //3. Click on Selectable button
        pages.getWebAutomationPage().clickOnSelectableLink();

        //4. Click on Serialize button
        pages.getWebAutomationPage().clickOnSerializeLink();

        //5. Click on Item 5
        pages.getSerializePage().clickOnElementByIndex(5);

        // 6. Verify that Item 5 is selected
        assertTrue(pages.getSerializePage().isTheItemSelectedByIndex(5));

        //7. Verify that "You've selected: #5" is displayed
        String expectedResult = "#5";
        String actualResult = pages.getSerializePage().getTextResult();
        assertEquals(expectedResult, actualResult);

        //8. Click on Item 6
        pages.getSerializePage().clickOnElementByIndex(6);

        //9. Verify that Item 6 is selected
        assertTrue(pages.getSerializePage().isTheItemSelectedByIndex(6));

        //10. Verify that "You've selected: #6" is displayed
        String expectedResult1 = "#6";
        String actualResult1 = pages.getSerializePage().getTextResult();
        assertEquals(expectedResult1, actualResult1);

        //11. Click on Item 1, Item 3 by holding down the Ctrl key
        pages.getSerializePage().clickOnElementsWithCtrl(1, 3);

        //12. Verify that Item 1, Item 3 are selected
        assertTrue(pages.getSerializePage().isTheItemSelectedByIndex(1));
        assertTrue(pages.getSerializePage().isTheItemSelectedByIndex(3));

        //13. Verify that "You've selected: #1 #3 #6" is displayed(6 selected because Item 6 is still selected)
        String expectedResult2 = "#1 #3 #6";
        String actualResult2 = pages.getSerializePage().getTextResult();
        assertEquals(expectedResult2, actualResult2);

        //14. Click on Item 1, Item2, Item 3 by holding mouse down and dragging
        pages.getSerializePage().clickOnElementsWithDraggingMouse(1, 2, 3);

        //15. Verify that Item 1, Item 2, Item 3 are selected
        assertTrue(pages.getSerializePage().isTheItemSelectedByIndex(1));
        assertTrue(pages.getSerializePage().isTheItemSelectedByIndex(2));
        assertTrue(pages.getSerializePage().isTheItemSelectedByIndex(3));

        //16. Verify that "You've selected: #1 #2 #3" is displayed
        String expectedResult3 = "#1 #2 #3";
        String actualResult3 = pages.getSerializePage().getTextResult();
        assertEquals(expectedResult3, actualResult3);


    }


}
