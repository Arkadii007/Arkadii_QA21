import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver driver;

    @BeforeMethod
   public void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.google.com");


    }

    @AfterMethod
    public  void tearDown(){
        driver.quit();

}
    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public String url() {
        return "https://ebay.com";
    }

    public void clickLoginButton() {
        click(By.id("sgnBt"));
    }

    public void fillLoginForm(String email, String passwrd) {
        type(By.id("userid"), email);
        type(By.id("pass"), passwrd);
    }

    public void initLogin() {
        click(By.id("gh-ug"));
    }
}
