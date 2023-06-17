package max.com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ApplicationManager {

    WebDriver wd;
    UserHelper userHelper;


    public void init(){

        wd = new ChromeDriver();
        wd.navigate().to("https://ilcarro.web.app/");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        userHelper = new UserHelper(wd);

    }
    public void stop(){

        wd.quit();
    }

    public UserHelper getUserHelper() {
        return userHelper;
    }
}
