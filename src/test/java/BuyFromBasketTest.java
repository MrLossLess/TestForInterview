import org.testng.annotations.Test;
import pages.BuyFromBasket;

public class BuyFromBasketTest extends BuyFromBasket {

    @Test(priority = 1)
    public void buyFromBasketTest() {
        open();
        buyFromBasket();
    }


}
