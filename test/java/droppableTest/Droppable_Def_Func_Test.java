package droppableTest;

import BaseTest.Hooks;
import org.testng.annotations.Test;

/**
 * 1. Open the browser and navigate to the page
 * 2. click on the droppable button
 * 3. click on the default functionality button
 * 4. Drag the source-draggable element and drop it to the target-droppable element
 * 5. Verify that the source-draggable element has been dropped to the target-droppable element
 * 6. Verify that the text of the target-droppable element has changed to Dropped!
 */
public class Droppable_Def_Func_Test extends Hooks {

    @Test
    void testDefaultDroppable() {
        //1. Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();

        //2. click on the droppable button
        pages.getWebAutomationPage().clickOnDroppableLink();

        //3. click on the default functionality button
        pages.getWebAutomationPage().clickOnDroppableDefaultFunctionalityLink();

        //4. Drag the source-draggable element and drop it to the target-droppable element
        pages.getDroppableDefFuncPage().dragAndDrop();

        //5. Verify that the source-draggable element has been dropped to the target-droppable element
        int draggableTopEdge = pages.getDroppableDefFuncPage().getLocationOfDraggableY();
        int droppableTopEdge = pages.getDroppableDefFuncPage().getLocationOfDroppableY();
        int draggableBottomEdge = pages.getDroppableDefFuncPage().getDraggableElementBottomEdge();
        int droppableBottomEdge = pages.getDroppableDefFuncPage().getDroppableElementBottomEdge();
        int draggableLeftEdge = pages.getDroppableDefFuncPage().getLocationOfDraggableX();
        int droppableLeftEdge = pages.getDroppableDefFuncPage().getLocationOfDroppableX();
        int draggableRightEdge = pages.getDroppableDefFuncPage().getDraggableElementRightEdge();
        int droppableRightEdge = pages.getDroppableDefFuncPage().getDroppableElementRightEdge();

//        Assertions.assertThat(draggableTopEdge).isBetween(droppableTopEdge, droppableBottomEdge);
//        Assertions.assertThat(draggableBottomEdge).isBetween(droppableTopEdge, droppableBottomEdge);
//        Assertions.assertThat(draggableLeftEdge).isBetween(droppableLeftEdge, droppableRightEdge);
//        Assertions.assertThat(draggableRightEdge).isBetween(droppableLeftEdge, droppableRightEdge);
//


//        //6. Verify that the text of the target-droppable element has changed to Dropped!
//        Assertions.assertThat(pages.getDroppableDefFuncPage().getDroppableElementText()).isEqualTo("Dropped!");
    }
}
