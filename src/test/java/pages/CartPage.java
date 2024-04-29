package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class CartPage {

    private String removeFromCartButton = "//button[@name='remove_cart_item']";
    private String backButton = "//a[text()='<< Back']";
    private String emptyCartMessage = "//em";
    private String duckPriceFromCart = "//td[@class='unit-cost']";
    public void clickRemoveFromCartButton() {
        $x(removeFromCartButton).click();
    }

    public void waitingUntilProductIsAddedToCart() {
        $("span.quantity").shouldHave(text("1"));
    }

    public void waitingUntilBackButtonAppearsOnThePage() {
        $x(backButton).shouldBe(visible);
    }

    public SelenideElement getEmptyCartMessageElement() {
        return $x(emptyCartMessage);
    }

    public SelenideElement getProductPriceElement() {
        return $x(duckPriceFromCart);
    }
}

