package com.company;

public class Usuario {
    //Atributos
    private String nome;
    private String email;
    private String login;
    private String senha;

    //get e set do nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //get e set do email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //get e set do login
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    //get e set da senha
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    //metodos
    public void provarExistencia() {
        System.out.println("Usuario: " + nome);
        System.out.println("Existe no sistema");
    }

    public void imprimirUsuario() {
        System.out.println("Dados do usuário");
        System.out.println("----------------");
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Login: " + login);
        System.out.println();
    }
}
