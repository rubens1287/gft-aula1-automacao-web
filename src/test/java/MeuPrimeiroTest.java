import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MeuPrimeiroTest {

    ChromeDriver driver;
    WebDriverWait wait;

    @Before
    public void init(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver,10);
    }

    @After
    public void tearDown(){
        driver.close();
    }

    @Test
    public void Login() throws InterruptedException {
        driver.get("https://seubarriga.wcaquino.me/login");
        driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("email")).sendKeys("teste123@teste.com.br");
        driver.findElement(By.id("senha")).sendKeys("1234");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button")).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'Bem vindo')]")));
    }


}
