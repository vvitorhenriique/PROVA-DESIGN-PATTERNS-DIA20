public class PagamentoPix implements Pagamento {
    @Override public String descrever(double valor) {
        return String.format("Pagamento via Pix de R$ %.2f", valor);
    }
}