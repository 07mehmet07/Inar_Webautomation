package buttonTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;

public class WithIconTest extends Hooks {

    @Test
    public void withIconTest(){

        pages.getHomePage().clickOnWebAutomationLink();

        pages.getWebAutomationPage().clickOnButtonLink();

        pages.getWebAutomationPage().clickOnWithIconLink();

        pages.getWithIconPage().clickOnWidgetButtons();

        pages.getWithIconPage().clickOnCssButtons();






    }
}
