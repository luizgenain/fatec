package com.company;

public class ComputadorTeste {

    public static void main(String[] args) {
	// write your code here
        Computador computadorHP, computadorIBM;
        int rtn;

        computadorHP = new Computador();
        computadorHP.setMarca("HP");
        computadorHP.setCor("Preto");
        computadorHP.setModelo("Inspiron 3437");
        computadorHP.setNumeroSerie(1234);
        computadorHP.setPreco(3000.00);
        computadorHP.imprimir();
        computadorHP.calcularValor();
        computadorHP.imprimir();

        computadorIBM = new Computador();
        computadorIBM.setMarca("IBM");
        computadorIBM.setCor("Branco");
        computadorIBM.setModelo("Notebook IBM");
        computadorIBM.setNumeroSerie(4321);
        computadorIBM.setPreco(5000.00);
        computadorIBM.imprimir();
        computadorIBM.calcularValor();
        computadorIBM.imprimir();
        rtn = computadorIBM.alterarValor(5000.00);
        if(rtn == 1){
            System.out.println("\nValor Alterado");
        } else{
            System.out.println("\nValor não alterado");
        }
        computadorIBM.imprimir();
    }
}
