package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowser {
    static String browser = "Edge";
    static WebDriver driver;
    static String baseUrl = "https://www.saucedemo.com/";

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver =new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        }else{
            System.out.println("Wrong Browser name");
        }
        //Open URL
        driver.get(baseUrl);
        //Print the title of the page
        System.out.println(driver.getTitle());
        //print the current URL
        System.out.println("Current URL: "+ driver.getCurrentUrl());
        //Print the page source
        System.out.println("Page source: "+ driver.getPageSource());
        //Enter the email to email field
        driver.findElement(By.id("user-name")).sendKeys("Shreeji@gmail.com");
        //Enter the password to the password field
        driver.findElement(By.id("password")).sendKeys("Swaminarayan123");
        //Close the Browser
        //driver.close();

    }
}
