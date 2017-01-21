/**
 * @author jagdeepjain
 *
 */
package org.example.jagdeep.recipes;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
    public static WebDriver browser;
    
    public static void main(String args[]) {
        browser = new FirefoxDriver();
        
        File htmlSource = new File("html/doubleclick.html");
        String absPath = htmlSource.getAbsolutePath();
        
        browser.get("file://" + absPath);
        browser.manage().window().maximize();
        
        Actions action = new Actions(browser);
        WebElement element = browser.findElement(By.id("main"));
        
        action.doubleClick(element).build().perform();
        
        String doubleClickText = browser.findElement(By.id("demo")).getText();
        browser.close();
        
        System.out.println(doubleClickText);
        
    }
}
