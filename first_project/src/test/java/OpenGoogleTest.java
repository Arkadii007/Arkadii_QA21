import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class OpenGoogleTest extends TestBase
{

    @Test
    public void clicklmFillingLucky(){
         new Actions(driver)
                 .moveToElement(driver.findElement(By.name("btnl"))).pause(2).click().perform();


    }




    @Test
    public void searchJavaTest() throws IllegalAccessException, InterruptedException {
        driver.get("https://www.google.com");
           type(By.name("q"), "говорите по русски"+ Keys.ENTER);

            Thread.sleep(7000);
        }

////@Test
   //// public void clicklmFillingLucky(){

}

