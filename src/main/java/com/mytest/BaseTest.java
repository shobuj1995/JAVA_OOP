package com.mytest;

import com.mypages.BasePage;
import com.mypages.Page;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {
    WebDriver driver;
    public Page page;
    @BeforeMethod
    @Parameters(value = {"browser"})
    public void setUpTest(String browser){
        if(browser.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        } else if (browser.equals("ff")) {
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
        }else {
            System.out.println("There is no browser defined in the XML file");
        }
        driver.get("https://demoqa.com/login");
        try {
            Thread.sleep(6000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        page=new BasePage(driver);
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
