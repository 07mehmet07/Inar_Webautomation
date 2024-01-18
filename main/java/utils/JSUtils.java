package utils;

import org.openqa.selenium.JavascriptExecutor;

public class JSUtils {

    private static JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    public static void executeJavaScript(String script){
        js.executeScript(script);
    }
}
