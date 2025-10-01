package Pacotinho;

import java.util.Date;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private Date dataNasc;
    private int idade;
    private int telefone;
    private char sexo;
    private String endereço;

    public Pessoa() {
        this.nome = "";
        this.sobrenome = "";
        this.dataNasc = new Date();
        this.idade = 0;
        this.telefone = 0;
        this.sexo = ' ';
        this.endereço = "";
    }

    public Pessoa(String nome, String sobrenome, Date dataNasc, int telefone, char sexo, String endereço) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;
        this.telefone = telefone;
        this.sexo = sexo;
        this.endereço = endereço;
    }

    public char getSexo() {
        return sexo;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public int getTelefone() {
        return telefone;
    }

    public String getEndereço() {
        return endereço;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
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

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        Date currentDate = new Date();
        this.idade = currentDate.getYear() - this.dataNasc.getYear();
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
        return nome +" "+sobrenome+" | "+getIdade()+" anos | "+telefone+" | "+ getFullSexo() +"\n"+endereço;
    }
}