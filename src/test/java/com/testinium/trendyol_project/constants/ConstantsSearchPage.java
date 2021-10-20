package com.testinium.trendyol_project.constants;

import org.openqa.selenium.By;

public class ConstantsSearchPage {
    public static final By SEARCH_AREA = new By.ByCssSelector("input[class='search-box']");
    public static final String VALUE = "kazak";
    //  public static final By SEARCH_ICON = new By.ByCssSelector(".search-box-container i[class='search-icon']");
    public static final By SEARCH_ICON_LIST = new By.ByCssSelector("#auto-complete-app a[class='suggestion']");
    public static final By EMPTY_AREA = new By.ByCssSelector("div[id='container']");
    public static final By PRODUCT_LIST = new By.ByCssSelector("div[class='image-container']");

}
