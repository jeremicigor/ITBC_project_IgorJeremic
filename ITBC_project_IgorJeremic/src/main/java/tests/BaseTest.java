package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import pages.*;

import java.time.Duration;

public class BaseTest {

    private WebDriver driver;
    private WebDriverWait wait;
    private ButtonsPage buttonsPage;
    private RadioButtonPage radioButtonPage;
    private AlertsPage alertsPage;
    private IndexPage indexPage;
    private MenuPage menuPage;
    private Actions actions;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\igorj\\Desktop\\QA kurs\\0 Data\\Chrome Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        buttonsPage = new ButtonsPage(driver, wait);
        radioButtonPage = new RadioButtonPage(driver, wait);
        alertsPage = new AlertsPage(driver,wait);
        indexPage = new IndexPage(driver, wait);
        menuPage = new MenuPage(driver, wait);
        actions = new Actions(driver);
    }

    public WebDriver getDriver() {
        return this.driver;
    }

    public WebDriverWait getWait() {
        return this.wait;
    }

    public ButtonsPage getButtonsPage(){
        return buttonsPage;
    }

    public RadioButtonPage getRadioButtonPage() {
        return radioButtonPage;
    }

    public AlertsPage getAlertsPage() {
        return alertsPage;
    }

    public IndexPage getIndexPage() {
        return indexPage;
    }

    public MenuPage getMenuPage() {
        return menuPage;
    }

    public Actions getActions() {
        return actions;
    }

    @DataProvider(name = "testIndexURL")
    public Object[][] testIndexURL() {
        return new Object[][]{
                {"Elements","https://demoqa.com/elements"},
                {"Forms", "https://demoqa.com/forms"},
                {"Alerts", "https://demoqa.com/alertsWindows"},
                {"Widgets", "https://demoqa.com/widgets"},
                {"Interactions", "https://demoqa.com/interaction"},
                {"Book", "https://demoqa.com/books"}
        };
    }

    public void hoverOverElement(WebElement element) {
        actions.moveToElement(element).perform();
    }

    @AfterClass
    public void cleanUp() {
        driver.close();
    }
}

