package Test;
import PageObjects.*;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

public class Base {
     WebDriver driverDeChrome;

     PaginaPrincipal paginaPrincipal;
     PaginaSignIn paginaSignIn;
     PaginaTshirts paginaTshirts;
     PaginaSummary paginaSummary;
     PaginaAddresses paginaAddresses;
     PaginaShipping paginaShipping;
     PaginaPayment paginaPayment;
     PaginaOrderSummary paginaOrderSummary;
     PaginaOrderConfirmation paginaOrderConfirmation;
     private void inicializarPaginas(){
          paginaPrincipal = new PaginaPrincipal(driverDeChrome);
          paginaSignIn = new PaginaSignIn(driverDeChrome);
          paginaTshirts = new PaginaTshirts(driverDeChrome);
          paginaSummary = new PaginaSummary(driverDeChrome);
          paginaAddresses = new PaginaAddresses(driverDeChrome);
          paginaShipping = new PaginaShipping(driverDeChrome);
          paginaPayment = new PaginaPayment(driverDeChrome);
          paginaOrderSummary = new PaginaOrderSummary(driverDeChrome);
          paginaOrderConfirmation = new PaginaOrderConfirmation(driverDeChrome);
     }

     @Before
     public void abrirNavegadorChrome() {
          System.setProperty("webDriver.chrome.driver", ".src/main/resources/chromedriver.exe");
          ChromeOptions options = new ChromeOptions();
          options.setCapability("marionete", false);
          driverDeChrome = new ChromeDriver(options);
          driverDeChrome.manage().window().maximize();
          driverDeChrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
          inicializarPaginas();
          driverDeChrome.get("http://automationpractice.com/index.php");
     }
}
