package com.testinium.trendyol_project.test;

import com.testinium.trendyol_project.base.BaseTest;
import com.testinium.trendyol_project.page.MainPage;
import org.junit.Before;
import org.junit.Test;
/* Düzeltilecek --> Favoriler dolu iken boş bekliyor düzeltilecek */
public class MainPageTest extends BaseTest {

    MainPage mainPage;

    @Before
    public void before(){
        mainPage = new MainPage(getDriver());
    }
    @Test
    public void mainControl() {
       mainPage.callLoginPage().selectGender();
       mainPage.callLoginPage().login();
       mainPage.callSearchPage().searchValue();
       mainPage.callSearchPage().selectProduct();
       mainPage.callCartPage().selectFav();
       mainPage.callCartPage().priceCompire();
       mainPage.callCartPage().removeCart();

    }



}
