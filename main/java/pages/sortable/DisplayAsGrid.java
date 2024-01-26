package pages.sortable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class DisplayAsGrid extends BasePage {

    @FindBy(css = "#sortable-disp-as-grid>li")
    private List<WebElement> sortableElements;


     public void moveElementByOffset(String number, int xOffset, int yOffset) {
        List<String> stringList = sortableElements.stream().map(WebElement::getText).toList();

        WebElement numberToMove = sortableElements.get(stringList.indexOf(number));

        actions.clickAndHold(numberToMove).moveByOffset(xOffset, yOffset).release().build().perform();
    }


    public String getNumberElementLocation(String number) {
        return DRIVER.findElement(By.cssSelector("#sortable-disp-as-grid > li:nth-child(" + number + ")")).getText();
    }


    public String lineageOfNumbers() {
        String lineage = "";
        for (int i = 1; i <= 12; i++) {
            if (i == 12) {
                lineage += DRIVER.findElement(By.cssSelector("#sortable-disp-as-grid > li:nth-child(" + i + ")")).getText();
            } else {
                lineage += DRIVER.findElement(By.cssSelector("#sortable-disp-as-grid > li:nth-child(" + i + ")")).getText() + "-";
            }
        }
        System.out.println("Arrangement of numbers --> " + lineage);
        return lineage;
    }





}