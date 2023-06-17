package max.com.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login extends TestBase {
    @BeforeMethod
    public void preCondition(){
        if(!app.getUserHelper().isElementDisplayed(By.xpath("//a[.=' Log in ']"))){
            app.getUserHelper().clickLogOut();

        }
    }

    @Test
    public void positiveLoginTest() {
        //clickLogIn
        // wd.findElement(By.id("")).click();
        app.getUserHelper().clickLogIn();
        app.getUserHelper().fillLoginForm("maxmayzel@gmail.com", "Rfrnec7_*");
        app.getUserHelper().clickSubmitButton();
        app.getUserHelper().pause(3000);
        Assert.assertTrue(app.getUserHelper().isElementPresent(By.xpath("//div[@class='dialog-container']")));

    }



    @Test
    public void loginNegativeTest() {
        app.getUserHelper().login("maxmayzel@gmai.com", "Rfrnec7_*");
        Assert.assertTrue(app.getUserHelper().isElementPresent(By.xpath("//a[.=' Log in ']")));
    }



}
