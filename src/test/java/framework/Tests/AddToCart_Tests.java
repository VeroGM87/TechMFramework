package framework.Tests;

import framework.Maps.LandingPageMap;
import framework.Maps.LoginPageMap;
import framework.Utils.BaseTest;
import framework.Utils.CommonActions;
import org.testng.annotations.Test;

public class AddToCart_Tests extends BaseTest {

    LandingPageMap landing = new LandingPageMap();
    LoginPageMap lg=new LoginPageMap();


    @Test
    public void ViewProduct(){//Validate View Product and Add to Cart
        commands.EnterText(lg.loginInputUserName, "test888999000@gmail.com");
        commands.EnterText(lg.loginInputPassword, "Test1234");
        commands.clickElement(lg.loginButton);
        commands.waitForElementToBeClickable(landing.ViewBtn);
        commands.clickElement(landing.ViewBtn);
        commands.waitForElementToBeClickable(landing.AddProdView);
        commands.clickElement(landing.AddProdView);


    }

    @Test
    public void addToCart(){
        commands.EnterText(lg.loginInputUserName, "test888999000@gmail.com");
        commands.EnterText(lg.loginInputPassword, "Test1234");
        commands.clickElement(lg.loginButton);
        commands.waitForElementToBeClickable(landing.HomeBtn);
        commands.clickElement(landing.AddToCartBtn);

    }

    @Test
    public void NavigateToHome(){//Firts navigate to Cart and comeback to Home
        commands.EnterText(lg.loginInputUserName, "test888999000@gmail.com");
        commands.EnterText(lg.loginInputPassword, "Test1234");
        commands.clickElement(lg.loginButton);
        commands.waitForElementToBeClickable(landing.HomeBtn);
        commands.clickElement(landing.CartBtn);
        commands.waitForElementToBeClickable(landing.HomeBtn);
        commands.clickElement(landing.HomeBtn);


    }




}
