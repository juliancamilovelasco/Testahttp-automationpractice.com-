package PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaTshirts {
    WebDriver driver;

    @FindBy(xpath = ("//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img"))
    WebElement fadedShortSleeve;

    @FindBy(xpath = "//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]/span")
    WebElement botonAgregarACarrito;

    @FindBy(xpath = "//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")
    WebElement botonCheckOut;

    public void comprarFadedShortSleeve(){
        Actions action = new Actions(this.driver);
        action.moveToElement(fadedShortSleeve).moveToElement(botonAgregarACarrito).click().build().perform();
        botonCheckOut.click();
    }

    public PaginaTshirts(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
}
