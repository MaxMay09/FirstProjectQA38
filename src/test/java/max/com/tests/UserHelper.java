package max.com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends HelperBase {

    public UserHelper(WebDriver wd) {
        super(wd);
    }

    public void clickLogIn() {
        click(By.xpath("//a[.=' Log in ']"));
    }

    public void fillLoginForm(String email, String password) {
        type(By.id("email"), email);
        type(By.id("password"), password);

    }

    public void clickSubmitButton() {
        click(By.cssSelector("button[type='submit']"));
    }

    public void clickLogOut() {
        click(By.xpath("//div[@class='header']//a[5]"));
    }
}
