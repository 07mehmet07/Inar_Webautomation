package spinnerTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpinnerOverflowTest extends Hooks {

    @Test
    public void spinnerOverFlowTest() {
        pages.getHomePage().clickOnWebAutomationLink();

        pages.getWebAutomationPage().clickOnSpinnerTab();

        pages.getWebAutomationPage().clickOnSpinnerOverFlowTab();

        pages.getSpinnerOverflow().clickOnUpButton(6);

        int upClickAfter10 = pages.getSpinnerOverflow().getValue();

        assertEquals(-10, upClickAfter10);

        pages.getSpinnerOverflow().clickDownButton(1);

        int downClickAfter_10 = pages.getSpinnerOverflow().getValue();

        assertEquals(10, downClickAfter_10);

    }
}
