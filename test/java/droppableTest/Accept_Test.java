package droppableTest;

import BaseTest.Hooks;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * 1. Open the browser and navigate to the page
 * 2. click on the droppable button
 * 3. click on the accept button
 * 4. Drag the first draggable element and drop it to the accept droppable element
 * 5. Verify that the first draggable element has not been dropped to the accept droppable element
 * 6. Drag the second draggable element and drop it to the accept droppable element
 * 7. Verify that the second draggable element has been dropped to the accept droppable element
 */

public class Accept_Test extends Hooks {

    @Test
    public void testAccept() {

        //1. Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();

        //2. click on the droppable button
        pages.getWebAutomationPage().clickOnDroppableLink();

        //3. click on the accept button
        pages.getWebAutomationPage().clickOnAcceptLink();

        //4. Drag the first draggable element and drop it to the accept droppable element
        pages.getAcceptPage().dragNonDroppableElement();

        //5. Verify that the first draggable element has not been dropped to the accept droppable element
        String expectedMessage = "accept: '#draggable'";
        String actualMessage = pages.getAcceptPage().getTitleOfTargetElement();
        assertEquals(expectedMessage, actualMessage);

        //6. Drag the second draggable element and drop it to the accept droppable element
        pages.getAcceptPage().dragDroppableElement();

        //7. Verify that the second draggable element has been dropped to the accept droppable element
        String expectedMessage2 = "Dropped!";
        String actualMessage2 = pages.getAcceptPage().getTitleOfTargetElement();
        assertEquals(expectedMessage2, actualMessage2);


    }


}
