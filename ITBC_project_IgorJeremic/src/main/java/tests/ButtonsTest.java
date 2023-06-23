package tests;

import org.testng.annotations.Test;

public class ButtonsTest extends BaseTest{

    @Test //Test Case ID:201
    public void verifyDoubleClickButton() throws InterruptedException {
        getButtonsPage().open()
                .doubleClickBtnDoubleClick()
                .checkDoubleClick();
    }

    @Test //Test Case ID:202
    public void verifyRightClickButton() {
        getButtonsPage().open()
                .rightClickButtonClick()
                .checkRightClick();
    }

    @Test //Test Case ID:203
    public void verifySingletClickButton() {
        getButtonsPage().open()
                .singleClickButtonClick()
                .checkSingleClick();
    }

}
