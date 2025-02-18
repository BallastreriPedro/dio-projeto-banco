import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o Numero da Conta: ");
        int numero = scanner.nextInt();

        System.out.print("Digite o Numero da Agencia: ");
        String agencia = scanner.next();

        System.out.print("Digite o Nome do Cliente: ");
        String cliente = scanner.next();

        System.out.print("Digite o Saldo da Conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + cliente + ", Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + ", e seu saldo " + saldo + " já está disponível para saque");

        
    }
}
