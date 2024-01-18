package menuTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Menu_Icons_Test extends Hooks {
    @Test
    public void testIconsTab() {
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickOnMenuLink();
        pages.getWebAutomationPage().clickOnIconsLink();

        pages.getIconsPage().hoverOnPlayback();
        List<String> elements= pages.getIconsPage().selectElementsOfPlayback();
        assertTrue(elements.size() > 0);
    }
}
