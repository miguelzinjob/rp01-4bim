package Main.Java.br.sesi.bank.bank_java_jdbc.domain.cliente;

public class Cliente {

    // Atributos
    private String nome;
    private String cpf;
    private String endereco;

    // Funções (Métodos)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
