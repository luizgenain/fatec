package com.company;

public class Computador {
    public String marca;
    public String cor;
    public String modelo;
    public long numeroSerie;
    public double preco;

    public void imprimir(){
        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
        System.out.println("Modelo: " + modelo);
        System.out.println("Número de série: " + numeroSerie);
        System.out.println("Preço: " + preco);
    }

    public void calcularValor(){
        double valor;
        if(marca == "HP"){
         valor = preco * 1.3;
         alterarValor(valor);
        }else if(marca == "IBM"){
            valor = preco * 1.5;
            alterarValor(valor);
        }
    }

    public int alterarValor(Double novoValor){
        if(novoValor > 0){
            preco = novoValor;
            return 1;
        }
        return 0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public long getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(long numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
