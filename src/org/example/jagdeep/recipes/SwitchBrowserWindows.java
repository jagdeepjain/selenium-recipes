/**
 * @author jagdeepjain
 *
 */
package org.example.jagdeep.recipes;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchBrowserWindows {
    
    public static WebDriver browser;
    
    public static void main(String[] args) {
        browser = new FirefoxDriver();
        browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
        browser.get("http://www.google.co.in");
        
        browser.findElement(By.id("lst-ib")).sendKeys("Jagdeep");
        browser.findElement(By.name("btnG")).click();
        
        WebElement linkToOpen = browser.findElement(By
                .xpath("//*[@id=\"rso\"]/div/div[1]/div/h3/a"));
        
        // getting window handle
        String mainWindow = browser.getWindowHandle();
        
        Actions action = new Actions(browser);
        
        // opening new window
        action.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).click(linkToOpen)
                .keyUp(Keys.CONTROL).keyUp(Keys.SHIFT).build().perform();

        // getting handles of all open windows
        Set<String> newWindow = browser.getWindowHandles();
        // removing the main window handlers
        newWindow.remove(mainWindow);
        // switching to new window
        browser.switchTo().window((String) newWindow.toArray()[0]);
        
        System.out.println("New Tab Text : "
                + browser.findElement(By.tagName("h1")).getText());
        
        // closing new window
        browser.close();
        // switching to main window
        browser.switchTo().window(mainWindow);
        // closing main window
        browser.close();

    }
}
