package com.testinium.trendyol_project.base;

import com.testinium.trendyol_project.util.Browser;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseTest {
    private static RemoteWebDriver driver;
    protected final Logger log = LogManager.getLogger(BaseTest.class);
    protected static Browser browser = new Browser();
    private final String URL = "https://www.trendyol.com";


    @Before
    public void setUp() {
        log.info("SetUp işlemi yapılıyor...");
        browser.setBrowser(URL);
    }

    @After
    public void tearDown() {
        getDriver().close();
        log.info("İşlem Bitti...");
    }

    public static RemoteWebDriver getDriver() {
        return driver;
    }

    public static void setDriver(RemoteWebDriver driver) {

        BaseTest.driver = driver;
    }
}

