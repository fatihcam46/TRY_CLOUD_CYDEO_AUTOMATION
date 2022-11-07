package com.Try_Cloud.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {

    static private WebDriver driver;

    static private InheritableThreadLocal driverPool = new InheritableThreadLocal();

    private Driver() {
    }

    public static WebDriver getDriver() {

        if (driver == null) {
            String browserType = Configuration_Reader.getProperties("browser");

            if (browserType.equals("remote-chrome")) {

                try {
                    String gridAddress = "18.212.11.195";
                    URL url = new URL("http://" + gridAddress + ":4444/wd/hub");
                    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
                    desiredCapabilities.setBrowserName("chrome");
                    driver = new RemoteWebDriver(url, desiredCapabilities);

                } catch (Exception e) {
                    System.out.println("remote-chrome problem");
                    e.printStackTrace();
                }


            } else if (browserType.equals("chrome")) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            } else if (browserType.equals("firefox")) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            } else if (browserType.equals("edge")) {
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            } else if (browserType.equals("headless-chrome")) {
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--headless");
                driver = new ChromeDriver(options);
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                driver.manage().window().setSize(new Dimension(1500, 1500));
            } else {
                System.out.println("There is a browser typo error check .properties file");
            }


        }


        return driver;
    }


    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }


}
