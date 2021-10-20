package com.testinium.trendyol_project.test;

import com.testinium.trendyol_project.page.LoginPage;
import org.junit.Before;
import org.junit.Test;

public class LoginPageTest extends com.testinium.trendyol_project.base.BaseTest {
    LoginPage loginPage;

    @Before
    public void before() {
        loginPage = new LoginPage(getDriver());
    }

    @Test
    public void test() {
        loginPage.selectGender();
        loginPage.login();
    }

}
