package draggableTests;

import BaseTest.Hooks;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.Pages;

public class Draggable_Def_Functionality_Test extends Hooks {
    Pages pages = new Pages();

    @Test
    public void testDefaultDraggable() {
        pages.getHomePage().clickOnWebAutomationLink();

        // 2. click on the draggable button
        pages.getWebAutomationPage().clickOnDraggableLink();

        // 3. click on the default functionality button
        pages.getWebAutomationPage().clickOnDraggableDefaultFunctionalityLink();

        // get the initial location of draggable element
        int initialX = pages.getDraggableDefFuncPage().getLocationOfDraggableX();
        int initialY = pages.getDraggableDefFuncPage().getLocationOfDraggableY();

        // 4. Drag the draggable element by 100 pixels to the right and 100 pixels down
        pages.getDraggableDefFuncPage().dragAndDropByOffsets(100, 100);

        // 5. Verify that the element has been dragged
        int finalX = pages.getDraggableDefFuncPage().getLocationOfDraggableX();
        int finalY = pages.getDraggableDefFuncPage().getLocationOfDraggableY();

        Assertions.assertThat(finalX).isGreaterThan(initialX);
        Assertions.assertThat(finalY).isGreaterThan(initialY);
        //Assertions.assertTrue(finalX > initialX);
    }
}
