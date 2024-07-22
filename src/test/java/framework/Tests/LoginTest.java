package framework.Tests;

import framework.Maps.LoginPageMap;
import framework.Utils.BaseTest;
import framework.Utils.CommonActions;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    LoginPageMap lg = new LoginPageMap();


    @Test
    public void LoginSuccessfully(){
        commands.EnterText(lg.loginInputUserName, "test888999000@gmail.com");
        commands.EnterText(lg.loginInputPassword, "Test1234");
        commands.clickElement(lg.loginButton);

    }

    @Test
    public void Test2(){
        System.out.println("HelloWorld");
    }





}
