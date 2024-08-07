import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scan.next();

        System.out.println("Por favor, digite o número da Conta:");
        int conta = scan.nextInt();

        System.out.println("Por favor, digite seu nome:");
        String nome = scan.next();

        System.out.println("Por favor, digite o saldo da conta:");
        Double saldo = scan.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %s já está disponível para saque", nome, agencia, conta, String.format("%.2f", saldo));
    }
}
