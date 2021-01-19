package cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class test extends BaseCase{

    @Test
    public void test(){
        WebElement pool =  driver.findElement(By.xpath("//*ul[@class='menu']//li[1]"));
        pool.click();
    }
}
