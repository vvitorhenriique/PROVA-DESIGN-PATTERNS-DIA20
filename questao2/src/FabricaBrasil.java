public class FabricaBrasil implements FabricaPais{

    @Override public DocumentoFiscal criarDocumentoFiscal(){ 
        return new NfSe(); 
    }

    @Override public Pagamento criarPagamento() { 
        return new PagamentoPix(); 
    }


    @Override public Comprovante criarComprovante(){ 
        return new ComprovanteCpf(); 
    }
}
