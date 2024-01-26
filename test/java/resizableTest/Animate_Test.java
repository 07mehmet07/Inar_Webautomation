package resizableTest;

import BaseTest.Hooks;
import org.testng.annotations.Test;
import utils.BrowserUtils;

import static org.testng.Assert.assertTrue;

/**
 * 1. Open the browser and navigate to the page
 * 2. Click on the resizable button
 * 3. Click on the animate button
 * 4. Drag the resize handle to resize the resizable element
 * 5. Get the initial size of the resizable element
 * 6. Wait for 2 seconds to see the result
 * 7. Verify that the resizable element is being resized
 */
public class Animate_Test extends Hooks {

    @Test
    void testAnimate(){
        //1. Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();

        //2. Click on the resizable button
        pages.getWebAutomationPage().clickOnResizableLink();

        //3. Click on the animate button
        pages.getWebAutomationPage().clickOnAnimateLink();

        //get initial size
        int initialWidth = pages.getAnimatePage().getWidthReleasePerformed();
        int initialHeight = pages.getAnimatePage().getHeightReleasePerformed();

        System.out.println("initialWidth -> " + initialWidth);
        System.out.println("initialHeight -> " + initialHeight);

        //4. Drag the resize handle to resize the resizable element
        pages.getAnimatePage().resizeTheWebElementByOffsets(100,100);

        //5. Get the size1 of the resizable element
        int width1 = pages.getAnimatePage().getWidthReleasePerformed();
        int height1 = pages.getAnimatePage().getHeightReleasePerformed();

        System.out.println(" W1  -> " + width1);
        System.out.println(" H1 -> " + height1);



        //wait 1 second
        BrowserUtils.wait(1);

        //6. Get the size2 of the element
        int width2 = pages.getAnimatePage().getWidthReleasePerformed();
        int height2 = pages.getAnimatePage().getHeightReleasePerformed();

        System.out.println(" W2  -> " + width2);
        System.out.println(" H2 -> " + height2);


        //Verify that size1 is greater than initial size
       assertTrue(width1 > initialWidth);
       assertTrue(height1 > initialHeight);

        //Verify that size2 is greater than size1
        assertTrue(width2 > initialWidth);
        assertTrue(height2 > initialHeight);

    }
}
