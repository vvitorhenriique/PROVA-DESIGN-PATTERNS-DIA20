import java.util.Locale;

public abstract class EmissorPassagem {

    protected abstract Passagem criarPassagem(String passageiro, double tarifa);
 
    public final void emitir(String passageiro, double tarifa) {
        Passagem passagem = criarPassagem(passageiro, tarifa);
        double taxa = passagem.calcularTaxaEmbarque();
        imprimirResumo(passagem, taxa);
    }

    private void imprimirResumo(Passagem passagem, double taxa) {
        System.out.println("=== Resumo da emissão ===");
        System.out.println("Modal: " + passagem.getModal());
        System.out.println("Passageiro: " + passagem.getPassageiro());
        System.out.println(String.format(Locale.forLanguageTag("pt-BR"),
                "Taxa de embarque: R$ %.2f", taxa));
        System.out.println("Documentos exigidos: " + String.join("; ", passagem.getDocumentosExigidos()));
        System.out.println();
    }
}
