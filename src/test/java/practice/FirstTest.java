package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class FirstTest {
    WebDriver wd;
    String browser = "Chrome";

    @Test
    public void searchWebDriverTest() {
        if (browser.equals("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            wd = new FirefoxDriver();
        }
        if (browser.equals("Chrome")) {
            // WebDriverManager.chromedriver().setup();
            wd = new ChromeDriver();
        }
        if (browser.equals("Edge")) {
            WebDriverManager.edgedriver().setup();
            wd = new EdgeDriver();
        }
//        wd.manage().window().maximize();
//        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        wd.navigate().to("https://www.google.com");
//        wd.findElement(By.id("APjFqb")).sendKeys("Webdriver"+ Keys.ENTER);
//        System.out.println(wd.getCurrentUrl());
//        wd.navigate().to("https://www.saucedemo.com/");
//        wd.findElement(By.name("user-name")).sendKeys("standard_user");
//        wd.findElement(By.name("password")).sendKeys("secret_sauce");
//        wd.findElement(By.id("login-button")).click();
//        System.out.println(wd.findElements(By.xpath("//*[@class='inventory_item']")).size());
        wd.navigate().to("https://ilcarro.web.app/");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       // System.out.println(wd.findElements(By.xpath("//*[@class='navigation-link']")).size());
        List<WebElement> list = wd.findElements(By.xpath("//*[@class='navigation-link']"));
        System.out.println(list.get(3).getText());
        System.out.println(list.get(2).getText());
        for(WebElement el:list){
            System.out.println(el.getText());
        }
//        //int i = wd.findElements(By.xpath("//*[@class='navigation-link']")).size();
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i).getText());
//        }
//           int i = 0;
//        while (i < list.size()) {
//            System.out.println(list.get(i).getText());
//            i++;
//        }
//

    }
}