package iframeTest;

import BaseTest.Hooks;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
/**
 * 1. Land on home page
 * 2. Click on webautomation link
 * 3.Click on Iframe link
 * 4.Click on Normal Iframe link
 * 5.Verify that the header text "Inar academy" In iframe
 * 6. Exit from the iframe
 * 7. verify condition that more information button in iframe works successfully
 */

public class NormalIframe_Test extends Hooks {
    @Test
    public void testIframeNormal() {
        // 1. Land on home page
        // 2. Click on webautomation link
        pages.getHomePage().clickOnWebAutomationLink();

        //3.Click on Iframe link
        //4.Click on Normal Iframe link
        pages.getWebAutomationPage().clickOnIframeLink();

        //5.Verify that the header text "Inar academy" In iframe
        String expectedHeader = "Inar academy";
        String actualHeader = pages.getNormalPage().getTitleOfIframe();
        assertEquals(expectedHeader, actualHeader);

        //6.Exit from the iframe
        pages.getNormalPage().switchToParentFrame();

        //7.verify condition that more information button in iframe works successfully
        String expectedText = "Example Domains";
        String actualText = pages.getNormalPage().getTitleOfIframe();
        assertEquals(expectedText, actualText);

    }
}
