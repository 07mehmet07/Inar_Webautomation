package autocomplete_Test;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Accent_Folding_Test extends Hooks {
    @Test
    public void accentFoldingTest(){
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickOnAutoCompleteLink();
        pages.getWebAutomationPage().clickOnAccentFolding();


        pages.getAutocompleteAccentFoldingPage().sendDataToInput("Jo");

        List<String> names = pages.getAutocompleteAccentFoldingPage().getElementList();
        Assertions.assertTrue(names.get(0).startsWith("Jörn"));
        Assertions.assertTrue(names.get(1).startsWith("John"));

        pages.getAutocompleteAccentFoldingPage().cleanInput();

        pages.getAutocompleteAccentFoldingPage().sendDataToInput("Jö");
        assertTrue(names.get(0).startsWith("Jörn"));










    }
}
