import java.util.Locale;

public class PagamentoPix implements Pagamento {
    @Override public String descrever(double valor) {
        return String.format(Locale.forLanguageTag("pt-BR"), "Pagamento via Pix de R$ %.2f", valor);
    }
}
