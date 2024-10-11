package Main.Java.br.sesi.bank.bank_java_jdbc.service;

import Main.Java.br.sesi.bank.bank_java_jdbc.domain.cliente.Cliente;
import Main.Java.br.sesi.bank.bank_java_jdbc.domain.conta.Conta;

public class ContaService {

    public Conta abrirConta(Cliente cliente, String numeroConta, double saldoInicial) {
        Conta novaConta = new Conta(numeroConta, saldoInicial);
        // Lógica adicional para abertura da conta, se necessário
        return novaConta;
    }

    public void fecharConta(Conta conta) {
        // Lógica para fechar conta
        System.out.println("Conta " + conta.getNumeroConta() + " fechada.");
    }
}


