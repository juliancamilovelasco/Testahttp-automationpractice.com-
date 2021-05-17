package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaOrderConfirmation {
    WebElement driver;

    @FindBy(xpath = "//*[@id='center_column']/p[1]")
    WebElement bannerOrdenCompleta;

    public boolean resultadoDeOrden(String mensaje){
        System.out.println(mensaje);
        System.out.println(bannerOrdenCompleta.getText());
        return mensaje.equals(bannerOrdenCompleta.getText());
    }

    public PaginaOrderConfirmation(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
}

