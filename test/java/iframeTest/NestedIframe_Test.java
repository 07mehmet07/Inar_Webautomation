package iframeTest;

import BaseTest.Hooks;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
/**
 * 1. Land on home page
 * 2. Click on webautomation link
 * 3.Click on Iframe link
 * 4.Click on Nested Iframe link
 * 5.Verify that the header text "Join Inar Academy'sIntro Session" In iframe
 */
public class NestedIframe_Test extends Hooks {

    @Test
    void testNestedIframe(){
        //1. Land on home page
        //2. Click on webautomation link
        pages.getHomePage().clickOnWebAutomationLink();


        //3.Click on Iframe link
        pages.getWebAutomationPage().clickOnIframeLink();


        //4.Click on Nested Iframe link
        pages.getWebAutomationPage().clickOnNestedIframe();

        //5.Verify that the header text "Join Inar Academy'sIntro Session" In iframe
        String expectedHeader = "Join Inar Academy's\n" +
                "Intro Session";


        String actualHeader = pages.getNestedIframePage().getHeaderInFrame();
        assertEquals(expectedHeader, actualHeader);


    }
}
