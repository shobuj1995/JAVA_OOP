package com.mytest;

import com.mypages.HomePage;
import com.mypages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
    LoginPage loginPageObject =page.getInstance(LoginPage.class);
    @Test(priority = 1)
    public void verifyLoginPageTitleTest(){
        String title= loginPageObject.getLoginPageTitle();
        System.out.println("title");
        Assert.assertEquals(title,"DEMOQA");
    }
    @Test(priority = 2)
    public void verifyLoginPageHeaderTest(){
        String loginPageHeader= loginPageObject.getLogPageHeader();
        System.out.println(loginPageHeader);
        Assert.assertEquals(loginPageHeader,"Login");
    }
    @Test(priority = 3)
    public void doLoginTest(){
        HomePage homePage= loginPageObject.doLogin("Obaydul","12345Ab!");
        String loggedInUserName= homePage.getLoggedInUser();
        String homepageTitle= homePage.getPageTitle();
        System.out.println("This is homepage title: "+homepageTitle);
        Assert.assertEquals(loggedInUserName,"Obaydul");
    }
}
