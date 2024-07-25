package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    //page Locator
    private By userName= By.id("userName");
    private By password = By.id("password");
    private By loginButton = By.xpath("//button[@id='login']");
    private By loggedInUser =By.xpath("//label[text()='Obaydul']");
    private By pageHeader =By.xpath("//h1[text()='Login']");
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getUserName() {
        return getElement(userName);
    }

    public WebElement getPassword() {
        return getElement(password);
    }

    public WebElement getLoginButton() {
        return getElement(loginButton);
    }

    public WebElement getLoggedInUser() {
        return getElement(loggedInUser);
    }

    public String  getLogPageHeader() {
        return getPageHeader(pageHeader);
    }
    public String getLoginPageTitle(){
        return getPageTitle();
    }
    public HomePage doLogin(String username,String password){
        getUserName().sendKeys(username);
        getPassword().sendKeys(password);
        getLoginButton().click();
        return getInstance(HomePage.class);

    }
    public void doLogin(){
        getUserName().sendKeys();
        getPassword().sendKeys();
        getLoginButton().click();
    }
    public void doLogin(String userCred){
        getUserName().sendKeys(userCred);
        getPassword().sendKeys();
        getLoginButton().click();
    }
}
