package framework.Tests;

import framework.Maps.LandingPageMap;
import framework.Maps.LoginPageMap;
import framework.Pages.LoginPageMethods;
import framework.Utils.BaseTest;
import framework.Utils.CommonActions;
import framework.Utils.MySQLManager;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginTest extends BaseTest {

    LoginPageMap lg = new LoginPageMap();
    LandingPageMap landingPg = new LandingPageMap();


    @Test(groups = {"Regression", "SmokeTest"})
    public void LoginSuccessfully(){
        LoginPageMethods log = new LoginPageMethods(commands);
        log.login();
        commands.waitForElementToBeClickable(landingPg.SignOutBtn);
        Assert.assertEquals(driver.getCurrentUrl(),"https://rahulshettyacademy.com/client/dashboard/dash");

    }

    @Test
    public void Test2()throws SQLException {

        ResultSet result= MySQLManager.executeQuery("SELECT * FROM users");
        while (result.next()){
            int userId = result.getInt("user_id");
            String username= result.getString("username");
            String email =result.getString("email");

            System.out.println("Id" + ", username: " + username + ", Email: " + email);

        }
    }





}
