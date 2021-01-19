package cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.ClubPage;

import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class ClubPool extends BaseCase{


    public static ClubPage clubPage;



    /**
     * 关键字查询
     */
    @Test
    public void searchCustomByCode(){
        clubPage=new ClubPage(driver);
        System.out.println("中文");;
        clubPage.clubPool.click();
        wait.sleep(500);
        clubPage.keyWorld.sendKeys("深圳市递四方信息科技有限公司001");
        clubPage.search.click();
        wait.sleep(1000);
        //assertEquals();

    }


    /**
     * 新增线索池
     */
    @Test
    public void addClubPool(){
        clubPage.add.click();
        wait.sleep(500);
        String  listHandle = driver.getWindowHandle();//列表页
        Set<String> handles = driver.getWindowHandles();
        for(String handle : handles){
            if (!handle.equals(listHandle)){
                driver.switchTo().window(handle);
            }
        }
        wait.sleep(2000);
        clubPage.name.sendKeys("test");
        wait.sleep(1000);
//        Select s = new Select(clubPage.country);
//        List<WebElement> lst = s.getOptions();
//        clubPage.country.click();
//        for (WebElement webElement : lst) {
//            System.out.println("获取所有选项的方法依次输出文本值："+webElement.getText());
//        }
//
//        wait.sleep(1000);
//        s.selectByIndex(2);
//        s.selectByValue("258");

        wait.sleep(500);
        clubPage.save.click();
    }

    /**
     * 新增线索池
     */
//    @Test
//    public void addClubPool1(){
//        ClubPage clubPage = new ClubPage(driver);
//        clubPage.add1.click();
//        wait.sleep(500);
//        //wait.waitUtilElementVisibilityByCss("name");
//        clubPage.name.sendKeys("test");
//        Select s = new Select(clubPage.country);
//        s.selectByValue("中国大陆");
//        clubPage.save.click();
//
//    }



}
