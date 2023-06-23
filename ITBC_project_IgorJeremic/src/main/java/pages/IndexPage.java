package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class IndexPage extends BasePage {

    private WebElement elementsHL;
    private WebElement formsHL;
    private WebElement alertsFrameHL;
    private WebElement widgetsHL;
    private WebElement interactionsHL;
    private WebElement bookStoreApplicationHL;

    public IndexPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getElementsHL() {
        this.elementsHL = getDriver().findElement(By.xpath("//h5[contains(text(), 'Elements')]"));
        return elementsHL;
    }

    public WebElement getFormsHL() {
        this.formsHL = getDriver().findElement(By.xpath("//h5[contains(text(), 'Forms')]"));
        return formsHL;
    }

    public WebElement getAlertsFrameHL() {
        this.alertsFrameHL = getDriver().findElement(By.xpath("//h5[contains(text(), 'Alerts')]"));
        return alertsFrameHL;
    }

    public WebElement getWidgetsHL() {
        this.widgetsHL = getDriver().findElement(By.xpath("//h5[contains(text(), 'Widgets')]"));
        return widgetsHL;
    }

    public WebElement getInteractionsHL() {
        this.interactionsHL = getDriver().findElement(By.xpath("//h5[contains(text(), 'Interactions')]"));
        return interactionsHL;
    }

    public WebElement getBookStoreApplicationHL() {
        this.bookStoreApplicationHL = getDriver().findElement(By.xpath("//h5[contains(text(), 'Book')]"));
        return bookStoreApplicationHL;
    }

    public IndexPage clickXPATH(WebDriver driver, String xpath) {
        WebElement element = getDriver().findElement(By.xpath(xpath));
        element.click();
        return this;
    }

    public String getXPathForIdentifier(String identifier) {
        return "//h5[contains(text(), '" + identifier + "')]";
    }


    public IndexPage clickElements() {
        getElementsHL().click();
        return this;
    }

    public IndexPage clickForms() {
        getFormsHL().click();
        return this;
    }

    public IndexPage clickAlerts() {
        getAlertsFrameHL().click();
        return this;
    }

    public IndexPage clickWidgets() {
        getWidgetsHL().click();
        return this;
    }

    public IndexPage clickInteractions() {
        getInteractionsHL().click();
        return this;
    }

    public IndexPage clickBookStoreApplication() {
        getBookStoreApplicationHL().click();
        return this;
    }

    public IndexPage assertURLPresent(String expectedURL) {
        getWait().until(ExpectedConditions.urlContains(expectedURL));
        String currentURL = getDriver().getCurrentUrl();
        Assert.assertTrue(currentURL.contains(expectedURL));
        return this;
    }

    public IndexPage open() {
        getDriver().get("https://demoqa.com/");
        getDriver().manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0, 500);");
        return this;
    }


}



