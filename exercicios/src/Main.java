import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tente advinhar um número entre 0 e 100");


        int numeroAleatorio = new Random().nextInt(101);
        int numeroDeTentativas = 5;
        for (int tentativa = 1; tentativa <= numeroDeTentativas; tentativa ++){
            System.out.println("Tentativa " + tentativa + ":");
            int chute = scanner.nextInt();

        if (chute == numeroAleatorio) {
            System.out.println("Parabéns, você acertou!");
            break;
        } else if (chute < numeroAleatorio) {
            System.out.println("O número secreto é maior que " + chute);
        } else {
            System.out.println("O número secreto é menor que " + chute);
        }

        if (tentativa == numeroDeTentativas) {
            System.out.println("Suas tentativas acabaram! O número secreto era: " + numeroAleatorio);
        }
    }
   }
}