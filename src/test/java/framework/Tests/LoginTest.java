package framework.Tests;

import framework.Maps.LandingPageMap;
import framework.Maps.LoginPageMap;
import framework.Pages.LoginPageMethods;
import framework.Utils.BaseTest;
import framework.Utils.CommonActions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    LoginPageMap lg = new LoginPageMap();
    LandingPageMap landingPg = new LandingPageMap();


    @Test
    public void LoginSuccessfully(){
        LoginPageMethods log = new LoginPageMethods(commands);
        log.login();
        commands.waitForElementToBeClickable(landingPg.SignOutBtn);
        Assert.assertEquals(driver.getCurrentUrl(),"https://rahulshettyacademy.com/client/dashboard/dash");

    }

    @Test
    public void Test2(){
        System.out.println("HelloWorld");
    }





}
