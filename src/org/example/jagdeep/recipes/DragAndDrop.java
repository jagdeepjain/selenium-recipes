/**
 * @author jagdeepjain
 *
 */
package org.example.jagdeep.recipes;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    
    public static WebDriver browser;
    
    public static void main(String args[]) {
        browser = new FirefoxDriver();
        
        File htmlSource = new File("html/draganddrop.html");
        String absPath = htmlSource.getAbsolutePath();
        browser.get("file://" + absPath);
        //browser.get("http://html5demos.com/drag");
        browser.manage().window().maximize();
        
        WebElement destination = browser.findElement(By.id("div1"));
        System.out.println(destination.getAttribute("id"));
        WebElement source = browser.findElement(By.tagName("img"));
        System.out.println(source.getAttribute("draggable"));
        Actions dragAndDropAction = new Actions(browser);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        dragAndDropAction.dragAndDrop(source, destination).perform();;
        
        browser.close();
        
    }
}
