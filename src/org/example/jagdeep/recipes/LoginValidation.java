/**
 * @author jagdeepjain
 *
 */
package org.example.jagdeep.recipes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginValidation {
public static WebDriver browser;
    
    public static void test1() {
        browser = new FirefoxDriver();
        
        browser.get("http://demo.silverstripe.org/Security/login");
        browser.manage().window().maximize();
        
        WebElement name = browser.findElement(By.name("Email"));
        WebElement password = browser.findElement(By.name("Password"));
        WebElement submit = browser.findElement(By.name("action_dologin"));

        name.clear();
        name.sendKeys(" ");
        password.clear();
        submit.click();
        System.out.println("Should see content: " + browser.findElement(By.className("content")).getText());

        browser.close();
    }
    
    public static void test2() {
        browser = new FirefoxDriver();
        
        browser.get("http://demo.silverstripe.org/Security/login");
        browser.manage().window().maximize();
        
        WebElement name = browser.findElement(By.name("Email"));
        WebElement password = browser.findElement(By.name("Password"));
        WebElement submit = browser.findElement(By.name("action_dologin"));
       
        name.clear();
        password.clear();
        password.sendKeys(" ");
        submit.click();
        System.out.println("Should see content: " + browser.findElement(By.className("content")).getText());
        
        browser.close();
         
    }
    
    public static void test3() {
        browser = new FirefoxDriver();
        
        browser.get("http://demo.silverstripe.org/Security/login");
        browser.manage().window().maximize();
        
        WebElement name = browser.findElement(By.name("Email"));
        WebElement password = browser.findElement(By.name("Password"));
        WebElement submit = browser.findElement(By.name("action_dologin"));

        name.clear();
        name.sendKeys(" spanish");
        password.clear();
        password.sendKeys("password");
        submit.click();
        System.out.println("Should see error as : " + browser.findElement(By.id("MemberLoginForm_LoginForm_error")).getText());
        
        browser.close();
    }
    
    public static void test4() {
        browser = new FirefoxDriver();
        
        browser.get("http://demo.silverstripe.org/Security/login");
        browser.manage().window().maximize();
        
        WebElement name = browser.findElement(By.name("Email"));
        WebElement password = browser.findElement(By.name("Password"));
        WebElement submit = browser.findElement(By.name("action_dologin"));
        
        name.clear();
        name.sendKeys("spanish");
        password.clear();
        password.sendKeys("password");
        submit.click();
        //System.out.println("Should see Spanish Demo: " + browser.findElement(By.className("profile-link")).getText());
        System.out.println("Should see Spanish Demo: " + browser.findElement(By.id("MemberLoginForm_LoginForm_error")).getText());
              
        browser.close();
    }
    public static void main(String argsp[]) {
        test1();
        test2();
        test3();
        test4();
    }
}
