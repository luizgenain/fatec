package com.company;

public class Apolice {
    private String nomeSegurado;
    private int idade;
    private double valorPremio;

    public String getNomeSegurado() {
        return nomeSegurado;
    }

    public void setNomeSegurado(String nomeSegurado) {
        this.nomeSegurado = nomeSegurado;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getValorPremio() {
        return valorPremio;
    }

    public void setValorPremio(double valorPremio) {
        this.valorPremio = valorPremio;
    }

    public void imprimir(){
        System.out.println("Dados da Apolice");
        System.out.println("Nome do Segurado: " + nomeSegurado);
        System.out.println("Idade: " + idade);
        System.out.println("Valor do premio: " + valorPremio);
    }

}
