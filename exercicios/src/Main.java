import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(101);
//                System.out.println(numeroAleatorio);
        int chute = scanner.nextInt();
        int numeroDeTentativas = 0;


        System.out.println("Tente advinhar um número entre 0 e 100");



        if (chute == numeroAleatorio){
            System.out.println("Parabéns, você acertou!");
        }



    }
}