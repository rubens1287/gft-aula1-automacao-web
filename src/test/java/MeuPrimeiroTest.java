import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class MeuPrimeiroTest extends BaseTest {


    private Index index = new Index();

    @Test
    public void Comprar() throws InterruptedException {
        index.acessarAplicacao();
        Assert.assertTrue(index.isLoginPagePresent());
        index.selecionarProduto("Blouse");
        Thread.sleep(3000);
    }

}
