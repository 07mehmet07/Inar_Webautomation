package resizableTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 1.Open the browser and navigate to the page
 * 2.Click on the resizable button
 * 3.Click on the text area button
 * 4.Clear and write the text area
 * 5.Verify the text that is written
 * 6.Drag the resize handle to resize the text area
 * 7.Verify that the text area has been resized
 */
public class Resizable_Text_Area_Test extends Hooks {

    @Test
    public void testTextArea() {

        //1.Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();

        //2.Click on the resizable button
        pages.getWebAutomationPage().clickOnResizableLink();

        //3.Click on the text area button
        pages.getWebAutomationPage().clickOnTextAreaLink();

        //4.Clear and write the text area
        pages.getTextAreaPage().clearTextArea();
        pages.getTextAreaPage().writeTextArea("Inar Academy");

        //5.Verify the text that is written
        String expectedText = "Inar Academy";
        String actualText = pages.getTextAreaPage().getTextFromTextArea();
        assertEquals(expectedText,actualText);

        //6.Drag the resize handle to resize the text area
        int initialXSize = pages.getTextAreaPage().getSizeOfTextArea().getWidth();
        int initialYSize = pages.getTextAreaPage().getSizeOfTextArea().getHeight();
        pages.getTextAreaPage().resizeTextArea(50,50);

        //7.Verify that the text area has been resized
        int finalXSize =pages.getTextAreaPage().getSizeOfTextArea().getWidth();
        int finalYSize =pages.getTextAreaPage().getSizeOfTextArea().getHeight();

        Assertions.assertTrue(finalXSize > initialXSize);
        Assertions.assertTrue(finalYSize > initialYSize);

    }

}
