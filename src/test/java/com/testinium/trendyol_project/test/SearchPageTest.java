package com.testinium.trendyol_project.test;

import com.testinium.trendyol_project.base.BaseTest;
import com.testinium.trendyol_project.page.SearchPage;
import org.junit.Before;
import org.junit.Test;

public class SearchPageTest extends BaseTest {

    SearchPage searchPage;
    @Before
    public void before(){
        searchPage=new SearchPage(getDriver());
    }
    @Test
    public void searchControl(){
        searchPage.callSearchPage().searchValue();
        searchPage.callSearchPage().selectProduct();
    }
}
