import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Index extends BaseTest implements DefaultProperties{

    private By btnProduto = By.xpath("//a[@data-id-product='2']");
    private By btnProceedToCheckout = By.xpath("//a[@title='Proceed to checkout']");
    private By btnAddCart = By.name("Submit");

    public void acessarAplicacao(){
        getDriver().get(URL_BASE);
    }

    public boolean isLoginPagePresent(){
        WebElement element = getWait().until(ExpectedConditions.elementToBeClickable(btnProduto));
        return element.isEnabled();
    }

    public void selecionarProduto(String produto){
        getDriver().findElement(By.xpath("//div[@class='product-container']//a[@class='product-name' and @title='"
                +produto.trim()+"']")).click();
        getWait().until(ExpectedConditions.elementToBeClickable(btnAddCart));
        getDriver().findElement(btnAddCart).click();
        getWait().until(ExpectedConditions.elementToBeClickable(btnProceedToCheckout));
        getDriver().findElement(btnProceedToCheckout).click();
    }

}
