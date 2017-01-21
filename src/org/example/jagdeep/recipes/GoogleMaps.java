/**
 * @author jagdeepjain
 *
 */
package org.example.jagdeep.recipes;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.sikuli.webdriver.ImageElement;
import org.sikuli.webdriver.SikuliFirefoxDriver;

public class GoogleMaps {
    
    // public static WebDriver browser;
    
    public static void main(String[] args) {
        SikuliFirefoxDriver browser = new SikuliFirefoxDriver();
        browser.get("https://maps.google.co.in/");
        
        WebElement searchBox = browser.findElement(By.id("searchboxinput"));
        searchBox.sendKeys("Magarpatta City, Pune, Maharashtra");
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        searchBox.sendKeys(Keys.ENTER);
        
        System.out.println(browser.getPageSource());
        
        browser.findElement(By.id("widget-pane-section-header-title")).getText();
        
        
    }
    
}
