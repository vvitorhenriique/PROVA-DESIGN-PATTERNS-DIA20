public class Main {
    public static void main(String[] args) {
        EmissorPassagem aereo = new EmissorAereo();
        EmissorPassagem rodoviario = new EmissorRodoviario();
        EmissorPassagem ferroviario = new EmissorFerroviario();
 
        aereo.emitir("Ana souza", 1200.00);  
        rodoviario.emitir("Bruno lima", 150.00);
        ferroviario.emitir("Carla dias", 400.00);
    }
}
