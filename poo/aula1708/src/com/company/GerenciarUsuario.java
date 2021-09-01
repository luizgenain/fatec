package com.company;

public class GerenciarUsuario {

    public static void main(String[] args) {
        //Instanciar dois objetos do tipo Usuario
        Usuario usuario1, usuario2; //defini suas variaveis

        // Criar os objetos (instanciar)
        usuario1 = new Usuario();
        usuario1.setNome("Joaquim");
        usuario1.setEmail("joaquim@gmail.com");
        usuario1.setLogin("jj");
        usuario1.setSenha("123");
        usuario1.provarExistencia();
        usuario1.imprimirUsuario();

        usuario2 = new Usuario();
        usuario2.provarExistencia();

    }
}
