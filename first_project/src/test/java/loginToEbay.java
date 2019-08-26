import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class loginToEbay extends TestBase {
    @Test
public void loginTest(){
        driver.get(url());
////init login
        initLogin();
//fill form
        fillLoginForm("dfgdfvfvgf@jik.com", "123456789");

        clickLoginButton();
    }


}
