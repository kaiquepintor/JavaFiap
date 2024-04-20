package br.com.fiap.seguros.model;

public class Cliente {
    private String nome;
    private String cpf;
    private Veiculo veiculo;
    public Cliente (){}
    //metodo construtor
    public Cliente (String nome){
        this.nome = nome;
    }
    public Cliente (String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    //Criar um construtor com todos os atributos
    public Cliente (String nome, String cpf, Veiculo veiculo) {
        this(nome, cpf);
        this.veiculo = veiculo;
    }

    //getters e setters

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
    public Veiculo getVeiculo() {
        return veiculo;
    }
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
}
