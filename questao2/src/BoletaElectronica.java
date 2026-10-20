import java.util.Locale;

public class BoletaElectronica implements DocumentoFiscal {
    private static final double IVA = 0.19;
    
    @Override public String descrever(double valor) {
        return String.format(Locale.forLanguageTag("es-CL"),
                "Boleta electrónica con IVA de 19%% (%.0f sobre %.0f CLP)", valor * IVA, valor);
    }
}
