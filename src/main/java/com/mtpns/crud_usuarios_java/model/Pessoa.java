package com.mtpns.crud_usuarios_java.model;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class Pessoa {

    //ATRIBUTOS COM VISIBILIDADE PRIVADA
    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    private int idade;
    private String telefone;
    private char sexo;
    private String endereco;

    //CONSTRUTORES
    public Pessoa() {
        this.nome = "";
        this.sobrenome = "";
        this.idade = 0;
        this.dataNasc = LocalDate.now();
        this.telefone = "";
        this.sexo = ' ';
        this.endereco = "";
    }

    public Pessoa(String nome, LocalDate dataNasc) {
        this.nome = nome;
        this.sobrenome = "";
        this.idade = 0;
        this.dataNasc = dataNasc;
        this.telefone = "";
        this.sexo = ' ';
        this.endereco = "";
    }

    public Pessoa(String nome, String sobrenome, LocalDate dataNasc, String telefone, char sexo, String endereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;
        this.telefone = telefone;
        this.sexo = sexo;
        this.endereco = endereco;
    }
    //GETTES E SETTERS (ENCAPSULAMENTO)

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getdataNasc() {
        return dataNasc;
    }

    public void setdataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade() {
        boolean isNull = !(this.dataNasc == null);
        LocalDate dataNasc = isNull ? this.dataNasc : LocalDate.now();
        LocalDate dataAtual = LocalDate.now();
        this.idade = Period.between(dataNasc, dataAtual).getYears();
    }
}