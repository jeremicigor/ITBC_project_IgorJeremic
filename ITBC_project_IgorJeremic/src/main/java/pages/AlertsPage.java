package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AlertsPage extends BasePage {

    private WebElement alertInstant;
    private WebElement alert5Sec;
    private WebElement alertBox;
    private WebElement alertPrompt;


    public AlertsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getAlertInstant() {
        this.alertInstant = getDriver().findElement(By.xpath("//button[@id='alertButton']"));
        return alertInstant;
    }

    public WebElement getAlert5Sec() {
        this.alert5Sec = getDriver().findElement(By.xpath("//button[@id='timerAlertButton']"));
        return alert5Sec;
    }

    public WebElement getAlertBox() {
        this.alertBox = getDriver().findElement(By.xpath("//button[@id='confirmButton']"));
        return alertBox;
    }

    public WebElement getAlertPrompt() {
        this.alertPrompt = getDriver().findElement(By.xpath("//button[@id='promtButton']"));
        return alertPrompt;
    }

    public AlertsPage clickALertInstant() {
        getAlertInstant().click();
        return this;
    }

    public AlertsPage clickAlert5sec() {
        getAlert5Sec().click();
        return this;
    }

    public AlertsPage clickAlertBox() {
        getAlertBox().click();
        return this;
    }

    public AlertsPage clickAlertPrompt() {
        getAlertPrompt().click();
        return this;
    }

    public AlertsPage waitForAlert5sVisibility() {
        getWait().until(ExpectedConditions.alertIsPresent());
        return this;
    }

    public AlertsPage assertAlertNotPresent() {
        getWait().until(ExpectedConditions.not(ExpectedConditions.alertIsPresent()));
        return this;
    }

    public AlertsPage solveAlertOK() {
        getDriver().switchTo().alert().accept();
        return this;
    }

    public AlertsPage assertAlertOK() {
        WebElement parentElement = getDriver().findElement(By.xpath("//*[@id='confirmResult']"));
        String actualText = parentElement.getText().trim();
        Assert.assertEquals("You selected Ok", actualText);
        return this;
    }

    public AlertsPage solveAlertCancel() {
        getDriver().switchTo().alert().dismiss();
        return this;
    }

    public AlertsPage assertAlertCancel() {
        WebElement parentElement = getDriver().findElement(By.xpath("//*[@id='confirmResult']"));
        String actualText = parentElement.getText().trim();
        Assert.assertEquals("You selected Cancel", actualText);
        return this;
    }

    public AlertsPage solveAlertPrompt() {
        getDriver().switchTo().alert().sendKeys("Rabindranath Tagore");
        getDriver().switchTo().alert().accept();
        return this;
    }

    public AlertsPage assertAlertPrompt() {
        WebElement parentElement = getDriver().findElement(By.xpath("//*[@id='promptResult']"));
        String actualText = parentElement.getText().trim();
        Assert.assertEquals("You entered Rabindranath Tagore", actualText);
        return this;
    }


    public AlertsPage open() {
        getDriver().get("https://demoqa.com/alerts");
        return this;
    }
}
