package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class RadioButtonPage extends BasePage {

    private WebElement yesRadioBtn;
    private WebElement impressiveRadioBtn;
    private WebElement yesMessage;
    private WebElement impressiveMessage;

    public RadioButtonPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getYesRadioBtn() {
        this.yesRadioBtn = getDriver().findElement(By.xpath("//label[@for='yesRadio']"));
        return yesRadioBtn;
    }

    public WebElement getImpressiveRadioBtn() {
        this.impressiveRadioBtn = getDriver().findElement(By.xpath("//label[@for='impressiveRadio']"));
        return impressiveRadioBtn;
    }

    public WebElement getYesMessage() {
        this.yesMessage = getDriver().findElement(By.xpath("//span[contains(text(), 'Yes')]"));
        return yesMessage;
    }

    public WebElement getImpressiveMessage() {
        this.impressiveMessage = getDriver().findElement(By.xpath("//span[contains(text(), 'Impressive')]"));
        return impressiveMessage;
    }

    public RadioButtonPage yesClick() {
        getYesRadioBtn().click();
        return this;
    }

    public RadioButtonPage impressiveClick() {
        getImpressiveRadioBtn().click();
        return this;
    }

    public RadioButtonPage checkYes() {
        Assert.assertTrue(getYesMessage().isDisplayed());
        return this;
    }

    public RadioButtonPage checkImpressive() {
        Assert.assertTrue(getImpressiveMessage().isDisplayed());
        return this;
    }

    public RadioButtonPage open() {
        getDriver().get("https://demoqa.com/radio-button");
        return this;
    }

}
