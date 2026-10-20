import java.util.Locale;
 
public class NfSe implements DocumentoFiscal {
    private static final double ISS = 0.05;
    @Override public String descrever(double valor) {
        return String.format(Locale.forLanguageTag("pt-BR"),
                "NFS-e com ISS de 5%% (R$ %.2f sobre R$ %.2f)", valor * ISS, valor);
    }
}
