package com.mtpns.cruddeusuarios.model;

import java.util.Date;

public class Usuario extends Pessoa {
    private String login;
    private String senha;
    private String email;

    public Usuario(String nome, String sobrenome, Date dataNascimento, String telefone, char sexo, String endereço, String login, String senha, String email)  {
        super(nome, sobrenome, dataNascimento, telefone, sexo, endereço);
        this.login = login;
        this.senha = senha;
        this.email = email;
    }

    public Usuario(){
        super();
        this.login = "";
        this.senha = "";
        this.email = "";
    }
    public Usuario(String login, String senha, String email) {
        this.login = login;
        this.senha = senha;
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isEqual(String senha){
        return senha.equals(this.senha);
    }
}