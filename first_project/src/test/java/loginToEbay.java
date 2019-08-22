import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class loginToEbay extends TestBase {
    @Test
public void loginTest(){
        driver.get("https://ebay.com");

        click(By.id("gh-ug"));
        driver.findElement(By.id("userid")).clear();
        driver.findElement(By.id("userid")).sendKeys("dfgdfvfvgf@.com");


        click(By.id("pass"));
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys("123456789");

        click(By.id("sgnBt"));
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }
}
