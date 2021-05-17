package Test;
import org.junit.Assert;
import org.junit.Test;

public class NewExperience extends Base{

    @Test
    public void testGooglePage() {
        paginaPrincipal.irAPaginaSingIn();
        paginaSignIn.identificarse("juliancamilovelasco@gmail.com","julian");
        paginaPrincipal.irAPaginaTshirts();
        paginaTshirts.comprarFadedShortSleeve();
        paginaSummary.comprarPaginaSummary();
        paginaAddresses.comprarPaginaAddresses();
        paginaShipping.aceptarBoxCondiciones();
        paginaShipping.botonCheckOutShipping();
        paginaPayment.seleccionarCheque();
        paginaOrderSummary.confirmOrder();
        Assert.assertTrue(paginaOrderConfirmation.resultadoDeOrden("Your order on My Store is complete."));
    }

}








