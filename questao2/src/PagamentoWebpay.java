import java.util.Locale;

public class PagamentoWebpay implements Pagamento {
    @Override public String descrever(double valor) {
        return String.format(Locale.forLanguageTag("es-CL"), "Pago vía Webpay de %.0f CLP", valor);
    }
}
