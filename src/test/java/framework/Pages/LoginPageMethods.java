package framework.Pages;

import framework.Maps.LoginPageMap;
import framework.Utils.CommonActions;
import org.openqa.selenium.WebDriver;

public class LoginPageMethods {

    CommonActions commands;
    LoginPageMap lg = new LoginPageMap();

    public LoginPageMethods(CommonActions commands){
        this.commands= commands;

    }


    public void login(){
        commands.EnterText(lg.loginInputUserName, "test888999000@gmail.com");
        commands.EnterText(lg.loginInputPassword, "Test1234");
        commands.clickElement(lg.loginButton);
    }
}
