public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Bem-vindo ao Bytebank!");
        System.out.println("Por favor, digite o seu nome: ");
        String nomeCliente = new java.util.Scanner(System.in).nextLine();
        
        System.out.println("Por favor, digite o número da Conta: ");
        int numeroConta = new java.util.Scanner(System.in).nextInt();

        System.out.println("Por favor, digite o número da Agência: ");
        String numeroAgencia = new java.util.Scanner(System.in).nextLine();
    
        System.out.println("Por favor, digite o saldo: ");
        double saldo = new java.util.Scanner(System.in).nextDouble();
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ numeroAgencia + ", conta " + numeroConta +" e seu saldo é de R$ " + saldo + " já está disponível para saque.");
    

    }
}
