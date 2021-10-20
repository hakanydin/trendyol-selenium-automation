package com.testinium.trendyol_project.constants;

import org.openqa.selenium.By;

public class ConstantsLoginPage {


    public static final By POPUP_CLASS =By.className("homepage-popup");
    public static final By GENDER_SELECT = By.cssSelector(".homepage-popup-content img[alt='Male']");

    public static final By LOGIN_HOVER = By.xpath("//p[contains(text(),'Giriş Yap')]");
    public static final By LOGIN_BUTTON = By.cssSelector("div[class='login-button']");
    public static final By EMAIL_AREA=By.id("login-email");
    public static final By PASS_AREA= By.id("login-password-input");
    public static final By LOGIN_PAGE_BUTTON = By.cssSelector("div.q-layout.login button[type=submit]");
    public static final By SEARCH_AREA =By.cssSelector("input.search-box");


}
