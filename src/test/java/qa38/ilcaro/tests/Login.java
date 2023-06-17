package qa38.ilcaro.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Login extends TestBase {
    @Test
    public void positiveLogInTest() throws InterruptedException {

        click(By.xpath("//a[text()=' Log in ']"));
        type(By.xpath("//input[@id='email']"),"maxmayzel@gmail.com");
        type(By.id("password"), "Rfrnec7_*");
        click(By.xpath("//button[@type='submit']"));
        pause(3000);
        Assert.assertTrue(isElementDisplaed(By.xpath("//div[@class='dialog-container']//h2")));
        // wd.findElement(By.xpath("//a[text()=' Log in ']")).click();
//        wd.findElement(By.xpath("//input[@id='email']")).click();
//        wd.findElement(By.xpath("//input[@id='email']")).clear();
//        wd.findElement(By.xpath("//input[@id='email']")).sendKeys("maxmayzel@gmail.com");

//        wd.findElement(By.id("password")).click();
//        wd.findElement(By.id("password")).clear();
//        wd.findElement(By.id("password")).sendKeys("Rfrnec7_*");

     //   wd.findElement(By.xpath("//button[@type='submit']")).click();
    }
    @Test
    public void negativeLoginTest(){
        click(By.xpath("//a[text()=' Log in ']"));
        type(By.xpath("//input[@id='email']"),"maxmayzel@gmail.com");
        type(By.id("password"), "Rfrnec7_");
        click(By.xpath("//button[@type='submit']"));
        pause(3000);
        Assert.assertTrue(isElementDisplaed(By.xpath("//h2[normalize-space()='\"Login or Password incorrect\"']")));
    }

}
