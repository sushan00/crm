package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
    private WebDriver driver;

    public Wait(WebDriver driver){
        this.driver = driver;
    }


    public void sleep(long sleepTime){
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 通过css定位判断元素是否存在，且在页面上可见
     * @param cssLocator
     */
    public void waitUtilElementVisibilityByCss(String cssLocator){
        new WebDriverWait(driver,10)
                .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(cssLocator)));
    }

    /**
     * 通过css定位判断元素是否存在，且在页面上可见
     * @param id
     */
    public void waitUtilElementVisibilityById(String id){
        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
    }

    /**
     * 通过css定位判断元素是否存在，且在页面上可见
     * @param element
     */
    public void waitUtilElementToBeClickable(WebElement element){
        new WebDriverWait(driver,10)
                .until(ExpectedConditions.elementToBeClickable(element));
    }

}
