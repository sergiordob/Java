import java.util.Scanner;
import java.util.Locale;

public class Exercise59
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número de alunos: ");
        int numAlunos = input.nextInt();
        input.nextLine(); // Consumindo o caractere de nova linha

        String nomeMenorNota = "";
        int menorNota = Integer.MAX_VALUE;
        String nomeSegundaMenorNota = "";
        int segundaMenorNota = Integer.MAX_VALUE;

        for (int i = 0; i < numAlunos; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            String nome = input.nextLine();

            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            int nota = input.nextInt();
            input.nextLine(); // Consumindo o caractere de nova linha

            if (nota < menorNota)
            {
                segundaMenorNota = menorNota;
                nomeSegundaMenorNota = nomeMenorNota;
                menorNota = nota;
                nomeMenorNota = nome;
            }
            else if (nota < segundaMenorNota)
            {
                segundaMenorNota = nota;
                nomeSegundaMenorNota = nome;
            }
        }

        System.out.println("\nAluno com a menor nota:");
        System.out.println("Nome: " + nomeMenorNota);
        System.out.println("Nota: " + menorNota);

        System.out.println("\nAluno com a segunda menor nota:");
        System.out.println("Nome: " + nomeSegundaMenorNota);
        System.out.println("Nota: " + segundaMenorNota);

        input.close();
    }
}
