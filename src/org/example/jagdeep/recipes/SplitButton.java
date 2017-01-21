package org.example.jagdeep.recipes;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SplitButton {
public static WebDriver browser;
    
    public static void main(String args[]) {
        browser = new FirefoxDriver();
        
        File htmlSource = new File("html/splitbutton.html");
        String absPath = htmlSource.getAbsolutePath();
        browser.get("file://" + absPath);
        System.out.println(browser.findElement(By.className("x-btn-split")).getAttribute("id"));
        System.out.println(browser.findElement(By.className("x-btn-split")).getAttribute("className"));
        browser.findElement(By.className("x-btn-split")).click();
        browser.close();
    }
}
