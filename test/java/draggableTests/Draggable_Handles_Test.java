package draggableTests;

import BaseTest.Hooks;
import org.openqa.selenium.Point;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

/**
 * 1-Open the url and navigate to handles link
 * 2-Drag the first draggable element to the right and below and drop
 * 3-Verify the element that move from handle
 * 4-Drag the second draggable element to the right and below and drop for text area in box
 * 5-Verify the text area does not move in second box
 * 6-Drag the second draggable element to the right and below and drop
 * 7-Verify the element that move from handle
 */
public class Draggable_Handles_Test extends Hooks {
    @Test
    public void testHandlesPage() {

        //1-Open the url and navigate to handles link
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickOnDraggableLink();
        pages.getWebAutomationPage().clickOnHandlesLink();

        //2-Drag the first draggable element to the right and below and drop
        Point initialOfFirstDraggableElement = pages.getHandlesPage().locationOfFirstDraggableElement();
        pages.getHandlesPage().dragAndDropFirstDraggableElement(50, 50);

        //3-Verify the element that move from handle
        Point finalOfFirstDraggableElement = pages.getHandlesPage().locationOfFirstDraggableElement();
        assertTrue(finalOfFirstDraggableElement.getX() > initialOfFirstDraggableElement.getX());
        assertTrue(finalOfFirstDraggableElement.getY() > initialOfFirstDraggableElement.getY());

        //4-Drag the second draggable element to the right and below and drop for text area in box
        Point initialOfSecondDraggableElement = pages.getHandlesPage().locationOfSecondDraggableElement();
        pages.getHandlesPage().dragAndDropSecondDraggableElement(2, 30, 30);

        //5-Verify the text area does not move in second box
        Point finalOfSecondDraggableElement = pages.getHandlesPage().locationOfSecondDraggableElement();
        assertEquals(finalOfSecondDraggableElement.getX(), initialOfSecondDraggableElement.getX());
        assertEquals(finalOfSecondDraggableElement.getY(), initialOfSecondDraggableElement.getY());

        //6-Drag the second draggable element to the right and below and drop
        pages.getHandlesPage().dragAndDropSecondDraggableElement(1, 50, 50);

        //7-Verify the element that move from handle
        finalOfSecondDraggableElement = pages.getHandlesPage().locationOfSecondDraggableElement();
        Assert.assertNotEquals(initialOfSecondDraggableElement.getX(), finalOfSecondDraggableElement.getX());
        Assert.assertNotEquals(initialOfSecondDraggableElement.getY(), finalOfSecondDraggableElement.getY());

    }

}
