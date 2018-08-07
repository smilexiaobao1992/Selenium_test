import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * @author : xujunbao
 * @ClassName PACKAGE_NAME
 * @description
 * @Create Date : 2018/7/25
 */

public class SeleniumTest {

    public static void main(String[] args) throws Exception{

        System.setProperty("webdriver.chrome.driver","/Users/xujunbao/Documents/office file/chromedriver");
        //创建chrome对象
        WebDriver webDriver=new ChromeDriver();
        //打开网站
        webDriver.navigate().to("http://t.268xue.com");

        WebElement webElement=webDriver.findElement(By.id("searchInput"));

        webElement.sendKeys("电大民法课程");


        Thread.sleep(3000);

        webDriver.navigate().to("http://t.268xue.com/login");

        webDriver.findElement(By.id("userEmail")).sendKeys("demo@test.com");
        webDriver.findElement(By.id("userPassword")).sendKeys("111111");


        webDriver.findElement(By.cssSelector(".rl-login-btn a")).click();

        Thread.sleep(3000);



        //webElement.submit();


        //webDriver.quit();
    }
}
