package cases;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import util.Wait;

import static org.junit.Assert.assertEquals;

public class Login extends BaseCase{



    @Test
    public void logintest() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://crm.uat.i4px.com");
        LoginPage loginPage = new LoginPage(driver);
        Wait wait = new Wait(driver);
        wait.waitUtilElementToBeClickable(loginPage.changeLoginType);
        loginPage.changeLoginType.click();
        loginPage.username.sendKeys("S9586");
        loginPage.password.sendKeys("^YHN7ujm");
        loginPage.signbtn.click();
        wait.sleep(5000);
        assertEquals(driver.getTitle(),"客户关系管理");

        BaseCase.driver = driver;
        BaseCase.wait = wait;

    }


}
