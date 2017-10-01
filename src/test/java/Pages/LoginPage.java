package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {


    @FindBy(xpath = "//input[@name='login'] ")
    private WebElement inputLogin;

    @FindBy(xpath = "//input[@name='pass']")
    private WebElement inputPassword;

    @FindBy(xpath = "//input[@value='Войти']")
    private WebElement btnLogin;


    protected void login(String name, String password) {
        log.info(String.format("Login user name -%s , password -%s",name,password));
        name.chars().forEach(d -> {
            inputLogin.sendKeys(Character.toString((char) d));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        inputPassword.sendKeys(password);
        btnLogin.click();
    }


}
