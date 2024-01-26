package droppableTest;

import BaseTest.Hooks;
import org.openqa.selenium.Point;
import org.testng.annotations.Test;
import utils.BrowserUtils;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

/**
 * 1. Open the browser and navigate to the page
 * 2. click on the droppable button
 * 3. click on the revert draggable button
 * 4. Drag the first draggable element and drop it to the target element
 * 5. Verify that the first draggable element has not been dropped to the target element
 * 6. Drag the second draggable element and drop it to the target element
 * 7. Verify that the second draggable element has been dropped to the target element
 */
public class Revert_Draggable_Position_Test extends Hooks {

    @Test
    public void testRevertDraggablePosition() {

        //1. Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();

        //2. click on the droppable button
        pages.getWebAutomationPage().clickOnDroppableLink();

        //3. click on the revert draggable button
        pages.getWebAutomationPage().clickOnRevertDraggablePositionLink();

        //4. Drag the first draggable element and drop it to the target element
        Point initialLocationOfReturnigBox = pages.getRevertDraggablePosition().getLocationOfReturningBox();
        pages.getRevertDraggablePosition().dragAndDropForReturningBox();
        BrowserUtils.wait(1.5);

        //5. Verify that the first draggable element has not been dropped to the target element
        Point finalLocationOfReturnigBox = pages.getRevertDraggablePosition().getLocationOfReturningBox();
        assertEquals(initialLocationOfReturnigBox, finalLocationOfReturnigBox, "First Box can not stay in the Target box");

        //6. Drag the second draggable element and drop it to the target element
        Point initialLocationOfNonReturnigBox = pages.getRevertDraggablePosition().getLocationOfNonReturningBox();
        pages.getRevertDraggablePosition().dragAndDropForNonReturningBox();
        BrowserUtils.wait(2.5);

        // 7. Verify that the second draggable element has been dropped to the target element
        Point finalLocationOfNonReturningBox = pages.getRevertDraggablePosition().getLocationOfNonReturningBox();
        assertNotEquals(initialLocationOfNonReturnigBox, finalLocationOfNonReturningBox, "Second box stays in the target box");
    }

}
