/**
 * @author jagdeepjain
 *
 */
package org.example.jagdeep.recipes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HighChartsValidation {
    public static WebDriver browser;
    
    public static void main(String[] args) throws InterruptedException {
        
        browser = new FirefoxDriver();
        browser.get("http://www.highcharts.com/demo/bar-basic");
        browser.manage().window().maximize();
        
        Thread.sleep(4444);
        
        WebElement element = browser
                .findElement(By
                        .cssSelector("#highcharts-0 > svg > g.highcharts-series-group > g.highcharts-series.highcharts-series-2.highcharts-tracker > rect:nth-child(1)"));
        // using actions class to move to the above element
        Actions builder = new Actions(browser);
        builder.moveToElement(element).build().perform();
        
        Thread.sleep(3000);

        String tooltip = browser
                .findElement(
                        By.cssSelector("#highcharts-0 > svg > g.highcharts-axis-labels.highcharts-xaxis-labels > text:nth-child(1)"))
                .getText();
        System.out.println("Tool tip : " + tooltip);
        browser.close();
    }
    
}
