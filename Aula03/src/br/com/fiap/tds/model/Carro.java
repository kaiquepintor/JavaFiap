package br.com.fiap.tds.model;

public class Carro {
    //Atributos encapsulados
    private String placa;
    private String cor;
    private String modelo;
    private boolean eletrico;
    private int ano;

    //Metodos Getters e Setters
    //No IntelliJ IDEA: ALT + INSERT (Getters e Setters)
    public void setPlaca(String placa){
        this.placa = placa;
    }
    public String getPlaca(){
        return placa;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public String getCor(){
        return cor;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return modelo;
    }
    public void setEletrico(boolean eletrico){
        this.eletrico = eletrico;
    }
    public boolean getEletrico(){
        return eletrico;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public int getAno(){
        return ano;
    }



}
