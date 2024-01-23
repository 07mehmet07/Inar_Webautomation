package datepickerTests;

import BaseTest.Hooks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DisplayMultipleMonthsTest extends Hooks {

    @BeforeEach
    void setUpTestEnvironment() {
        //1. Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();

        //2.Click on the date picker button
        pages.getWebAutomationPage().clickOnDatepicker();

        //3.Click on the display multiple months button
        pages.getWebAutomationPage().clickOnDisplayMultipleMonths();
    }


    /**
     * 1.Open the browser and navigate to the webautomation page
     * 2.Click on the date picker button
     * 3.Click on the display multiple months button
     * 4.Click on date text field
     * 5.Click on 'middle' block '18.Day' element
     * 6.Click done button
     * 7.Verify that date shown in date text field is true
     */
    @Test
    void testChosenDateIsCorrectlyDisplayed() {
        //4.Click on date text field
        pages.getDisplayMultipleMonthsPage().clickDateTextField();

        //5.Click on 'middle' block '18.Day' element
        pages.getDisplayMultipleMonthsPage().clickDateOnCalender("18", "middle");

        // 6.Click done button
        pages.getDisplayMultipleMonthsPage().clickOnDoneButton();

        // 7.Verify that date shown in date text field is true
        String expectedDate = "02/18/2024";
        String actualDateInTextField = pages.getDisplayMultipleMonthsPage().getDateTextField();
        assertEquals(expectedDate, actualDateInTextField, "Date is not correctly displayed!");

    }

    /**
     * 1.Open the browser and navigate to the webautomation page
     * 2.Click on the date picker button
     * 3.Click on the display multiple months button
     * 4.Click on date text field
     * 5.Click on today button
     * 6.Click done button
     * 7.Verify that date shown in date text field is true by using LocalDate class
     */

    @Test
    void testTodayDateOnTextFieldFunctionality() {
        //4.Click on date text field
        pages.getDisplayMultipleMonthsPage().clickDateTextField();

        //5.Click on today button
        pages.getDisplayMultipleMonthsPage().clickTodayDateOnCalendar();

        //6.Click done button
        pages.getDisplayMultipleMonthsPage().clickOnDoneButton();

        //7.Verify that date shown in date text field is true by using LocalDate class
        LocalDate today = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        String expectedTodayDate = today.format(formatter);
        String actualTodayDate = pages.getDisplayMultipleMonthsPage().getDateTextField();

        assertEquals(expectedTodayDate, actualTodayDate, "Date is wrongly displayed!");
    }


    @AfterEach
    void tearDownTestEnvironment() {
        pages.getWebAutomationPage().clickOnSelectDateRang();
    }
}
