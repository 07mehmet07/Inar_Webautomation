package BaseTest;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;
import utils.Driver;
import utils.Pages;

public class Hooks {


    private static String browser = Driver.browser;
    protected static Pages pages = new Pages();
    protected SoftAssert softAssert = new SoftAssert();
    @BeforeClass
    public static void setUp() {
        Driver.getDriver().get("https://InarAcademy:Fk160621.@test.inar-academy.com");
        if (browser.equalsIgnoreCase("firefox")) {
            Driver.getDriver().navigate().refresh();
        }
    }

    @AfterClass
    public static void tearDown() {
        Driver.closeDriver();
    }

}
