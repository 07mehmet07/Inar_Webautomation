package autocomplete_Test;

import BaseTest.Hooks;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertTrue;

import java.util.List;

/**
 * 1.Open the url and navigate to Accent Folding Link
 * 2.Enter the text box Jo
 * 3.Verify the name list "John" and "Jörn"
 * 4.Clear the box and enter Jö to the box
 * 5.Verify the name "Jörn"
 */
public class Accent_Folding_Test extends Hooks {

    @Test
    public void accentFoldingTest() {

        //1.Open the url and navigate to Accent Folding Link
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickOnAutoCompleteLink();
        pages.getWebAutomationPage().clickOnAccentFolding();

        //2.Enter the text box Jo
        pages.getAutocompleteAccentFoldingPage().sendDataToInput("Jo");

        //3.Verify the name list "John" and "Jörn"
        List<String> names = pages.getAutocompleteAccentFoldingPage().getElementList();
        assertTrue(names.get(0).startsWith("Jörn"));
        assertTrue(names.get(1).startsWith("John"));

        //4.Clear the box and enter Jö to the box
        pages.getAutocompleteAccentFoldingPage().cleanInput();
        pages.getAutocompleteAccentFoldingPage().sendDataToInput("Jö");

        //5.Verify the name "Jörn"
        assertTrue(names.get(0).startsWith("Jörn"));


    }
}
