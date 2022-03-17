package com.paylinksolutions.uitlity;

import com.paylinksolutions.drivermanager.ManageDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Vimal Vithalpura
 * @project Paylink_Solutions
 * @created 15/03/2022
 */
public class Utility extends ManageDriver {


    public void doClickOnElement(WebElement element) {
        element.click();
    }


    public void doSendTextToElement(WebElement element, String text) {
        element.sendKeys(text);
    }

    public String doGetTextFromElement(WebElement element) {
        return element.getText();
    }


    public static String getScreenshot(WebDriver driver, String screenshotName) {
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        // After execution, you could see a folder "FailedTestsScreenshots" under screenshot folder
        String destination = System.getProperty("user.dir") + "/src/test/java/resources/screenshots/" + screenshotName + dateName + ".png";
        File finalDestination = new File(destination);
        try {
            FileUtils.copyFile(source, finalDestination);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return destination;
    }

}
