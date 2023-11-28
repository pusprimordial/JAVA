package estruturasDeControle;
import java.util.Scanner;

public class DesafioDoWhile{
    public static void main(String[] args) {
        int nota;
        int total = 0;
        char escolher;

        Scanner entrada = new Scanner(System.in);

        do {
            System.out.print("Digite a nota do aluno: ");
            nota = entrada.nextInt();

            total = total + nota;
            System.out.println("Digite Y ou N para digitar mais uma nota: ");
            escolher = entrada.next().charAt(0);
        } while ((escolher == 'y') || (escolher == 'Y'));

        System.out.println("Soma do total das notas: " + total);

        entrada.close();
    }
}
