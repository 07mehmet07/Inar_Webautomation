package dialogTest;

import BaseTest.Hooks;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

import java.util.List;

/**
 * 1-Open the url and navigate to page
 * 2-Click on create account button
 * 3-Write inputs to the input boxes
 * 4-Click on Submit button
 * 5-Verify that created account information from table
 */

public class Dialog_Modal_Form_Test extends Hooks {

    @Test
    public void dialogModalFormTest() {

        //1-Open the url and navigate to page
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickOnDialogLink();
        pages.getWebAutomationPage().clickOnModalFormLink();

        //2-Click on create account button
        pages.getModalFormPage().clickOnCreateAccountTab();

        //3-Write inputs to the input boxes
        List<String> expectedResult = pages.getModalFormPage().enterAllDataOnDiologPage("mehmet", "toprak", "2121bjk@gmail.com");

        //4-Click on Submit button
        pages.getModalFormPage().clickOnSubmit();

        //5-Verify that created account information from table
        List<String> actualResult = pages.getModalFormPage().getAllDataOfLastUser();
        assertEquals(expectedResult, actualResult);


    }


}

