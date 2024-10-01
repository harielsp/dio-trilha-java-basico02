import java.util.Scanner;

public class ContaTerminal  {
    public static void main(String[] args) throws Exception {
        System.out.println("Pfv, digite o numero da agencia");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pfv, digite o numero da agencia");
        String agencia=scanner.next();

        System.out.println("Digite o numero da conta");
        int numero=scanner.nextInt();

        System.out.println("Seu nome");
        String nomeCliente=scanner.next();

        System.out.println("Seu saldo");
        double saldo=scanner.nextDouble();

        System.out.println("Ola "+nomeCliente+", obrigado por cirar uma conta em nosso banco, sua agencia é " +agencia+", conta "+numero+" e seu saldo "+saldo +" 0ja está disponivel para saque");
        
        scanner.close();
    }
}
