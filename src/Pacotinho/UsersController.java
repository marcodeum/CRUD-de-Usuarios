package Pacotinho;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class UsersController {
    private List<Usuario> usuarios;
    private Scanner leia;

    public UsersController() {
        this.usuarios = usuarios;
        this.leia = new Scanner(System.in);
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public Usuario inputUsuario(){
        System.out.println("####CADASTRO DE USUÁRIO####");
        System.out.println("Digite o nome:");
        String nome = leia.nextLine();
        System.out.println("Digite o sobrenome:");
        String sobrenome = leia.nextLine();
        System.out.println("Digite sua data de nascimento - (YYYY/MM/DD):");
        Date dataNasc = new Date(leia.next());
        System.out.println("Digite o número de telefone - (Apenas o número):");
        int telefone = leia.nextInt();
        System.out.println("Digite o sexo");
        char sexo = leia.next().charAt(0);
        System.out.println("Digite seu endereço:");
        String endereço = leia.nextLine();
        System.out.println("Digite seu email");
        String email = leia.nextLine();
        System.out.println("Digite seu nome de usuário para login - (não pode haver espaço)");
        String login = leia.nextLine().toLowerCase().trim();
        System.out.println("Digite a senha");
        String senha = leia.nextLine();
        return new Usuario(nome, sobrenome, dataNasc, telefone, sexo, endereço, login, senha, email);
    }
    public void cadastrarUsuario(Usuario novoUsuario){
        this.usuarios.add(novoUsuario);
    }
    public void listarUsuarios(){
        System.out.println("#### LISTA DE USUÁRIOS ####");
        for (int i = 0; i < usuarios.size(); i++) {
            System.out.println(usuarios.get(i).info()+"\n");
        }
    }
}