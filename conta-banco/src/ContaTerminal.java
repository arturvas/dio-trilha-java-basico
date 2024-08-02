import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero = 1021;
        String agencia = "067-8";
        String nomeDoCliente = "Artur Vasconcelos";
        float saldo = 237.57F;

        System.out.println("## Olá! Bem vindo ao Banco! Vamos criar sua conta. ##");
        System.out.println("Por favor, insira o numero da sua agencia: ");
        agencia = scanner.nextLine();

        System.out.println("Ótimo. Agora sua conta: ");
        numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Certo. Seu nome agora: ");
        nomeDoCliente = scanner.nextLine();

        System.out.println("Olá " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");



    }
}
