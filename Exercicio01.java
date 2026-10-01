import java.util.Scanner;
public class Exercicio01 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amizades;
        int pontosAlegria = 0;
        int pontosTristeza = 0;

        System.out.print("Quantas novas amizades Riley fez na cidade? ");
        amizades = scanner.nextInt();

        if (amizades > 0) {
            pontosAlegria = amizades * 10;

            System.out.println("Riley fez " + amizades + " nova(s) amizade(s).");
            System.out.println("A emoção Alegria recebeu " + pontosAlegria + " pontos.");
        } else {
            pontosTristeza = 30;

            System.out.println("Riley não fez nenhuma amizade.");
            System.out.println("A emoção Tristeza recebeu " + pontosTristeza + " pontos.");
        }

        scanner.close();
    }
}
