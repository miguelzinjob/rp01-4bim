package Main.Java.br.sesi.bank.bank_java_jdbc.controller;

import Main.Java.br.sesi.bank.bank_java_jdbc.domain.cliente.Cliente;
import Main.Java.br.sesi.bank.bank_java_jdbc.domain.conta.Conta;

public class BankJavaController {

    public void criarConta(Cliente cliente, Conta conta) {
        // Lógica para criar conta
        System.out.println("Conta criada para o cliente: " + cliente.getNome());
    }

    public void depositar(Conta conta, double valor) {
        conta.depositar(valor);
        System.out.println("Depósito realizado. Novo saldo: " + conta.getSaldo());
    }

    public void sacar(Conta conta, double valor) {
        conta.sacar(valor);
        System.out.println("Saque realizado. Novo saldo: " + conta.getSaldo());
    }
}

