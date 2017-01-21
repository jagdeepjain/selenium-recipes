/**
 * @author jagdeepjain
 *
 */
package org.example.jagdeep.recipes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchBrowserTabs {
    
    public static WebDriver browser;
    
    public static void main(String[] args) {
        browser = new FirefoxDriver();
        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // open a window
        browser.get("http://www.google.co.in");
        
        // search for a text
        browser.findElement(By.id("lst-ib")).sendKeys("Jagdeep");
        browser.findElement(By.name("btnG")).click();
        
        // lookup search result
        WebElement linkToOpen = browser.findElement(By
                .xpath("//*[@id=\"rso\"]/div/div[1]/div/h3/a"));
       
        // opening new window
        Actions action = new Actions(browser);
        action.keyDown(Keys.COMMAND).click(linkToOpen).keyUp(Keys.CONTROL)
                .build().perform();
        
        // switch to a new tab
        browser.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.TAB);
        // getting the context of new tab
        browser.switchTo().defaultContent();
        
        System.out.println("New Tab Text : "
                + browser.findElement(By.id("siteSub")).getText());
        
        // close the new tab
        browser.findElement(By.cssSelector("body")).sendKeys(Keys.COMMAND + "w");
        
        // switch to main tab
        browser.switchTo().defaultContent();
        System.out.println("Main Tab Text : " + linkToOpen.getText());
        
        browser.close();

    }
}
