package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class ButtonsPage extends BasePage {

    private WebElement doubleClickBtn;
    private WebElement rightClickBtn;
    private WebElement singleClickBtn;
    private WebElement doubleClickMessage;
    private WebElement rightClickMessage;
    private WebElement clickMeMessage;
    private Actions actions = new Actions(getDriver());


    public ButtonsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getDoubleClickBtn() {
        this.doubleClickBtn = getDriver().findElement(By.id("doubleClickBtn"));
        return doubleClickBtn;
    }

    public WebElement getRightClickBtn() {
        this.rightClickBtn = getDriver().findElement(By.id("rightClickBtn"));
        return rightClickBtn;
    }

    public WebElement getSingleClickBtn() {
        //example using list:
        List<WebElement> buttons = getDriver().findElements(By.xpath("//button[contains(text(), 'Click Me')]"));

        if (buttons.size() >= 3) {
            this.singleClickBtn = buttons.get(2);
        }
        return singleClickBtn;
    }

    public WebElement getDoubleClickMessage() {
        this.doubleClickMessage = getDriver().findElement(By.xpath("//p[text() ='You have done a double click']"));
        return doubleClickMessage;
    }

    public WebElement getRightClickMessage() {
        this.rightClickMessage = getDriver().findElement(By.xpath("//p[text() ='You have done a right click']"));
        return rightClickMessage;
    }

    public WebElement getClickMeMessage() {
        this.clickMeMessage = getDriver().findElement(By.xpath("//p[text() ='You have done a dynamic click']"));
        return clickMeMessage;
    }

    public ButtonsPage doubleClickBtnDoubleClick(){
        actions.doubleClick(getDoubleClickBtn()).perform();
        return this;
    }

    public ButtonsPage rightClickButtonClick(){
        actions.contextClick(getRightClickBtn()).perform();
        return this;
    }

    public ButtonsPage singleClickButtonClick(){
        getSingleClickBtn().click();
        return this;
    }

    public ButtonsPage checkDoubleClick() throws InterruptedException {
        Assert.assertTrue(getDoubleClickMessage().isDisplayed());
        return this;
    }

    public ButtonsPage checkRightClick(){
        Assert.assertTrue(getRightClickMessage().isDisplayed());
        return this;
    }

    public ButtonsPage checkSingleClick(){
        Assert.assertTrue(getClickMeMessage().isDisplayed());
        return this;
    }



    public ButtonsPage open() {
        getDriver().get("https://demoqa.com/buttons");
        return this;
    }


}
