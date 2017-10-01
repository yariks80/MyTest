package Tests;

import Helpers.App;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public abstract class BaseTest {
    App app = new App();

    @BeforeSuite
    public void setSuite() throws Exception {
    }

    @AfterSuite
    public void tearDown() throws Exception {
        app.common.appOut();


    }
}
