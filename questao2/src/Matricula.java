public class Matricula {
    private final String nomeAluno;
    private final String documentoAluno;
    private final double valor;
    private final DocumentoFiscal documentoFiscal;
    private final Pagamento pagamento;
    private final Comprovante comprovante;

    public Matricula(String nomeAluno, String documentoAluno, double valor, FabricaPais fabrica) {
        this.nomeAluno = nomeAluno;
        this.documentoAluno = documentoAluno;
        this.valor = valor;
        this.documentoFiscal = fabrica.criarDocumentoFiscal();
        this.pagamento = fabrica.criarPagamento();
        this.comprovante = fabrica.criarComprovante();
    }

    public void confirmar(){
        System.out.println("---Matricula confirmada---");
        System.out.println("Documento fiscal: " + documentoFiscal.descrever(valor));
        System.out.println("Pagamento: " + pagamento.descrever(valor));
        System.out.println(comprovante.descrever(nomeAluno, documentoAluno));
        System.out.println();
    }
}
