package com.paylinksolutions;

import com.cucumber.listener.Reporter;
import com.paylinksolutions.propertyreader.PropertyReader;
import com.paylinksolutions.uitlity.Utility;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

/**
 * @author Vimal Vithalpura
 * @project Paylink_Solutions
 * @created 15/03/2022
 */
public class Hooks extends Utility {

    //This will run before every scenario
    @Before
    public void setUp(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
        Reporter.assignAuthor("Vimal Vithalpura");
    }

    //This will run after every scenario
    @After
    public void tearDown(Scenario scenario){

        //Using the isFailed method of the scenario interface to get a screenshot upon test failure
        if (scenario.isFailed()){
            //if failed take screenshot
            String screenshotPath = Utility.getScreenshot(driver, scenario.getName().replace(" ", "_"));
            try {
                //adds screenshot to the report
                Reporter.addScreenCaptureFromPath(screenshotPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        closeBrowser();
    }
}
