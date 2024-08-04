import java.util.Arrays;

public class ExemploForEach {
    public static void main(String[] args) {
        String alunos[] = { "Artur", "Lucas", "Sara"};

        for (String aluno : alunos) {
            System.out.println("Nome do aluno é " + aluno);
        }
    }
}
