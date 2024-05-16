import java.util.Scanner;

public class ContaTerminal {

    int numero = 1021;
    String agencia = "067-8";
    String nomeCliente = "ALISSON SILVA";
    double saldo = 237.48;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaTerminal conta = new ContaTerminal();

        System.out.println("Por favor, digite o número da Agência:");
        conta.agencia = scanner.nextLine();

        /* System.out.println("Agora, digite o número da Conta:");
        conta.numero = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.println("Por favor, digite o nome do Cliente:");
        conta.nomeCliente = scanner.nextLine();

        System.out.println("Por fim, digite o saldo da Conta:");
        conta.saldo = scanner.nextDouble(); */

        System.out.println("Olá " + conta.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + conta.agencia + ", conta " + conta.numero + " e seu saldo " + conta.saldo
                + " já está disponível para saque.");

        scanner.close();
    }
}
