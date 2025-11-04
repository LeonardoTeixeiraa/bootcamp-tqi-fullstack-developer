package creditCardSimulator.model;

public class CreditCard {
    private double saldo;
    private double limite;

    public CreditCard(double limite) {
        this.limite = limite;
        this.saldo = limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
