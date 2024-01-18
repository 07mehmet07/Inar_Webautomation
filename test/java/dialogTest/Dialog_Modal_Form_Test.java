package dialogTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Dialog_Modal_Form_Test extends Hooks {

    @Test
    public void dialogModalFormTest() {
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickOnDialogLink();
        pages.getWebAutomationPage().clickOnModalFormLink();

        pages.getModalFormPage().clickOnCreateAccountTab();

        List<String> expectedResult = pages.getModalFormPage().enterAllDataOnDiologPage("mehmet", "toprak", "2121bjk@gmail.com");

        pages.getModalFormPage().clickOnSubmit();

        List<String> actualResult = pages.getModalFormPage().getAllDataOfLastUser();

        assertEquals(expectedResult, actualResult);


    }


}

