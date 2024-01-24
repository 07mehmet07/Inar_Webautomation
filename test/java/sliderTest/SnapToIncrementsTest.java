package sliderTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SnapToIncrementsTest extends Hooks {

    @Test
    public void snapToIncrementsTest() {
        pages.getHomePage().clickOnWebAutomationLink();

        BrowserUtils.scrollDownWithPageDown();
        pages.getWebAutomationPage().clickOnSlider();

        pages.getWebAutomationPage().clickOnSnapToIncrements();
        BrowserUtils.scrollUpWithPageUp();
        String initialValue = pages.getSnapToIncrements().getMoneyAmount();

        pages.getSnapToIncrements().dragAndDropButton(50, 0);

        String finalValue = pages.getSnapToIncrements().getMoneyAmount();

        int finalInt = Integer.parseInt(finalValue);
        int initialInt = Integer.parseInt(initialValue);
        int disparity = finalInt - initialInt;


        assertEquals(50, disparity);
    }

}
