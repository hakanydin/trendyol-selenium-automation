package com.testinium.trendyol_project.util;

import com.testinium.trendyol_project.base.BaseTest;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class Browser {
    protected final Logger logger = LogManager.getLogger(Browser.class);

    public void setBrowser(String url) {
        //Chrome driver'ın dizinini belirttik.
        System.setProperty("webdriver.chrome.driver","properties/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        // Browser ayarları
        DesiredCapabilities capabilities = new DesiredCapabilities();
        // Chrome ayarları
        ChromeOptions option = new ChromeOptions();
        // Browser'ı test modunda çalıştırır
        option.addArguments("test-type");
        // Popup'ları otomatik kapatır
        option.addArguments("disable-popup-blocking");
        // Güvenlik sertifakası hatası varsa es geçer
        option.addArguments("ignore-certificate-errors");
        // Dil çevirme penceresini kapatır.
        option.addArguments("disable-translate");
        // Browser tam ekran
        option.addArguments("start-maximized");
        // Otomatik şifre kaydet seçeneğini kapatır.
        option.addArguments("disable-automatic-password-saving");
        option.addArguments("allow-silent-push");
        // Bilgi ekranını kapatır.
        option.addArguments("disable-infobars");
        option.addArguments("--disable-notifications");
        option.setExperimentalOption("useAutomationExtension", false);
        capabilities.setCapability("browserName", "chrome");
        capabilities.setPlatform(Platform.WINDOWS);
        // Chrome ayarlarını selenium ayarlarına dönüştüyoruz.
        capabilities.setCapability(ChromeOptions.CAPABILITY, option);
        // Driver'ımızı setliyoruz.
        BaseTest.setDriver(new ChromeDriver(option));

        BaseTest.getDriver().navigate().to(url);
        BaseTest.getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }
}
