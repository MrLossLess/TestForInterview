package pages;

import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.clearBrowserCookies;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;


public class BuyFromBasket extends BuyFromBasketLocators {

    public static void open() {
        String url = "https://f5it.ru/";
        Selenide.open(url);
    }

    @BeforeSuite
    public void setUp() {
        Configuration.browser = Browsers.CHROME;
        Configuration.startMaximized = true;
    }

    public static void buyFromBasket() {
        laptops.shouldBe(visible).shouldHave(text("Ноутбуки")).click();
        someLaptop.shouldBe(visible).click();
        addToBasket.shouldBe(visible).shouldHave(text("В корзину")).click();
        inTheBasket.shouldHave(text("В корзине")).click();
        placeAnOrder.shouldBe(visible).shouldHave(text("Оформить заказ")).click();

    }


    @AfterSuite
    public void clearCookie() {
        clearBrowserCookies();
    }

    public void tearDown() {
        closeWebDriver();
    }
}

