package pages;

import cases.BaseCase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClubPage extends BaseCase {

    public ClubPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    /**
     * 线索池菜单
     */
    @FindBy(xpath = "//ul[@class='menu']//li[1]")
    public WebElement clubPool;
    //"//*ul[@class='menu']//li[1]")

    /**
     * 关键字
     */
    @FindBy(css = "div.input-group:nth-child(1) > input:nth-child(1)")
    public WebElement keyWorld;


    /**
     * 关键字
     */
    @FindBy(css = "#search-btn > i:nth-child(1)")
    public WebElement search;


    /**
     * 新增
     */
    @FindBy(linkText="新增")
    public WebElement add;

    @FindBy(xpath="//btn-group[@class='btn-group']/a[@id='clue-add-btn']")
    public WebElement add1;

    /**
     * 客户名称
     */
    @FindBy(name="name")
    public WebElement name;


    /**
     * 经济主体
     */
    @FindBy(id="enitity")
    public WebElement enitity;


    /**
     * 地址
     */
    @FindBy(id="select_country")
    public WebElement country;

    /**
     * 保存
     */
    @FindBy(id="btn-save-baseinfo")
    public WebElement save;





}
