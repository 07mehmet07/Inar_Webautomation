package acordion;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class CollapseContentTest extends Hooks {


    @Test
    public void CollapseContentTesting() {

        pages.getHomePage().clickOnWebAutomationLink();

        pages.getWebAutomationPage().ClickOnAcordion();

        pages.getWebAutomationPage().ClickOnCollapseContent();

        pages.getCollapseContentPage().clickOnClicksOnSectoin(0);
        BrowserUtils.wait(2);

        boolean contentPane = pages.getCollapseContentPage().isDisplayed();

        System.out.println(contentPane);

        assertFalse(contentPane);

       // pages.getCollapseContentPage().clickOnSecondAccordionElement();

        //contentPane = pages.getCollapseContentPage().isContentPaneOpenFor();

       // System.out.println(contentPane);



    }


}
