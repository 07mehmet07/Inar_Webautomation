package pages.datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;
import java.util.List;
import java.util.Locale;

public class SelectDateRange extends BasePage {

    @FindBy(id = "from-selectDateRange")
    private WebElement fromDateTextField;

    @FindBy(id = "to-selectDateRange")
    private WebElement toDateTextField;

    @FindBy(css = ".ui-datepicker-group-first > table > tbody > tr > td > a")
    private List<WebElement> firstGroupDayElements;

    @FindBy(css = ".ui-datepicker-group-middle > table > tbody > tr > td > a")
    private List<WebElement> middleGroupDayElements;

    @FindBy(css = ".ui-datepicker-group-last > table > tbody > tr > td > a")
    private List<WebElement> lastGroupDayElements;

    @FindBy(xpath = "//a[@class='ui-state-default ui-state-active']")
    private WebElement selectedDayElement;

    @FindBy(xpath = "//select[@aria-label='Select month']")
    private WebElement selectableMonthElement;

    public void clickOnFromDateTextField() {
        fromDateTextField.click();
    }

    public void clickOnToDateTextField() {
        toDateTextField.click();
    }

    public void selectMonth(String month) {
        selectableMonthElement.click();
        WebElement monthInDropBox = DRIVER.findElement(By.xpath("//option[contains(text(),'" + month + "')]"));
        monthInDropBox.click();
    }

    public int getCountOfMonthsDisplayedOnSelectMonthBox() {
        Select select = new Select(selectableMonthElement);
        return select.getOptions().size();
    }

    public void pickDateFromCalendar(String block, String day) {
        switch (block.toLowerCase(Locale.ROOT)) {
            case "first" -> firstGroupDayElements.stream()
                    .filter(dayToPick -> dayToPick.getText().equals(day))
                    .findFirst()
                    .ifPresent(WebElement::click);
            case "middle" -> middleGroupDayElements.stream()
                    .filter(dayToPick -> dayToPick.getText().equals(day))
                    .findFirst()
                    .ifPresent(WebElement::click);
            case "last" -> lastGroupDayElements.stream()
                    .filter(dayToPick -> dayToPick.getText().equals(day))
                    .findFirst()
                    .ifPresent(WebElement::click);
            default -> System.out.println("Wrong type for block\nUsage:'first' , 'middle' or 'last'");
        }
    }

    public String getDateInFromDateTextField() {
        return fromDateTextField.getAttribute("value");
    }

    public String getDateInToDateTextField() {
        return toDateTextField.getAttribute("value");
    }

    public String getSelectedDay() {
        return selectedDayElement.getText();
    }

    public int getSelectableDayNumberInFirstMonthElement() {
        return firstGroupDayElements.size();
    }
}
