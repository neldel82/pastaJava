import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double mediaAluno, mediaTurma, mediaGeral;
        final int ALUNOS = 2; // variavel constante com 5 posicoes;
        final int TURMAS = 5; // variavel constante com 20 posicoes;

        mediaGeral = 0;

        for (int turma = 1; turma <= TURMAS; turma++) { // variavel local: turma

            System.out.println("Dados da turma " + turma);
            mediaTurma = 0;

            for (int aluno = 1; aluno <= ALUNOS; aluno++) { // variavel local: aluno
                System.out.println("Entre com a media do Aluno: " + aluno);
                mediaAluno = entrada.nextInt();
                mediaTurma = mediaTurma + mediaAluno;
            }
            mediaTurma = mediaTurma / ALUNOS;
            mediaGeral = mediaGeral / mediaTurma;
            System.out.printf("A media da turma %d é %.2f\n", turma, mediaTurma);
        }
        mediaGeral = mediaGeral / TURMAS;
        System.out.printf("A media das turmas é %.2f\n", mediaGeral);

        entrada.close();

    }

}
