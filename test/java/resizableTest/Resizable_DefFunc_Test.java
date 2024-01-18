package resizableTest;

import BaseTest.Hooks;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 1.Open the browser and navigate to the page
 * 2.Click on the resizable button
 * 3.Click on the default functionality button
 * 4.Drag the resize handle to resize the resizable element
 * 5.Verify that the resizable element has been resized
 */
public class Resizable_DefFunc_Test extends Hooks {

    @Test
    void testDefaultResizableFunc(){
        //1.Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();

        //2.Click on the resizable button
        //3.Click on the default functionality button
        pages.getWebAutomationPage().clickOnResizableLink();
        pages.getWebAutomationPage().clickOnResizableDefaultFuncLink();

        //initial size of web element
        int initialWidth = pages.getResizableDefFuncPage().getWidthOfResizableElement();
        int initialHeight = pages.getResizableDefFuncPage().getHeightOfResizableElement();

        //4.Drag the resize handle to resize the resizable element
        pages.getResizableDefFuncPage().resizeTheWebElement(50,50);

        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        //final size
        int finalWidth = pages.getResizableDefFuncPage().getWidthOfResizableElement();
        int finalHeight = pages.getResizableDefFuncPage().getHeightOfResizableElement();

        System.out.println("finalWidth" + finalWidth);
        System.out.println("finalHeight" + finalHeight);


        //5.Verify that the resizable element has been resized
        Assertions.assertThat(finalWidth).isGreaterThan(initialWidth);
        Assertions.assertThat(finalHeight).isGreaterThan(initialHeight);

    }
}
