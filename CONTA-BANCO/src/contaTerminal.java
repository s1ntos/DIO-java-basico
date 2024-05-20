import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
 
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da Agência:");
        numero = scanner.nextInt();
        scanner.nextLine();  // Consumir a nova linha deixada pelo nextInt()
        
        System.out.println("Por favor, digite o nome da agência:");
        agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o nome do cliente:");
        nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o saldo:");
        saldo = scanner.nextDouble();
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nossa agência " + agencia + " com o número " + numero + ". Seu saldo atual é " + saldo + " e já está disponível para saque.");
 
        scanner.close();
    }
}
