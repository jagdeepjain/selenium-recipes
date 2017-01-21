/**
 * @author jagdeepjain
 *
 */
package org.example.jagdeep.recipes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatePicketJet2 {
    public static WebDriver browser;
    
    public static void main(String args[]) throws InterruptedException {
        
        browser = new FirefoxDriver();
        String url = "http://www.jet2.com/";
        
        browser.get(url);
        browser.manage().window().maximize();
      
        browser.findElement(By.id("departureAirportList")).click();  
        WebElement departureCountry = browser.findElement(By.id("destinations-uk"));
        WebElement departureCityLocator = departureCountry.findElement(By.tagName("ul"));
        List<WebElement> departureCities = departureCityLocator.findElements(By.tagName("li"));
        /*
        for (WebElement we : departureCities) {
            System.out.println(we.getText());
        }
        */
        departureCities.get(1).click();

        browser.findElement(By.id("destinationAirportList")).click();  
    
        WebElement destinationCountry = browser.findElement(By.id("destinations-country"));
        WebElement destinationCityLocator = destinationCountry.findElement(By.tagName("ul"));
        List<WebElement> destinationCities = destinationCityLocator.findElements(By.tagName("li"));
        /*
        for (WebElement we : destinationCities) {
            System.out.println(we.getText());
        }
        */
        destinationCities.get(1).click();
        
        browser.findElement(By.id("departure-date-selector")).click();
        
        WebElement departureMonth = browser.findElement(By.tagName("tbody"));
        //System.out.println(departureMonth.getText());
        List<WebElement> departureDate = departureMonth.findElements(By.tagName("a"));
        for (WebElement we : departureDate) {
            System.out.println("~" + we.getText());
            we.click();
            break;
        }
        
        browser.findElement(By.id("return-date-selector")).click();
        Thread.sleep(1000);
        WebElement returnMonth = browser.findElement(By.tagName("tbody"));
        System.out.println("<>" + returnMonth.isEnabled());
        System.out.println(returnMonth.getText());
        List<WebElement> returnDate = returnMonth.findElements(By.tagName("a"));
        for (WebElement we1 : returnDate) {
            System.out.println("~" + we1.getText());
            we1.click();
            break;
        }
        Thread.sleep(1000);
        browser.close();
    }
}
