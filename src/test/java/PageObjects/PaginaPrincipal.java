package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaPrincipal {
    @FindBy(xpath = ("//*[@id='header']/div[2]/div/div/nav/div[1]/a"))
    WebElement botonSignIn;

    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[3]/a")
    WebElement etiquetaTshirts;

    public void irAPaginaTshirts(){
        etiquetaTshirts.click();
    }

    public void irAPaginaSingIn(){
        botonSignIn.click();
    }

    public PaginaPrincipal(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
}
