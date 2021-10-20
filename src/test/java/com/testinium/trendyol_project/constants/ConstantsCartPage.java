package com.testinium.trendyol_project.constants;

import org.openqa.selenium.By;

public class ConstantsCartPage {
    public static final By FAVORITE_BUTTON = new By.ByCssSelector(".fv");
    public static final By FAVORITES = new By.ByXPath("//p[contains(text(),'Favorilerim')]");
    public static final By PRICE = new By.ByCssSelector(".pr-in-cn span[class='prc-slg']");
    public static final By CART_PRICE = new By.ByCssSelector("div[class='prc-box-sllng']");
    public static final By REMOVE_CART = new By.ByCssSelector("i[class='i-close']");
    public static final By EMPTY_TEXT = new By.ByCssSelector("p[class='empty-favorites-header']");
}
