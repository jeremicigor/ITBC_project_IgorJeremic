package tests;

import org.testng.annotations.Test;

public class IndexDataProviderTest extends BaseTest {

    //testing all subpages using data provider
    //Test Case ID:401-ID:406
    @Test(dataProvider = "testIndexURL")
    public void testIndexURL(String identifier, String url) {
        String xpath = getIndexPage().getXPathForIdentifier(identifier);

        getIndexPage().open()
                .clickXPATH(getDriver(), xpath)
                .assertURLPresent(url);
    }
}

