import java.util.Scanner;
public class RileyProvas {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a1;
        double a2;
        double a3;
        double media;

        System.out.print("Digite a nota da prova A1: ");
        a1 = scanner.nextDouble();

        System.out.print("Digite a nota da prova A2: ");
        a2 = scanner.nextDouble();

        System.out.print("Digite a nota da prova A3: ");
        a3 = scanner.nextDouble();

        media = (a1 + a2 + a3) / 3;

        System.out.println("Média da Riley: " + media);

        if (media >= 7) {
            System.out.println("Riley está aprovada!");
            System.out.println("A emoção Alegria recebe 50 pontos.");
        } else {
            System.out.println("Riley não alcançou a média necessária.");
            System.out.println("A emoção Tristeza recebe 50 pontos.");
        }

        scanner.close();
    }
}
