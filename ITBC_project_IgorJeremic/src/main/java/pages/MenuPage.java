package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class MenuPage extends BasePage {


    private WebElement mainItem2;
    private WebElement subItem;
    private WebElement subSUBItem;


    public MenuPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    public WebElement getMainItem2() {
        this.mainItem2 = getDriver().findElement(By.xpath("//a[text()='Main Item 2']"));
        return mainItem2;
    }

    public WebElement getSubItem() {
        this.subItem = getDriver().findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
        return subItem;
    }

    public WebElement getSubSUBItem() {
        this.subSUBItem = getDriver().findElement(By.xpath("//a[contains(text(), 'Sub Sub Item 1')]"));
        return subSUBItem;
    }

    public MenuPage waitForSubMenu() {
        getWait().until(ExpectedConditions.visibilityOf(getSubItem()));
        return this;
    }

    public MenuPage waitForSubSUBMenu() {
        getWait().until(ExpectedConditions.visibilityOf(getSubSUBItem()));
        return this;
    }

    public MenuPage checkHoveredMenu2() {
        Assert.assertTrue(subItem.isDisplayed());
        return this;
    }

    public MenuPage checkHoveredSUBMenu2() {
        Assert.assertTrue(subSUBItem.isDisplayed());
        return this;
    }

    public MenuPage open() {
        getDriver().get("https://demoqa.com/menu");
        return this;
    }


}
