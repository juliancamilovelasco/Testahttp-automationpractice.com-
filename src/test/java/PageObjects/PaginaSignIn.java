package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaSignIn {

    @FindBy(xpath = ("//*[@id='email']"))
    WebElement campoEmail;

    @FindBy(xpath =("//*[@id='passwd']"))
    WebElement campoPassword;

    @FindBy(xpath = "//*[@id='SubmitLogin']/span")
    WebElement botonSignIn;

    private void llenarCampoEmail(String email){
        campoEmail.sendKeys(email);
    }

    private void llenarCampoPassword(String password){
        campoPassword.sendKeys(password);
    }

    private void hacerclickSingIn(){
        botonSignIn.click();
    }

    public void identificarse(String email, String password){
        llenarCampoEmail(email);
        llenarCampoPassword(password);
        hacerclickSingIn();
    }

    public PaginaSignIn(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
