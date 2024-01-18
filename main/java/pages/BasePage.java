package pages;

import utils.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {

    protected final WebDriver DRIVER = Driver.getDriver();

    protected WebDriverWait wait = new WebDriverWait(DRIVER, Duration.ofSeconds(10));

    public Actions actions = new Actions(DRIVER);

    public BasePage() {
        PageFactory.initElements(DRIVER, this);
        DRIVER.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

}
