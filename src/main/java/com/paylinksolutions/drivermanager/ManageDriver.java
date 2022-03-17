package com.paylinksolutions.drivermanager;

import com.paylinksolutions.propertyreader.PropertyReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

/**
 * @author Vimal Vithalpura
 * @project Paylink_Solutions
 * @created 15/03/2022
 */
public class ManageDriver {

    private static final Logger log = LogManager.getLogger(ManageDriver.class.getName());
    public static WebDriver driver;
    public String baseUrl = PropertyReader.getInstance().getProperty("baseUrl");

    //constructor to initialize and configure log4j
    public ManageDriver() {
        PageFactory.initElements(driver, this);
        PropertyConfigurator.configure(System.getProperty("user.dir") + "/src/test/java/resources/propertiesfile/log4j2.properties");
    }

    //this method will select browser, manage window, apply wait and get the url
    public void selectBrowser(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            log.info("Launching Chrome Browser");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            log.info("Launching Firefox Browser");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("ie")) {
            WebDriverManager.iedriver().setup();
            log.info("Launching IE Browser");
            driver = new InternetExplorerDriver();
        } else {
            System.out.println("Wrong browser name");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get(baseUrl);
    }

    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
