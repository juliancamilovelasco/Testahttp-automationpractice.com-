package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaShipping {
    WebElement driver;

    @FindBy(xpath = "//*[@id='form']/div/p[2]/label")
    WebElement aceptarCondiciones;

    @FindBy(xpath = "//*[@id='form']/p/button/span")
    WebElement botonCheckOutShipping;

    public void aceptarBoxCondiciones(){
        aceptarCondiciones.click();
    }

    public void botonCheckOutShipping(){
        botonCheckOutShipping.click();
    }

    public PaginaShipping(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
}
