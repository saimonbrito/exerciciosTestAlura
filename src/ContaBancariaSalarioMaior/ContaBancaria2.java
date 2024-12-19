package ContaBancariaSalarioMaior;

public class ContaBancaria2{
     private int NumeroConta;
     private double saldoConta;

    public ContaBancaria2(int numeroConta, double saldoConta) {
        NumeroConta = numeroConta;
        this.saldoConta = saldoConta;
    }

    public int getNumeroConta() {
        return NumeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        NumeroConta = numeroConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    @Override
    public String toString() {
        return "ContaBancaria2{ " +
                "NumeroConta=" + NumeroConta +
                ", saldoConta=" + saldoConta +
                '}';
    }
}
