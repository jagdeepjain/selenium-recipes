/**
 * @author jagdeepjain
 *
 */
package org.example.jagdeep.recipes;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementProperties {

    public static WebDriver browser;
    
    public static void main(String args[]) {
        browser = new FirefoxDriver();
        
        File htmlSource = new File("html/css-attributes.html");
        String absPath = htmlSource.getAbsolutePath();

        browser.get("file://" + absPath);
        
        String bgcolor = browser.findElement(By.id("mydiv")).getCssValue("background-color");
        String width = browser.findElement(By.id("mydiv")).getCssValue("width");
        String height = browser.findElement(By.id("mydiv")).getCssValue("height");
        String borderTopWidth = browser.findElement(By.id("mydiv")).getCssValue("border-top-width");
        String borderBottomWidth = browser.findElement(By.id("mydiv")).getCssValue("border-bottom-width");        
        String borderTopColor = browser.findElement(By.id("mydiv")).getCssValue("border-top-color");
        
        browser.close();

        System.out.println("Background color : " + bgcolor);
        System.out.println("Width : " + width);
        System.out.println("Height : " + height);
        System.out.println("Border Top : " + borderTopWidth);
        System.out.println("Border Bottom : " + borderBottomWidth);
        System.out.println("Border Top Color : " + borderTopColor);
    }
}
