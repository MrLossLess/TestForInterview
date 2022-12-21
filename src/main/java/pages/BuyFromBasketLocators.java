package pages;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class BuyFromBasketLocators {

    public static SelenideElement laptops = $x("//div[@id='bx_1847241719_135']");
    public static SelenideElement someLaptop = $x("//a[@href='/catalog/noutbuki/noutbuki-hiper/24446/']");
    public static SelenideElement addToBasket = $x("//div[@id='bx_117848907_24446_basket_actions']");
    public static SelenideElement inTheBasket = $x("//a[@href='/basket/']/span[text()='В корзине']");
    public static SelenideElement placeAnOrder = $x("//button[@data-entity='basket-checkout-button']");
}
