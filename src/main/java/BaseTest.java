import lombok.Getter;
import lombok.Setter;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class BaseTest implements DefaultProperties{

    @Getter @Setter
    private static ChromeDriver driver;
    @Getter @Setter
    private static WebDriverWait wait;

    @Before
    public void Init() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wait = new WebDriverWait(getDriver(),TIME_OUT);
    }

    @After
    public void TearDown() {
        driver.quit();
    }
}
