package acordion;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;

public class CollapseContentTest extends Hooks {


    @Test
    public void CollapseContentTesting() {

        pages.getHomePage().clickOnWebAutomationLink();

        pages.getWebAutomationPage().ClickOnAcordion();

        pages.getWebAutomationPage().ClickOnCollapseContent();

        pages.getCollapseContentPage().clickOnClicksOnSectoin(0);

        boolean contentPane = pages.getCollapseContentPage().isContentPaneOpenFor();

        System.out.println(contentPane);

        pages.getCollapseContentPage().clickOnSecondAccordionElement();

        contentPane = pages.getCollapseContentPage().isContentPaneOpenFor();

        System.out.println(contentPane);



    }


}
