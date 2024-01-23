package pages.datepicker;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;
import java.util.Locale;

public class DisplayMultipleMonthsPage extends BasePage {

    @FindBy(css = ".ui-datepicker-group-first > .ui-datepicker-calendar > tbody > tr > td > a")
    private List<WebElement> daysInFirstGroupMonth;

    @FindBy(css = ".ui-datepicker-group-middle > .ui-datepicker-calendar > tbody > tr > td > a")
    private List<WebElement> daysInMiddleGroupMonth;

    @FindBy(css = ".ui-datepicker-group-last > .ui-datepicker-calendar > tbody > tr > td > a")
    private List<WebElement> daysInLastGroupMonth;

    @FindBy(id = "datepicker-multiple-months")
    private WebElement dateTextField;

    @FindBy(className = "ui-priority-primary")
    private WebElement doneButton;

    @FindBy(className = "ui-priority-secondary")
    private WebElement todayButton;

    @FindBy(css = ".ui-datepicker-today > a")
    private WebElement todayDateInCalender;

    @FindBy(xpath = "//a[@class='ui-state-default ui-state-active']")
    private WebElement selectedDayElement;


    public void clickDateTextField() {
        dateTextField.click();
    }

    public void clickOnTodayButton() {
        todayButton.click();
    }

    public void clickOnDoneButton() {
        doneButton.click();
    }

    public void clickDateOnCalender(String day, String block) {
        switch (block.toLowerCase(Locale.ROOT)) {
            case "first":
                daysInFirstGroupMonth.stream().
                        filter(item -> item.getText().equals(day))
                        .findFirst()
                        .ifPresent(WebElement::click);
                break;
            case "middle":
                daysInMiddleGroupMonth.stream()
                        .filter(item -> item.getText().equals(day))
                        .findFirst()
                        .ifPresent(WebElement::click);
                break;
            case "last":
                daysInLastGroupMonth.stream()
                        .filter(item -> item.getText().equals(day))
                        .findFirst()
                        .ifPresent(WebElement::click);
                break;
            default:
                System.out.println("Wrong type for block\nUsage:'first' , 'middle' or 'last'");
        }
    }

    public void clickTodayDateOnCalendar() {
        todayDateInCalender.click();
    }

    public String getDateTextField() {
        return dateTextField.getAttribute("value");
    }


}
