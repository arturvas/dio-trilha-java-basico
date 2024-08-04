public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = { "Artur", "Lucas", "Sara"};

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("O aluno do índice 'i'=> " + i + " => " + alunos[i]);
        }
    }
}
