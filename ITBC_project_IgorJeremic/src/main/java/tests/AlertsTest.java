package tests;

import org.testng.annotations.Test;

public class AlertsTest extends BaseTest {

    @Test //Test Case ID:501
    public void verifyClickButtonToSeeAlert() {
        getAlertsPage().open()
                .clickALertInstant()
                .solveAlertOK()
                .assertAlertNotPresent();
    }

    @Test //Test Case ID:502
    public void verifyClickButtonToWaitAlert() {
        getAlertsPage().open()
                .clickAlert5sec()
                .waitForAlert5sVisibility()
                .solveAlertOK()
                .assertAlertNotPresent();
    }

    @Test //Test Case ID:503
    public void verifyConfirmBoxAlertOK() {
        getAlertsPage().open()
                .clickAlertBox()
                .solveAlertOK()
                .assertAlertNotPresent()
                .assertAlertOK();
    }

    @Test //Test Case ID:504
    public void verifyConfirmBoxAlertCancel() {
        getAlertsPage().open()
                .clickAlertBox()
                .solveAlertCancel()
                .assertAlertNotPresent()
                .assertAlertCancel();
    }

    @Test //Test Case ID:505
    public void verifyPromptBox() {
        getAlertsPage().open()
                .clickAlertPrompt()
                .solveAlertPrompt()
                .assertAlertPrompt();

    }

}
