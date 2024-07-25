package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    private By loggedInUser =By.xpath("//label[text()='Obaydul']");
    public String getLoginPageTitle(){
        return getPageTitle();
    }
    public String getLoggedInUser() {
        return String.valueOf(getElement(loggedInUser));
    }
}
