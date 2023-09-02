import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {

        //Classe Scanner é resposávél pela entrada de dados na aplicação.
        Scanner leituraDadosClientes = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nomeDoCliente = leituraDadosClientes.nextLine();

        System.out.println("Digite sua agência");
        String numeroDaAgencia = leituraDadosClientes.nextLine();

        System.out.println("Digite o numero da sua conta");
        int contaCliente = leituraDadosClientes.nextInt();

        //É necessário que ao adicionar o valor do saldo se ultilize a virgula "," após a segunda casa decimal. 
        System.out.println("Digite seu saldo");
        Double saldoCliente = leituraDadosClientes.nextDouble();
        leituraDadosClientes.close();  
        
        System.out.println("Olá " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
        numeroDaAgencia + ", conta " + contaCliente + " e seu saldo " + saldoCliente + " já está disponivél para saque.");  
      
    }       
}
