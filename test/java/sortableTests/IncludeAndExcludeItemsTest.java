package sortableTests;

import BaseTest.Hooks;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * 1. Open the browser and navigate to the URL
 * 2. Click on Web automation link
 * 3. Click on Sortable button
 * 4. Click on include and exclude items
 * 5. Get the value of item1 in first box
 * 6.  verify that it is sortable
 * 7. Get the value of Item4InFirstPackage
 * 8. verify that it is sortable
 * 9. Get the value of Item1InSecondPackage
 * 10. verify that it is sortable
 * 11. Get the value of Item4InSecondPackage
 * 12. verify that it is sortable
 * 13. Get the value of '(I'm not sortable or a drop target)' element in first box and verify that is not sortable
 * 14. Get the value of '(I'm not sortable)' element in second box and verify that is not sortable
 */

public class IncludeAndExcludeItemsTest extends Hooks {
    protected SoftAssert softAssert = new SoftAssert();

    @Test
    public void testFirstPartOfIncludeAndExcludeItemsTab() {

        //1. Open the browser and navigate to the URL
        //2. Click on Web automation link
        pages.getHomePage().clickOnWebAutomationLink();

        //3. Click on Sortable button
        pages.getWebAutomationPage().clickOnSortable();

        //4. Click on include and exclude items
        pages.getWebAutomationPage().clickOnIncludeExcludeItems();

        //5. Get the value of item1 in first box
        String item1 = pages.getIncludeAndExcludeItemsTab().getUpperBoxValues(1);

        //6.  verify that it is sortable
        boolean isSortable = pages.getIncludeAndExcludeItemsTab().isSortable(item1);
        softAssert.assertTrue(isSortable);

        //7. Get the value of Item4InFirstPackage
        String item4 = pages.getIncludeAndExcludeItemsTab().getUpperBoxValues(4);

        //8. verify that it is sortable
        isSortable = pages.getIncludeAndExcludeItemsTab().isSortable(item4);
        softAssert.assertTrue(isSortable);


        //9. Get the value of Item1InSecondPackage
        String Item1InSecondBox = pages.getIncludeAndExcludeItemsTab().getBelowBoxValues(1);

        //10. verify that it is sortable
        isSortable = pages.getIncludeAndExcludeItemsTab().isSortable(Item1InSecondBox);
        softAssert.assertTrue(isSortable);


        //11. Get the value of Item4InSecondPackage
        String Item4InSecondBox = pages.getIncludeAndExcludeItemsTab().getBelowBoxValues(4);

        //12. verify that it is sortable
        isSortable = pages.getIncludeAndExcludeItemsTab().isSortable(Item4InSecondBox);
        softAssert.assertTrue(isSortable);

        //13. Get the value of '(I'm not sortable or a drop target)' element in first box and verify that is not sortable
        String item3thatNotSortable = pages.getIncludeAndExcludeItemsTab().getUpperBoxValues(3);
        isSortable = pages.getIncludeAndExcludeItemsTab().isSortable(item3thatNotSortable);
        softAssert.assertFalse(isSortable);

        //14. Get the value of '(I'm not sortable)' element in second box and verify that is not sortable
        String item2thatNotSortable = pages.getIncludeAndExcludeItemsTab().getBelowBoxValues(2);
        isSortable = pages.getIncludeAndExcludeItemsTab().isSortable(item2thatNotSortable);
        softAssert.assertFalse(isSortable);

        // Collect all failures if they occur
        softAssert.assertAll();
    }

}
