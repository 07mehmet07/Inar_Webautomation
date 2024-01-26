package pages.sortable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class IncludeAndExcludeItemsTab extends BasePage {

    @FindBy(id = "hel-sortable")
    private WebElement frame;

    //Upper-Box Elements
    @FindBy(css = "#sortable-inc-exc-1 > li")
    private List<WebElement> elementsInTheUpperBox;
    @FindBy(xpath = "//ul[@id='sortable-inc-exc-1']/li[contains(text(),'not sortable')][1]")
    private WebElement notSortableOrADropTargetElement;

    @FindBy(xpath = "//ul[@id='sortable-inc-exc-1']/li[text()='Item 1']")
    private WebElement itemOneOfUpperBox;
    @FindBy(xpath = "//ul[@id='sortable-inc-exc-1']/li[text()='Item 4']")
    private WebElement itemFourOfUpperBox;

    //Below-box Element
    @FindBy(css = "#sortable-inc-exc-2 > li")
    private List<WebElement> elementsInTheBelowBox;

//    List<String> attributeValues = elements.stream()
//            .map(element -> element.getAttribute("your_attribute_name"))
//            .collect(Collectors.toList());
//
//    // Değerleri yazdır
//        attributeValues.forEach(System.out::println);

    public String getUpperBoxValues(int index) {
        List<String> data0fFirstBox= elementsInTheUpperBox.stream().map(element -> element.getAttribute("class")).collect(toList());
       return data0fFirstBox.get(index - 1);
    }

    public String getBelowBoxValues(int index) {
        List<String> data0fSecondBox= elementsInTheBelowBox.stream().map(element -> element.getAttribute("class")).collect(toList());
        return data0fSecondBox.get(index - 1);
    }

    public boolean isSortable(String attribute) {
        return attribute.contains("bg-primary");
    }
}