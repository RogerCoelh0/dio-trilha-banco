
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor digite o número da sua Conta: ");
        String conta = scanner.next();

        System.out.println("Por favor Digite sua Agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Por Favor digite o valor do primeiro depósito: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+nome+ " Bem vindo ao Banco TO DURO, sua agência é "+agencia+", conta "+conta+" e seu primeiro depósito foi de R$ 31" +saldo+"");
    }
}
