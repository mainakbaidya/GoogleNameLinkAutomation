package gogglenamelink;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TestCases {
    public void endTest(WebDriver driver)
    {
        System.out.println("End Test: TestCases");
       
        driver.quit();

    }

    
    public  void testCase01(WebDriver driver){

        try {

        System.out.println("Start Test case: testCase01");

        //navigate website
        driver.get("http://google.com/");

        //enter Name
        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Mainak Baidya");
        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.ENTER).perform();
        Thread.sleep(2000);

        //Store all links in list
        List<WebElement> elements = new ArrayList<>();
        elements = driver.findElements(By.tagName("a"));
        Thread.sleep(2000);

        //Print count of link
        System.out.println("Count of links in the search result with my name in it : "+elements.size());
        System.out.println("End Test case: testCase01");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    
}
