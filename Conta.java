package codigos;

public class Conta {
    private int NumeroDaConta;
    private int Agencia;
    private double Saldo;

    Conta(int NumeroDaConta, int Agencia) {
        this.Agencia = Agencia;
        this.NumeroDaConta = NumeroDaConta;
        this.Saldo = 0;
    }

    public void Deposito(double valor) {
        this.Saldo += valor;
    }

    public void saque(double valor) {
        this.Saldo  -= valor;
    }
    
    public void Extrato() {
        System.out.println("A conta com o numero "+ getAgencia() +" com a sua agencia " + getAgencia() + " seu saldo e de: " + getSaldo());
    }

    public int getAgencia() {
        return Agencia;
    }

    public void setAgencia(int agencia) {
        Agencia = agencia;
    }

    public int getNumeroDaConta() {
        return NumeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        NumeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }

}