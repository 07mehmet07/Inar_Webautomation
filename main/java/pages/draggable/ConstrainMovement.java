package pages.draggable;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class ConstrainMovement extends BasePage{
    @FindBy(id = "draggable5")
    private WebElement draggable1;

    @FindBy(id="draggable6")
    private WebElement draggable2;

    @FindBy(id = "draggable7")
    private WebElement draggable3;

    @FindBy(id = "draggable8")
    private WebElement draggable4;

    @FindBy(id = "containment-wrapper")
    private WebElement bigBox;

    @FindBy(xpath = "//div[@class='draggable-third ui-widget-content bg-primary text-fifth fs-5 d-flex justify-content-center align-items-center']")
    private WebElement smallBox;

    public void dragFirstBox(int x, int y){
        actions.dragAndDropBy(draggable1,x,y).perform();
    }
    public void dragSecondBox(int x, int y){
        actions.dragAndDropBy(draggable2,x,y).perform();
    }
    public void dragThirdBox(int x, int y){
        actions.dragAndDropBy(draggable3,x,y).perform();
    }
    public void dragFourthBox(int x, int y){
        actions.dragAndDropBy(draggable4,x,y).perform();
    }

    public Point getLocationOfDraggable1(){
        return draggable1.getLocation();
    }
    public Point getLocationOfDraggable2(){
        return draggable2.getLocation();
    }
    public Point getLocationOfDraggable3(){
        return draggable3.getLocation();
    }
    public Point getLocationOfDraggable4(){
        return draggable4.getLocation();
    }
    public Point getLocationOfBigBox(){
        return bigBox.getLocation();
    }
    public Point getLocationOfSmallBox(){
        return smallBox.getLocation();
    }

}
