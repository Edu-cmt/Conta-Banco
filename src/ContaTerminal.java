import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o seu nome: ");
        nomeCliente = input.nextLine();

        System.out.print("Digite o numero da sua agencia: ");
        agencia = input.nextLine();
        
        System.out.print("Digite o numero da sua conta: ");
        numero = input.nextInt();
        saldo = 1400.00;

        System.out.println("Olá ".concat(nomeCliente).concat(", obrigado por criar uma conta em nosso banco. Sua agência é ").concat(agencia).concat(", conta ") + numero + " e seu saldo, de " + saldo +
        " reais, já está disponível para saque.");

    
        input.close();
    }
}
