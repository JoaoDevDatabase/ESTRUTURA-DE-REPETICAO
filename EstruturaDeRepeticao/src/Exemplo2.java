public class Exemplo2 {
    public static void main(String[] args) {
        // Isto aqui e um exemplo de repetição usando ( for em arrays );
        String professor[] = { "JOÃO", "LARYSSA", "MARIA FERNANDA", "MILTON", "LEILA" };

        for (int x = 0; x < professor.length; x++) {
            System.out.println(" OLÁ " + professor[x]);
        }

        String alunos[] = { "THIAGO", "LARYSSA", "CEMILLA", "LEILA", "MILTON" };

        for (int a = 0; a < alunos.length; a++) {
            System.out.println(" O(A) PROFESSOR(A) " + professor[a] + " E O ALUNO " + alunos[a]);
        }

    }
}
