package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaSummary {
    WebElement driver;

    @FindBy(xpath = "//*[@id='center_column']/p[2]/a[1]/span")
    WebElement botonCheckOut2;

    public void comprarPaginaSummary(){
        botonCheckOut2.click();
    }

    public PaginaSummary(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
}
