package cases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Logout extends BaseCase {

    @Test
    public void afterTest(){
        driver.quit();
    }
}
