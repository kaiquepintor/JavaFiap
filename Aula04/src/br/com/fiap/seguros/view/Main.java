package br.com.fiap.seguros.view;

import br.com.fiap.seguros.model.Cliente;
import br.com.fiap.seguros.model.Veiculo;

public class Main {
    public static void main(String[] args) {
        //instanciar em cliente
        Cliente cliente = new Cliente("Kaique", "12345678");

        //instanciar veiculo
        Veiculo veiculo = new Veiculo("KK3P230", "Carrera", "Chumbo", 6);

        //instanciar um novo cliente com nome, cpf, veiculo
        Cliente lisa = new Cliente("Lisa", "87654321", veiculo);

        //exibir os dados do cliente
        System.out.println("NOME: " + cliente.getNome() + " CPF: " + cliente.getCpf());
        System.out.println("NOME: " + lisa.getNome() + " CPF: " + lisa.getCpf());
        System.out.println(lisa.getVeiculo().getModelo() + " " + lisa.getVeiculo().getPlaca() + " " + lisa.getVeiculo().getCor() + " " + lisa.getVeiculo().getMotor());

    }
}