public class ComprovanteRut implements Comprovante {
    @Override public String descrever(String nomeAluno, String documentoAluno) {
        return "Comprovante de matricula - Aluno: " + nomeAluno + " (RUT: " + documentoAluno + ")";
    }
}
