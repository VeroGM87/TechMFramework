package framework.Maps;

import org.openqa.selenium.By;

public class LoginPageMap {

    public By loginInputUserName = By.cssSelector("input#userEmail");
    public By loginInputPassword = By.cssSelector("input#userPassword");
    public By loginButton = By.cssSelector("input[type=submit]");
}
