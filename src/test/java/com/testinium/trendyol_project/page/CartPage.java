package com.testinium.trendyol_project.page;

import com.testinium.trendyol_project.base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import static com.testinium.trendyol_project.constants.ConstantsCartPage.*;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }


    public CartPage selectFav() {
        waitSeconds(2);
        switchToPage();
        clickElement(FAVORITE_BUTTON);
        waitSeconds(2);

        return new CartPage(getDriver());
    }

    public CartPage priceCompire() {
        String priceProduct = getText(PRICE);
        clickElement(FAVORITES);
        String cartPriceProduct = getText(CART_PRICE);
        Assert.assertEquals("Ürün Fiyatları Eşleşmemektedir.", priceProduct, cartPriceProduct);


        return new CartPage(getDriver());
    }

    public CartPage removeCart() {
        clickElement(REMOVE_CART);
        String emptyCart = getText(EMPTY_TEXT);
        Assert.assertEquals("Sepetiniz Boşaltılamamıştır", "Favoriler Listeniz Henüz Boş", emptyCart);
        waitSeconds(5);


        return new CartPage(getDriver());
    }
}
