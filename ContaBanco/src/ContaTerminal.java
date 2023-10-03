import java.util.Scanner;


public class ContaTerminal {


    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args)  {
          try (Scanner dadosUsuario = new Scanner(System.in)) {
            int numero;
            String agencia;
            String nomeCliente;
            double saldo;
           
        
            System.out.println("Por favor, digite o número da sua conta!");
            numero = dadosUsuario.nextInt();
            dadosUsuario.nextLine();

            System.out.println("Por favor, digite o número da Agência!");
            agencia = dadosUsuario.nextLine();
           
            System.out.println("Por favor, digite seu nome!");
            nomeCliente  = dadosUsuario.nextLine();
            
            System.out.println("Por favor, digite o valor que deseja depositar!");
            saldo = dadosUsuario.nextDouble();
            
            System.out.println("Olá " +nomeCliente+ " obrigado por criar uma conta em nosso banco, sua agência é " +agencia+ ", conta  " +numero+ "  e seu saldo  " +saldo+ "  já está disponível para saque.");
            
          }     
    }
}
