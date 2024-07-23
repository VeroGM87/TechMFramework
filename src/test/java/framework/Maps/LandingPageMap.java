package framework.Maps;

import org.openqa.selenium.By;

public class LandingPageMap {

    //Header buttons
    public By HomeBtn = By.cssSelector("ul li:first-child button.btn.btn-custom");
    public By CartBtn = By.xpath("//ul/li[4]/button/i");
    public By SignOutBtn = By.cssSelector("ul li:last-child button");


    //Inventory products
    public By AddToCartBtn = By.xpath("(//button[@class='btn w-10 rounded'])[1]");
    public By ViewBtn = By.cssSelector("div.card-body:last-child button.btn.w-40");


    //ProductView Page buttons
    public By AddProdView = By.cssSelector("div.product-buttons button");
    public By ContinueShoppingBtn = By.cssSelector("div a.continue");

    //Cart Page
    public By TrashBtn = By.cssSelector("//button[@class='btn btn-danger']");
    public By numberOfProdAdded = By.xpath("//ul/li[4]/button/label");


}
