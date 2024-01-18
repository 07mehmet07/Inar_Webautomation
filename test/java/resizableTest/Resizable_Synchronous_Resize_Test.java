package resizableTest;

import BaseTest.Hooks;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;

/**
 * 1.Open the browser and navigate to the page
 * 2.Click on the resizable button
 * 3.Click on the Synchronus Resize button
 * 4.Drag the resize handle to resize the resizable element
 * 5.Verify that the resizable element  and the Synchronus element have been resized
 */

public class Resizable_Synchronous_Resize_Test extends Hooks {

    @Test
    public void testSynchronousResize() {
        //1.Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();

        //2.Click on the resizable button
        pages.getWebAutomationPage().clickOnResizableLink();

        //3.Click on the Synchronus Resize button
        pages.getWebAutomationPage().clickSynchronusResizeLink();

        //initial size of web element
        Dimension initialDimensionOfMainElement = pages.getSynchronousResize().getDimensionOfMainBox();
        Dimension initialDimensionOfAlsoElement = pages.getSynchronousResize().getDimensionOfAlsoBox();

        //4.Drag the resize handle to resize the resizable element
        pages.getSynchronousResize().pullHoldingElement(50, 50);

        //5.Verify that the resizable element  and the Synchronus element have been resized
        Dimension finalDimensionOfMainElement = pages.getSynchronousResize().getDimensionOfMainBox();
        Dimension finalDimensionOfAlsoElement = pages.getSynchronousResize().getDimensionOfAlsoBox();

        Assertions.assertThat(finalDimensionOfMainElement.getWidth()).isGreaterThan(initialDimensionOfMainElement.getWidth());
        Assertions.assertThat(finalDimensionOfMainElement.getHeight()).isGreaterThan(initialDimensionOfMainElement.getHeight());

        Assertions.assertThat(finalDimensionOfAlsoElement.getWidth()).isGreaterThan(initialDimensionOfAlsoElement.getWidth());
        Assertions.assertThat(finalDimensionOfAlsoElement.getHeight()).isGreaterThan(initialDimensionOfAlsoElement.getHeight());
    }

}

