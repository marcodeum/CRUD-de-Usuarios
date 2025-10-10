package com.mtpns.cruddeusuarios.model;
import java.util.Date;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private Date dataNascimento;
    private int idade;
    private String telefone;
    private char sexo;
    private String endereco;

    public Pessoa() {
        this.nome = "";
        this.sobrenome = "";
        this.dataNascimento = new Date();
        this.idade = 0;
        this.telefone = "";
        this.sexo = ' ';
        this.endereco = "";
    }

    public Pessoa(String nome, String sobrenome, Date dataNascimento, String telefone, char sexo, String endereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.sexo = sexo;
        this.endereco = endereco;
    }

    public char getSexo() {
        return sexo;
    }

    public Date getDataNasc() {
        return dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereço() {
        return endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setEndereco(String endereço) {
        this.endereco = endereço;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        Date currentDate = new Date();
        this.idade = currentDate.getYear() - this.dataNascimento.getYear();
        return this.idade;
    }

    public String getFullSexo() {
        if (this.sexo == 'F' || this.sexo == 'f'){
            return "Femenino";
        } else if (this.sexo == 'M' || this.sexo == 'm') {
            return "Masculino";
        }
        return "👽";
    }

    public String info(){
        return nome +" "+sobrenome+" | "+getIdade()+" anos | "+telefone+" | "+ getFullSexo() +"\n"+endereco;
    }
}