package com.testinium.trendyol_project.test;

import com.testinium.trendyol_project.page.CartPage;
import com.testinium.trendyol_project.base.BaseTest;
import org.junit.Before;
import org.junit.Test;

public class CartPageTest extends BaseTest {
    CartPage cartPage;

    @Before
    public void before() {
        cartPage = new CartPage(getDriver());
    }

    @Test
    public void cartControl() {
        cartPage.selectFav();
        cartPage.priceCompire();
        cartPage.removeCart();


    }
}
