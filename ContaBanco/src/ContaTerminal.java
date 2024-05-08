public class ContaTerminal {

    private int numConta;
    private String numAgencia;
    private String nomeCliente;
    private double saldo;

    public ContaTerminal(int numConta, String numAgencia, String nomeCliente, double saldo) {
        this.numConta = numConta;
        this.numAgencia = numAgencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public ContaTerminal() {

    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getNumAgencia() {
        return numAgencia;
    }

    public void setNumAgencia(String numAgencia) {
        this.numAgencia = numAgencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
