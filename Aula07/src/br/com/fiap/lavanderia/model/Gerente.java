package br.com.fiap.lavanderia.model;

public class Gerente extends Funcionario{
    private double bonificacao;

    //construtor
    public Gerente(String nome, String cpf, int id, Endereco endereco, String cargo, double salario, double bonificacao) {
        super(nome, cpf, id, endereco, cargo, salario);
        this.bonificacao = bonificacao;
    }

    //getters e setters
    public double getBonificacao() {
        return bonificacao;
    }
    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }
}
