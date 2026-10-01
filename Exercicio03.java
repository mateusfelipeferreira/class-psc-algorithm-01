import java.util.Scanner;
public class Main {
public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos exercícios Riley conseguiu fazer? ");
        int exerciciosFeitos = scanner.nextInt();

        int exerciciosNaoFeitos = 10 - exerciciosFeitos;

        int alegria = exerciciosFeitos * 10;
        int tristeza = exerciciosNaoFeitos * 10;

        if (alegria > tristeza) {
            System.out.println("A mudança para a nova cidade foi uma experiência incrível para a Riley.");
        } else {
            System.out.println("A mudança para a nova cidade foi uma experiência desagradável para a Riley.");
        }

        scanner.close();
    }
}
