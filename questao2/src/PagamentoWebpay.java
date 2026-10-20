public class PagamentoWebpay implements Pagamento {
    @Override public String descrever(double valor) {
        return String.format("Pago via Webpay de %.0f CLP", valor);
    }
}