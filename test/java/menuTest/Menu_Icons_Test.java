package menuTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * 1-Open the url and navigate to Icons link
 * 2-Hover on "Playback" element
 * 3-Verify that there is a menu for the element
 */

public class Menu_Icons_Test extends Hooks {

    @Test
    public void testIconsTab() {

        //* 1-Open the url and navigate to Icons link
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickOnMenuLink();
        pages.getWebAutomationPage().clickOnIconsLink();

        //2-Hover on "Playback" element
        pages.getIconsPage().hoverOnPlayback();

        //3-Verify that there is a menu for the element
        List<String> elements = pages.getIconsPage().selectElementsOfPlayback();
        assertTrue(elements.size() > 0);

    }
}
