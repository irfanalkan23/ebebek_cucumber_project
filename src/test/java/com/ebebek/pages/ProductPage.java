package com.ebebek.pages;

import com.ebebek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends BasePage {

    public ProductPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "/html/body/app-root/cx-storefront/cx-page-slot/eb-breadcrumb/div/div/nav/div/span[2]/span/a/span/a")
    public WebElement searchResultHeader;

    @FindBy(xpath = "//a[@href=\"/lansinoh-hosgeldin-bebek-biberon-seti-p-lsi-2028\"]")
    public WebElement firstBiberon;

    @FindBy(id="txtProductTitle")
    public WebElement firstBiberonTitle;

    @FindBy(id="addToCartBtn")
    public WebElement addToCartButton;

    @FindBy(xpath = "//p[text()=' Ürün Sepetinizde ']")
    public WebElement productAddedToCartMessage;

    @FindBy(id="btnShowCart")
    public WebElement showCartButton;

}
