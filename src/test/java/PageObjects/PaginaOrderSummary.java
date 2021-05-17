package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaOrderSummary {
    WebElement driver;

    @FindBy(xpath = "//*[@id='cart_navigation']/button/span")
    WebElement botonConfirmOrder;

    public void confirmOrder(){
        botonConfirmOrder.click();
    }

    public PaginaOrderSummary(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
}
