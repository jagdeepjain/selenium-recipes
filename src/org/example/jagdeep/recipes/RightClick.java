/**
 * @author jagdeepjain
 *
 */
package org.example.jagdeep.recipes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
    
    public static WebDriver browser;
    
    public static void main(String args[]) {
        browser = new FirefoxDriver();
        browser.get("https://www.google.co.in/");
        Actions action = new Actions(browser);
        action.contextClick(browser.findElement(By.id("lst-ib")))
                .sendKeys(Keys.ARROW_DOWN).build()
                .perform();
        
        browser.close();
        
    }
}
