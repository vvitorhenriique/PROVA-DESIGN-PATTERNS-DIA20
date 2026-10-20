public class ComprovanteCpf implements Comprovante {
    @Override public String descrever(String nomeAluno, String documentoAluno) {
        return "Comprovante de matricula - Aluno: " + nomeAluno + " (CPF: " + documentoAluno + ")";
    }
}
