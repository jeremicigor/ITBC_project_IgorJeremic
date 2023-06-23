package tests;

import org.testng.annotations.Test;

public class MenuTest extends BaseTest {

    @Test //Test Case ID:601
    public void hoverOverMenu2() {
        getMenuPage().open();
        hoverOverElement(getMenuPage().getMainItem2());
        getMenuPage().waitForSubMenu()
                .checkHoveredMenu2();
    }

    @Test //Test Case ID:602
    public void hoverOverSubMenu() {
        getMenuPage().open();
        hoverOverElement(getMenuPage().getMainItem2());
        getMenuPage().waitForSubMenu();
        hoverOverElement(getMenuPage().getSubItem());
        getMenuPage().waitForSubSUBMenu()
                .checkHoveredSUBMenu2();
    }
}
