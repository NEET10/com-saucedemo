package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
    public static void main(String[] args) {
        String baseUrl = "https://www.saucedemo.com/";
        //Set up the ChromeBrowser
        WebDriver driver = new ChromeDriver();
        //Open URL
        driver.get(baseUrl);
        //Print the title of the page
        System.out.println(driver.getTitle());
        //Print the Current URL
        System.out.println("Current URL: "+ driver.getCurrentUrl());
        //Print the page source
        System.out.println("Page source; "+ driver.getPageSource());
        //Enter the email to email field
        driver.findElement(By.id("user-name")).sendKeys("Shreeji@gmail.com");
        //Enter the password to the password field
        driver.findElement(By.id("password")).sendKeys("Swaminarayan123");
        //Close the browser
        //driver.close();
    }
}
