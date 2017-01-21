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

public class FindElementsInIFrame {
   
    public static  WebDriver browser;
    
    public static void main(String args[]) {
        browser = new FirefoxDriver();
        
        File htmlSource = new File("html/iframe.html");

        String absPath = htmlSource.getAbsolutePath();

        browser.get("file://" + absPath);
 
        WebElement iframe = browser.findElement(By.xpath("/html/body/iframe"));
        browser.switchTo().frame(iframe).findElement(By.id("menubtn")).click();
        
        browser.close();

    }
}
