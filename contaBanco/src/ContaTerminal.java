import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o numero da sua conta: ");
        int numero = scanner.nextInt();
        System.out.println("Digite sua agencia: ");
        String agencia = scanner.next();
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        System.out.println("Digite seu Saldo");
        float saldo = scanner.nextFloat();

        System.out.println("Ola "+ nome +", obrigado por criar uma conta no nosso banco, sua agencia é: "+ agencia +", conta: "+ numero +" e seu saldo "+saldo+" já está disponivel para saque!!");
        } 
}
