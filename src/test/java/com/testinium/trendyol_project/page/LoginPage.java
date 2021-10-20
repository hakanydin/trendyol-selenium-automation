package com.testinium.trendyol_project.page;

import com.testinium.trendyol_project.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.testinium.trendyol_project.constants.ConstantsLoginPage.*;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public LoginPage selectGender() {

        clickElement(GENDER_SELECT);
        return new LoginPage(getDriver());
    }

    public LoginPage login() {

        hoverElement(LOGIN_HOVER);
        clickElement(LOGIN_BUTTON);
        sendKeys(EMAIL_AREA, "");//Cred 1
        sendKeys(PASS_AREA, "");//Cred 2
        clickElement(LOGIN_PAGE_BUTTON);
        waitSeconds(2);


        return new LoginPage(getDriver());
    }
}
