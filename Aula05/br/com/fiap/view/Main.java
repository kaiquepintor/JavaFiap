package br.com.fiap.view;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //conversões
        String notaStr1 = JOptionPane.showInputDialog("Digite a 1° nota: ");
        float nota1 = Float.parseFloat(notaStr1);

        float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a 2° nota: "));

        //media
        float media = (nota1 + nota2) / 2;

        JOptionPane.showMessageDialog(null, "Média é " + media);

        //exibir se o aluno passou ou não de ano
        //acima de 6, passou de ano
        //entre 4 e 5,9 exame
        //abaibo de 4, dp

        if (media >=6) {
            JOptionPane.showMessageDialog(null, "Parabéns! Você passou de ano");
        } else if (media < 6 && media >= 4) {
            JOptionPane.showMessageDialog(null, "Você tem uma chance! Está de exame");
        } else {
            JOptionPane.showMessageDialog(null, "Você está de DP");
        }




    }
}
