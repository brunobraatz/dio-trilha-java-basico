import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ContaTerminal conta = new ContaTerminal();

        String nomeCliente;
        String codAgencia;
        int numConta;
        double saldoConta;

        /* Utilizando método convencional */

        System.out.println("Insira o nome do titular da conta: ");
        nomeCliente = input.next();

        System.out.println("Insira o número da agência, com dígito e sem espaços: ");
        codAgencia = input.next();

        System.out.println("Insira o número da conta: ");
        numConta = input.nextInt();

        System.out.println("Insira o saldo em conta: ");
        saldoConta = input.nextDouble();

        System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é: "+ codAgencia + ", número da conta: "+ numConta + " e seu saldo é de: "+ saldoConta);


        /* Utilizando Orientação a objetos */

        System.out.println("Insira o nome do titular da conta: ");
        conta.setNomeCliente(input.next());

        System.out.println("Insira o número da agência, com dígito e sem espaços: ");
        conta.setNumAgencia(input.next());

        System.out.println("Insira o número da conta: ");
        conta.setNumConta(input.nextInt());

        System.out.println("Insira o saldo em conta: ");
        conta.setSaldo(input.nextDouble());

        System.out.println("Olá "+ conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é: "+ conta.getNumAgencia() + ", número da conta: "+ conta.getNumConta() + " e seu saldo é de: "+ conta.getSaldo());

    }

}