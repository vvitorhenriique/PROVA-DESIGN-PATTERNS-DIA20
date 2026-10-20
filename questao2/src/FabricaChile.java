public class FabricaChile implements FabricaPais{

    @Override public DocumentoFiscal criarDocumentoFiscal(){
        return new BoletaElectronica(); 
    }

    @Override public Pagamento criarPagamento(){
        return new PagamentoWebpay(); 
    }

    @Override public Comprovante criarComprovante(){
        return new ComprovanteRut(); 
    }
}
