package com.testinium.trendyol_project.page;

import com.testinium.trendyol_project.base.BasePage;
import org.openqa.selenium.WebDriver;
import com.testinium.trendyol_project.constants.ConstantsSearchPage.*;

import static com.testinium.trendyol_project.constants.ConstantsSearchPage.*;

public class SearchPage extends BasePage {
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public SearchPage searchValue(){
        sendKeys(SEARCH_AREA,VALUE);
        findList(SEARCH_ICON_LIST).get(0).click();
        waitSeconds(1);

        return new SearchPage(getDriver());
    }
    public SearchPage selectProduct() {
        clickElement(EMPTY_AREA);
        findList(PRODUCT_LIST).get(9).click();
        waitSeconds(3);
        return new SearchPage(getDriver());
    }
}
