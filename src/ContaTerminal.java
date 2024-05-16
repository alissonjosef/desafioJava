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
        String agenciaDigitada = scanner.nextLine();

        if (agenciaDigitada.equals(conta.agencia)) {
            System.out.println("Agência encontrada.");
        } else {
            System.out.println("Agência não encontrada.");
        }


        System.out.println("Olá " + conta.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + conta.agencia + ", conta " + conta.numero + " e seu saldo " + conta.saldo
                + " já está disponível para saque.");

        scanner.close();
    }
}
