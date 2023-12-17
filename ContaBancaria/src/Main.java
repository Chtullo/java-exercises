import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Kento Nanami";
        String tipoConta = "Corrente";
        double saldo = 50000.56;
        int opcao = 0;

        System.out.println("****************");
        System.out.println("\nNome do cliente " + nome);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo disponível: " + saldo);
        System.out.println("\n****************");

        String menu = """
                ** Digite a opção desejada
                1- Consultar saldo atual
                2- Transferencia de dinheiro
                3- Receber dinheiro
                4- Sair
                
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();
        }
    }
}
