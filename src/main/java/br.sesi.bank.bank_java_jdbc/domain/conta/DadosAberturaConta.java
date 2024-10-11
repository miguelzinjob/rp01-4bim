package Main.Java.br.sesi.bank.bank_java_jdbc.domain.conta;

public class DadosAberturaConta {

    private String numeroConta;
    private String tipoConta;
    private double saldoInicial;

    // Construtor
    public DadosAberturaConta(String numeroConta, String tipoConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;
        this.saldoInicial = saldoInicial;
    }

    // Métodos Getters e Setters
    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }
}
