package max.com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HelperBase {
    WebDriver wd;

    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }
    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public void type(By locator, String text) {
        wd.findElement(locator).click();
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void pause(int time) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public boolean isElementPresent(By locator) {
        return wd.findElements(locator).size() >0 ;

    }

    public boolean isElementDisplayed(By locator) {
        return wd.findElement(locator).isDisplayed();
    }
    public void login(String email, String password) {
        click(By.xpath("//a[.=' Log in ']"));
        type(By.id("email"), email);
        type(By.id("password"), password);
        click(By.cssSelector("button[type='submit']"));
        pause(3000);
    }
}
