public class Main {
    public static void main(String[] args) {

        new Matricula("Mariana Alves", "123.456.789-09", 500.00, new FabricaBrasil()).confirmar();
        new Matricula("Pablito Chileno", "12.345.678-5", 90000, new FabricaChile()).confirmar();
    }
}
