package br.com.fiap.lavanderia.model;

public class Cliente extends Pessoa {

    //atributos
    private boolean assinante;

    //construtor
    public Cliente(String nome, String cpf, int id, Endereco endereco, boolean assinante) {
        super(nome, cpf, id, endereco);
        this.assinante = assinante;
    }

    public Cliente(){}

    //metodos
    public void pagar (double valor) {
        //se for assinate tem 10% de desconto
        if (assinante) {
            valor *= 0.9;
            System.out.println(getNome() + ", você tem 10% de desconto! Você terá que pagar R$ " + valor);
        } else {
            System.out.println(getNome() + ", você terá que pagar R$ " + valor);
        }

        //exibir o nome e o valor a ser pago
    }
    //getters e setters
    public boolean isAssinante() {
        return assinante;
    }
    public void setAssinante(boolean assinante) {
        this.assinante = assinante;
    }
}
