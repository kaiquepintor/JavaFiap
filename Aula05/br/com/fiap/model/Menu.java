package br.com.fiap.model;

import javax.swing.*;

public class Menu {
    public static void main(String[] args) {
        //calculadora: digite dois numeros e escolha a opção 1-somar 2-subtrair 3-multiplicar 4-dividir

        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° numero: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2° numero: "));

        int opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a opção: 1-somar 2-subtrair 3-multiplicar 4-dividir"));

        switch (opcao) {
            case 1:
                int soma = n1 + n2;
                JOptionPane.showMessageDialog(null, "A soma é: " + soma);
                break;
            case 2:
                int subtracao = n1 - n2;
                JOptionPane.showMessageDialog(null, "A subtração é: " + subtracao);
                break;
            case 3:
                int multiplicacao = n1 * n2;
                JOptionPane.showMessageDialog(null, "A multiplicação é: " + multiplicacao);
                break;
            case 4:
                float divisao = n1 / n2;
                JOptionPane.showMessageDialog(null, "A divisão é: " + divisao);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção invalida");


        }

    }
}
