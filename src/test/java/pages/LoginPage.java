package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.bind.Element;

public class LoginPage  {

    public LoginPage(WebDriver driver){

        PageFactory.initElements(driver,this);
    }

    /*
    * 用户名
    */
    @FindBy(name = "username")
    public WebElement username;

    /*
     * 密码
     */
    @FindBy(id = "passwordOrg")
    public WebElement password;

    /*
     * 登录按钮
     */
    @FindBy(id = "signbtn")
    public WebElement signbtn;

    /*
     * 切换为账号登录
     */
    @FindBy(id = "login-type-i")
    public WebElement changeLoginType;

}
