package com.allianztarrifcalculator.qa.utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

/**
 * @author Bernard Akondoh
 * @Date 5/24/2022
 */
public class ExtentManager {

    public static ExtentHtmlReporter htmlReporter;
    public static ExtentReports extent;
    public static ExtentTest test;

    public static void setExtent() {
        htmlReporter= new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/extentReport/"+"AllianzReport.html");
        htmlReporter.loadXMLConfig(System.getProperty("user.dir")+"/extent-config.xml");


        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        extent.setSystemInfo("HostName", "PersonalHost");
        extent.setSystemInfo("ProjectName", "AllianzTarrifCalculatorProject");
        extent.setSystemInfo("Tester", "Bernard Akondoh");
        extent.setSystemInfo("OS", "Win10");
        extent.setSystemInfo("Browser", "Chrome");
    }
    public static void endReport() {
        extent.flush();
    }

}
