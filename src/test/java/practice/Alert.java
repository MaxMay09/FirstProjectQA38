package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;


public class Alert {
    WebDriver wd;

    @Test

    public void alertTest() throws InterruptedException {
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
        wd.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(6000);
        WebDriverWait wait = new WebDriverWait(wd, Duration.ofSeconds(30));
        org.openqa.selenium.Alert alert = wait.until(alertIsPresent());
        alert.accept();
        Thread.sleep(6000);



    }
}
