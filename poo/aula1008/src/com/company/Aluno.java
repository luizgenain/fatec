package com.company;

public class Aluno {
    //Atributos da classe (caracteristicas)
    public int ra;
    public String nomeAluno;
    public String email;

    //Métodos (funcionalidades)
    public void matricularAluno(){
        System.out.println("Aluno com o RA: " + ra);
        System.out.println("Foi matriculado com sucesso");
    }
    public void cancelarMatricula(){
        System.out.println("Aluno " + nomeAluno + " cancelou a matricula");
    }
    public void imprimirDadosAluno(){
        System.out.println("DADOS DO ALUNO");
        System.out.println("RA: " + ra);
        System.out.println("NOME: " + nomeAluno);
        System.out.println("EMAIL: " + email);
    }
}
