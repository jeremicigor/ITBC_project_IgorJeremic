package tests;

import org.testng.annotations.Test;

public class IndexTest extends BaseTest {


    //testing one by one with one test per subpage
    @Test //Test Case ID:401
    public void verifyElementsHPOnIndexPage() {
        getIndexPage().open()
                .clickElements()
                .assertURLPresent("https://demoqa.com/elements");
    }

    @Test //Test Case ID:402
    public void verifyFormsHLOnIndexPage() {
        getIndexPage().open()
                .clickForms()
                .assertURLPresent("https://demoqa.com/forms");
    }

    @Test //Test Case ID:403
    public void verifyAlertsHLOnIndexPage() {
        getIndexPage().open()
                .clickAlerts()
                .assertURLPresent("https://demoqa.com/alertsWindows");
    }

    @Test //Test Case ID:404
    public void verifyWidgetsHLOnIndexPage() {
        getIndexPage().open()
                .clickWidgets()
                .assertURLPresent("https://demoqa.com/widgets");
    }

    @Test //Test Case ID:405
    public void verifyInteractionsHLOnIndexPage() {
        getIndexPage().open()
                .clickInteractions()
                .assertURLPresent("https://demoqa.com/interaction");
    }

    @Test //Test Case ID:406
    public void verifyBooksHLOnIndexPage() {
        getIndexPage().open()
                .clickBookStoreApplication()
                .assertURLPresent("https://demoqa.com/books");
    }


}

