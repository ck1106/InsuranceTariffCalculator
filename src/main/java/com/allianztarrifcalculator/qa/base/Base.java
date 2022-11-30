package com.allianztarrifcalculator.qa.base;

import com.allianztarrifcalculator.qa.actiondriver.action;
import com.allianztarrifcalculator.qa.utility.ExtentManager;
import com.allianztarrifcalculator.qa.utility.utility;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

/**
 * @author Bernard Akondoh
 * @Date 5/24/2022
 */
public class Base {
    //public static WebDriver driver;


    public static Properties prop; //creating properties object
    public static ThreadLocal<RemoteWebDriver> driver= new ThreadLocal<>();  //Declaring threadLocal Driver for parallel execution

    //Get driver from threadLocalMap
    public static WebDriver getDriver(){
        return driver.get();
    }

    //initializing log4j environments :: extent report
    @BeforeSuite
    public void beforeSuite(){
        DOMConfigurator.configure("log4j.xml");
        ExtentManager.setExtent();
    }


    //reads configuration file (loading configuration)
    public Base(){
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/allianztarrifcalculator"
                    + "/qa/configuration/config.properties");
            prop.load(ip);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*=========================SETTING UP AND LAUNCHING BROWSER =========================================*/
    public static void LaunchBrowser() {
        String browserName = prop.getProperty("browser1");
        if (browserName.equalsIgnoreCase("chrome")) {
             WebDriverManager.chromedriver().setup();
             driver.set(new ChromeDriver());
           //System.setProperty("webdriver.chrome.driver", "chrome/chromedriver.exe");
             // driver.set(new ChromeDriver());
            //driver = new ChromeDriver();

        } else if (browserName.equalsIgnoreCase("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            //driver = new FirefoxDriver();
            //set driver to threadLocalMap
            driver.set(new FirefoxDriver());
        }else if (browserName.equalsIgnoreCase("IE")){
            WebDriverManager.iedriver().setup();
            driver.set(new InternetExplorerDriver());
        }
        getDriver().manage().window().maximize();
        getDriver().manage().deleteAllCookies();
        action.pageLoadTimeOut(getDriver());
        action.implicitWait(getDriver());
        action.launchUrl(getDriver(),prop.getProperty("url"));
    }

    /*=========EXECUTES AFTER EVERY METHOD IN A CLASS : .quit()  closes all browser windows and ends the WebDriver session =========================================*/
    @AfterMethod
    public void tearDown()
    {
      getDriver().quit();
    }

    /*   EXECUTES AFTER .XML SUITES    */
    @AfterSuite
    public void afterSuite(){
        ExtentManager.endReport();
    }




}
