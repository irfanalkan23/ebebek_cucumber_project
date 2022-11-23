package com.ebebek.pages;

import com.ebebek.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BasePage {

    public CartPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

}
