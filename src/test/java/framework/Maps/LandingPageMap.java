package framework.Maps;

import org.openqa.selenium.By;

public class LandingPageMap {

    //Header buttons
    public By HomeBtn = By.cssSelector("ul li:first-child button.btn.btn-custom");
    public By CartBtn = By.cssSelector("i:first-child.fa.fa-shopping-cart");
    public By SignOutBtn = By.cssSelector("ul li:last-child button");


    //Inventory products
    public By AddToCartBtn = By.cssSelector("div.card-body:last-child button.btn.w-10");
    public By ViewBtn = By.cssSelector("div.card-body:last-child button.btn.w-40");


    //ProductView Page buttons
    public By AddProdView = By.cssSelector("div.product-buttons button");
    public By ContinueShoppingBtn = By.cssSelector("div a.continue");




}
