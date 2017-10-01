package Tests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmailTest  extends BaseTest {
    @Test(priority = 1)
    public void testEmail() throws Exception {
        app.login.loginValidUser();
        String userName = app.mail.getTextUserName();
        Assert.assertEquals(userName, "test", "Current user name " + userName + " is not correct");
    }
    @Test(priority = 2)
    public void testEmail1() throws Exception {
        Assert.assertTrue( true);
    }


}
