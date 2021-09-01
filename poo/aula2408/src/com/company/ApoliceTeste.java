package com.company;

public class ApoliceTeste {

    public static void main(String[] args) {
        Apolice apolice = new Apolice();
        apolice.setNomeSegurado("Luiz");
        apolice.setIdade(44);
        apolice.setValorPremio(500000.00);
        apolice.imprimir();
    }
}
