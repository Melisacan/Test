package pages;

import methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage {

    Methods methods;

    public LoginPage(){
        methods = new Methods();
    }

    public void login(){
        methods.waitBySeconds(1);
        methods.click(By.cssSelector(".menu-top-button.login>a"));
        methods.waitBySeconds(1);

    }

    public void userName(){
        methods.waitBySeconds(1);
        WebElement email=methods.findElement(By.id("login-email"));
        email.sendKeys("melis.acan@testinium.com");
        methods.waitBySeconds(1);
    }
    public void password(){
        methods.waitBySeconds(1);
        WebElement password= methods.findElement(By.id("login-password"));
        password.sendKeys("17061997");
        methods.waitBySeconds(1);
    }
    public void signIn(){
        methods.waitBySeconds(1);
        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
        methods.waitBySeconds(20);
    }
}
