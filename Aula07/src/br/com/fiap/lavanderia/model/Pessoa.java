package br.com.fiap.lavanderia.model;

public class Pessoa extends Endereco{
    protected String nome;
    private String cpf;
    private int id;
    private Endereco endereco;

    //criar um construtor com todos os atributos
    public Pessoa(String nome, String cpf, int id, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.id = id;
        this.endereco = endereco;
    }

    public Pessoa(){}

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

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Endereco getEndereco() {return endereco;}
    public void setEndereco(Endereco endereco) {this.endereco = endereco;}
}
