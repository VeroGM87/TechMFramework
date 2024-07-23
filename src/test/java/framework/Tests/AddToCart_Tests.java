package framework.Tests;

import framework.Maps.LandingPageMap;
import framework.Maps.LoginPageMap;
import framework.Pages.LoginPageMethods;
import framework.Utils.BaseTest;
import framework.Utils.CommonActions;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCart_Tests extends BaseTest {

    LandingPageMap landing = new LandingPageMap();
    LoginPageMap lg=new LoginPageMap();
     LoginTest  LgTest=new LoginTest();

    @Test
    public void addToCart(){
        LoginPageMethods log = new LoginPageMethods(commands);
        log.login();
        commands.clickElement(landing.CartBtn);
        Assert.assertEquals(driver.getCurrentUrl(),"https://rahulshettyacademy.com/client/dashboard/cart");
    }

    @Test
    public void ViewProduct(){//Validate View Product, Add to Cart and Navigate to Cart
        LoginPageMethods log = new LoginPageMethods(commands);
        log.login();
        commands.waitForElementToBeClickable(landing.ViewBtn);
        commands.clickElement(landing.ViewBtn);
        commands.waitForElementToBeClickable(landing.AddProdView);
        commands.clickElement(landing.AddProdView);
        commands.clickElement(landing.CartBtn);
        Assert.assertEquals(driver.getCurrentUrl(),"https://rahulshettyacademy.com/client/dashboard/cart");
    }


    @Test
    public void NavigateToHome(){//Firts navigate to Cart and comeback to Home
        LoginPageMethods log = new LoginPageMethods(commands);
        log.login();
        commands.waitForElementToBeClickable(landing.HomeBtn);
        commands.clickElement(landing.CartBtn);
        commands.waitForElementToBeClickable(landing.HomeBtn);
        commands.clickElement(landing.HomeBtn);
        Assert.assertEquals(driver.getCurrentUrl(),"https://rahulshettyacademy.com/client/dashboard/dash");
    }




}
