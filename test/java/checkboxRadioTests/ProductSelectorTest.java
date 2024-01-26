package checkboxRadioTests;

import BaseTest.Hooks;
import utils.BrowserUtils;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

/**
 * 1.Open the browser and navigate to the webautomation page
 * 2.Click on the 'checkbox radio' button
 * 3.Click on the 'product selector' button
 * 4.Click 'Brand 3' element
 * 5.Verify it is clicked and verify it is displayed in preview section
 * 6.Click 'Circle' element
 * 7.Verify it is clicked and verify it is displayed in preview section
 * 8.Click 'Border' element
 * 9.Verify it is clicked and displayed in preview section
 */

public class ProductSelectorTest extends Hooks {

    @Test
    public void productSelectorTest() {

        //1.Open the browser and navigate to the webautomation page
        pages.getHomePage().clickOnWebAutomationLink();

        //2.Click on the 'checkbox radio' button
        pages.getWebAutomationPage().clickOncheckboxRadio();

        //3.Click on the 'product selector' button
        pages.getWebAutomationPage().clickOnProductSelector();

        //4.Click 'Brand 3' element
        pages.getProductSelector().clickOnBranOptions(2);

        //5.Verify it is clicked and verify it is displayed in preview section
        String expectedText = "Brand 3";
        String actualText = pages.getProductSelector().getBrandText();
        assertEquals(expectedText, actualText);

        //6.Click 'Circle' element
        BrowserUtils.scrollDownWithPageDown();
        pages.getProductSelector().clickOnShapeOptions(2);

        //7.Verify it is clicked and verify it is displayed in preview section
        assertTrue(pages.getProductSelector().getShape(2));

        //8.Click 'Border' element
        pages.getProductSelector().clickOnStyleOptions(1);

        //9.Verify it is clicked and displayed in preview section
        assertTrue(pages.getProductSelector().isBorderSelected());

    }
}
