package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaAddresses{
    WebElement driver;

    @FindBy(xpath = "//*[@id='center_column']/form/p/button/span")
    WebElement botonCheckOutAddresses;

    public void comprarPaginaAddresses(){
        botonCheckOutAddresses.click();
    }

    public PaginaAddresses(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
}
