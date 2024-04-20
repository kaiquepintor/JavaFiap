package br.com.fiap.lavanderia.model;

public class Funcionario extends Pessoa {

    private String cargo;
    private double salario;

    //construtor
    public Funcionario(String nome, String cpf, int id, Endereco endereco, String cargo, double salario){
        super(nome, cpf, id, endereco);
        this.cargo = cargo;
        this.salario = salario;
    }

    public Funcionario(){}

    //getters e setters
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
