package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaPayment {
    WebElement driver;

    @FindBy(xpath = "//*[@id='HOOK_PAYMENT']/div[2]/div/p/a")
    WebElement botonCheque;

    public void seleccionarCheque(){
        botonCheque.click();
    }

    public PaginaPayment(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
}
