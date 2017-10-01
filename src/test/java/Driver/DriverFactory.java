package Driver;

import Common.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

class DriverFactory {

     static WebDriver getDriver() {
        WebDriver driver = null;
        String driverName = System.getProperty("driver");
        if ("firefox".equals(driverName)) {
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if ("ie".equals(driverName)) {
            System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        } else if ("edge".equals(driverName)) {
            System.setProperty("webdriver.edge.driver", "drivers/MicrosoftWebDriver.exe");
            driver = new EdgeDriver();
        }else  if("chrome".equals(driverName)){
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else {
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     //   driver.manage().window().maximize();
        driver.get(Constants.BASE_URL);
        return driver;
    }
}
