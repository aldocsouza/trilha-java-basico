import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        int numeroAgencia;
        String agencia, nomeCliente;
        double saldo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência !");
        numeroAgencia = sc.nextInt();

        System.out.println("Digite o nome da Agência!");
        agencia = sc.next();

        System.out.println("Digite o nome do cliente!");
        nomeCliente = sc.next();

        System.out.println("Por ultimo, digite o saldo da conta!");
        saldo = sc.nextDouble();


        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque\n", nomeCliente, agencia, numeroAgencia, saldo);

        sc.close();
    }
}