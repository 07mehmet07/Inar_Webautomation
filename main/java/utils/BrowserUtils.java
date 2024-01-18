package utils;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class BrowserUtils {

    private static Actions actions = new Actions(Driver.getDriver());
    public static void scrollDownWithPageDown(){
        actions.keyDown(Keys.PAGE_DOWN).release().build().perform();
        wait(1);
    }

    public static void scrollUpWithPageUp(){
        actions.keyDown(Keys.PAGE_UP).release().build().perform();
        wait(1);
    }

    public static void wait(double timeout){
        try{
            Thread.sleep((long)timeout * 1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void wait(int timeout){
        try{
            Thread.sleep(timeout * 1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static String getTitle(){
        return Driver.getDriver().getTitle();
    }



}
