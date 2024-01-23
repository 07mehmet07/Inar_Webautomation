package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WebAutomationPage extends BasePage {

    @FindBy(linkText = "Accept")
    private WebElement acceptLink;

    @FindBy(linkText = "Autocomplete")
    private WebElement autoCompleteLink;

    @FindBy(linkText = "Accent Folding")
    private WebElement accentFoldingLink;

    @FindBy(linkText = "Draggable")
    private WebElement draggableLink;

    @FindBy(linkText = "Default Functionality")
    private WebElement defaultFunctionalityLink;

    @FindBy(linkText = "Datepicker")
    private WebElement datePickerLink;

    @FindBy(linkText = "Display Multiple Months")
    private WebElement displayMultipleMonthsLink;

    @FindBy(linkText = "Select Date Range")
    private WebElement selectDateRangeLink;


    @FindBy(linkText = "Auto Scrolling")
    private WebElement autoScrollingLink;

    @FindBy(linkText = "Droppable")
    private WebElement droppableLink;

    @FindBy(linkText = "Resizable")
    private WebElement resizableLink;

    @FindBy(linkText = "Control Group")
    private WebElement controlGroup;

    @FindBy(linkText = "Textarea")
    private WebElement textAreaLink;

    @FindBy(linkText = "Synchronus Resize")
    private WebElement synchronusResizeLink;
    @FindBy(linkText = "Selectable")
    private WebElement selectableLink;

    @FindBy(xpath = "//a[text()='Serialize']")
    private WebElement serializeLink;

    @FindBy(linkText = "Iframe")
    private WebElement iframeLink;

    @FindBy(linkText = "Nested Iframe")
    private WebElement nestedIframeLink;

    @FindBy(linkText = "Alerts")
    private WebElement alertsLink;

    @FindBy(linkText = "Animate")
    private WebElement animateLink;

    @FindBy(linkText = "Constrain Movement")
    private WebElement constrainMovementLink;
    @FindBy(linkText = "Handles")
    private WebElement handlesLink;

    @FindBy(linkText = "Revert draggable position")
    private WebElement revertDraggablePositionLink;

    @FindBy(linkText = "Menu")
    private WebElement menuLink;

    @FindBy(linkText = "Progress Bar")
    private WebElement progressBarLink;

    @FindBy(linkText = "Download Dialog")
    private WebElement downloadDialogLink;

    @FindBy(linkText = "Icons")
    private WebElement iconsLink;

    @FindBy(linkText = "Dialog")
    private WebElement dialogLink;

    @FindBy(linkText = "Modal Form")
    private WebElement modalFormLink;

    public void clickOnSelectDateRang() {selectDateRangeLink.click();}

    public void clickOnDatepicker() {
        datePickerLink.click();
    }

    public void clickOnDisplayMultipleMonths() {
        displayMultipleMonthsLink.click();
    }

    public void clickOnControlGroup() {
        controlGroup.click();
    }

    public void clickOnModalFormLink() {
        modalFormLink.click();
    }

    public void clickOnDialogLink() {
        dialogLink.click();
    }

    public void clickOnAccentFolding() {
        accentFoldingLink.click();
    }

    public void clickOnIconsLink() {
        iconsLink.click();
    }

    public void clickOnAutoCompleteLink() {
        autoCompleteLink.click();
    }

    public void clickOnSerializeLink() {
        serializeLink.click();
    }

    public void clickOnRevertDraggablePositionLink() {
        revertDraggablePositionLink.click();
    }

    public void clickOnDraggableLink() {
        draggableLink.click();
    }

    public void clickOnDraggableDefaultFunctionalityLink() {
        defaultFunctionalityLink.click();
    }

    public void clickOnDroppableDefaultFunctionalityLink() {
        defaultFunctionalityLink.click();
    }

    public void clickOnDroppableLink() {
        droppableLink.click();
    }

    public void clickOnAutoScrollingLink() {
        autoScrollingLink.click();
    }

    public void clickOnResizableLink() {
        resizableLink.click();
    }

    public void clickOnResizableDefaultFuncLink() {
        defaultFunctionalityLink.click();
    }

    public void clickOnSelectableLink() {
        selectableLink.click();
    }

    public void clickOnDefaultFunctionality() {
        defaultFunctionalityLink.click();
    }

    public void clickOnIframeLink() {
        iframeLink.click();
    }

    public void clickOnNestedIframe() {
        nestedIframeLink.click();
    }

    public void clickOnAlertsLink() {
        alertsLink.click();
    }

    public void clickOnAnimateLink() {
        animateLink.click();
    }

    public void clickOnConstrainMovementLink() {
        constrainMovementLink.click();
    }

    public void clickOnHandlesLink() {
        handlesLink.click();
    }

    public void clickOnAcceptLink() {
        acceptLink.click();
    }

    public void clickSynchronusResizeLink() {
        synchronusResizeLink.click();
    }

    public void clickOnTextAreaLink() {
        textAreaLink.click();
    }

    public void clickOnMenuLink() {
        menuLink.click();
    }

    public void clickOnProgressBarLink() {
        progressBarLink.click();
    }

    public void clickOnDownloadDialog() {
        downloadDialogLink.click();
    }

}
