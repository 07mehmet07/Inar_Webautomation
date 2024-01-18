package selectableTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 1. Open the browser and navigate to the URL
 * 2. Click on webautomation link
 * 3. Click on Selectable button
 * 4. Click on Default Functionality button
 * 5. Click on Item 5
 * 6. Verify that Item 5 is selected
 * 7. Click on Item 7
 * 8. Verify that Item 7 is selected
 * 9. Verify that Item 5 is not selected
 * 10. Click on Item 1, Item 3, Item 5, Item 6 by holding down the Ctrl key
 * 11. Verify that Item 1, Item 3, Item 5, Item 6 are selected
 * 12. Click on Item 1, Item2, Item 3 by holding mouse down and dragging
 * 13. Verify that Item 1, Item 2, Item 3 are selected
 */
public class Selectable_DefFunc_Test extends Hooks {

    @Test
    void testSelectableDefFunc(){
        //1. Open the browser and navigate to the URL
        //2. Click on webautomation link
        pages.getHomePage().clickOnWebAutomationLink();

        //3. Click on Selectable button
        pages.getWebAutomationPage().clickOnSelectableLink();

        //4. Click on Default Functionality button
        pages.getWebAutomationPage().clickOnDefaultFunctionality();

        //5. Click on Item 5
        pages.getSelectableDefFuncPage().clickOnElementByIndex(5);

        //6. Verify that Item 5 is selected
        Assertions.assertTrue(pages.getSelectableDefFuncPage().isTheItemSelectedByIndex(5), "Not able to selected");

        //7. Click on Item 7
        pages.getSelectableDefFuncPage().clickOnElementByIndex(7);

        //8. Verify that Item 7 is selected
        Assertions.assertTrue(pages.getSelectableDefFuncPage().isTheItemSelectedByIndex(7), "Not able to selected");

        //9. Verify that Item 5 is not selected
        Assertions.assertFalse(pages.getSelectableDefFuncPage().isTheItemSelectedByIndex(5),"It is still selected");

        //10. Click on Item 1, Item 3, Item 5, Item 6 by holding down the Ctrl key
        pages.getSelectableDefFuncPage().clickOnElementsWithCtrl(1,3,5,6);

        //11. Verify that Item 1, Item 3, Item 5, Item 6 are selected
        Assertions.assertTrue(pages.getSelectableDefFuncPage().isTheItemSelectedByIndex(1), "Not able to selected");
        Assertions.assertTrue(pages.getSelectableDefFuncPage().isTheItemSelectedByIndex(3), "Not able to selected");
        Assertions.assertTrue(pages.getSelectableDefFuncPage().isTheItemSelectedByIndex(5), "Not able to selected");
        Assertions.assertTrue(pages.getSelectableDefFuncPage().isTheItemSelectedByIndex(6), "Not able to selected");

        //12. Click on Item 1, Item2, Item 3 by holding mouse down and dragging
        pages.getSelectableDefFuncPage().clickOnElementsWithDraggingMouse(1,2,3);

        //13. Verify that Item 1, Item 2, Item 3 are selected
        Assertions.assertTrue(pages.getSelectableDefFuncPage().isTheItemSelectedByIndex(1), "Not able to selected");
        Assertions.assertTrue(pages.getSelectableDefFuncPage().isTheItemSelectedByIndex(2), "Not able to selected");
        Assertions.assertTrue(pages.getSelectableDefFuncPage().isTheItemSelectedByIndex(3), "Not able to selected");

    }
}
