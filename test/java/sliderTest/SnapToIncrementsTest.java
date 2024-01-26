package sliderTest;

import BaseTest.Hooks;
import org.testng.annotations.Test;

import utils.BrowserUtils;

import static org.testng.AssertJUnit.assertEquals;

/**
 * 1. Open the browser and navigate to the URL
 * 2. Click on Web automation link
 * 3. Click on Slider button
 * 4. Click on Snap to Increments button
 * 5. Get initial donation amount
 * 6. Slide 'slide bar' to left
 * 7. Verify that donation amount increased
 * 8. Verify that donation amount increased $50 amount
 */

public class SnapToIncrementsTest extends Hooks {

    @Test
    public void snapToIncrementsTest() {

        //1. Open the browser and navigate to the URL
        //2. Click on Web automation link
        pages.getHomePage().clickOnWebAutomationLink();

        //3. Click on Slider button
        BrowserUtils.scrollDownWithPageDown();
        pages.getWebAutomationPage().clickOnSlider();

        //4. Click on Snap to Increments button
        pages.getWebAutomationPage().clickOnSnapToIncrements();
        BrowserUtils.scrollUpWithPageUp();

        //5. Get initial donation amount
        String initialValue = pages.getSnapToIncrements().getMoneyAmount();

        //6. Slide 'slide bar' to left
        pages.getSnapToIncrements().dragAndDropButton(50, 0);
        String finalValue = pages.getSnapToIncrements().getMoneyAmount();

        //7. Verify that donation amount increased $50 amount
        int finalInt = Integer.parseInt(finalValue);
        int initialInt = Integer.parseInt(initialValue);
        int disparity = finalInt - initialInt;
        assertEquals(50, disparity);
    }

}
