package tests;

import org.testng.annotations.Test;

public class RadioButtonTest extends BaseTest{

    @Test //Test Case ID:301
    public void verifyYesButtonIsSelected () {
        getRadioButtonPage().open()
                .yesClick()
                .checkYes();
    }

    @Test //Test Case ID:302
    public void verifyImpressiveButtonIsSelected() {
        getRadioButtonPage().open()
                .impressiveClick()
                .checkImpressive();
    }
}
