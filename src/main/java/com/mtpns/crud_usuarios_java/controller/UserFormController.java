package com.mtpns.crud_usuarios_java.controller;

import com.mtpns.crud_usuarios_java.model.Usuario;
import com.mtpns.crud_usuarios_java.service.UsuarioService;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;

public class UserFormController {

    @FXML
    private Label titleLabel;
    @FXML
    private TextField nomeField;
    @FXML
    private TextField sobrenomeField;
    @FXML
    private TextField emailField;
    @FXML
    private TextField loginField;
    @FXML
    private TextField telefoneField;
    @FXML
    private DatePicker dataNascPicker;
    @FXML
    private ChoiceBox<String> sexoChoiceBox;
    @FXML
    private TextField enderecoField;

    private Stage stage;
    private Usuario usuario;
    private UsuarioService usuarioService;

    public void initialize(){
        usuarioService = new UsuarioService();
        sexoChoiceBox.setItems(FXCollections.observableArrayList("Masculino", "Femenino"));
    }
    public void setStage(Stage stage){
        this.stage = stage;
    }
    public void setUsuario(Usuario usuario){
        this.usuario = usuario;

        if (usuario != null){
            titleLabel.setText("Editar Usuário");
            nomeField.setText(usuario.getNome());
            sobrenomeField.setText(usuario.getSobrenome());
            emailField.setText(usuario.getEmail());
            loginField.setText(usuario.getLogin());
            if (usuario.getdataNasc() != null){
                dataNascPicker.setValue(usuario.getdataNasc());
            }
            telefoneField.setText(usuario.getTelefone());
            sexoChoiceBox.setValue(usuario.getSexo() == 'M'?"Masculino":"Femenino");
            enderecoField.setText(usuario.getEndereco());
        }else {
            titleLabel.setText("Adicionar Usuário");
        }
    }
    @FXML
    public void handleSalvar(){
        boolean isNew = (usuario == null);
        if (isNew){
            usuario = new Usuario();
        }
        usuario.setNome(nomeField.getText());
        usuario.setSobrenome(nomeField.getText());
        usuario.setEmail(nomeField.getText());
        usuario.setLogin(nomeField.getText());
        if (dataNascPicker.getValue() != null){
            usuario.setdataNasc(LocalDate.from(dataNascPicker.getValue()));
        }
        usuario.setTelefone(telefoneField.getText());
        usuario.setEndereco(enderecoField.getText());
        if (sexoChoiceBox.getValue() != null){
            usuario.setSexo(sexoChoiceBox.getValue().equals("Masculino")?'M':'F');
        }
        if (isNew){
            usuarioService.adicionarUsuario(usuario);
            usuarioService.adicionarUsuario(usuario);
            usuarioService.adicionarUsuario(usuario);
            usuarioService.adicionarUsuario(usuario);
            usuarioService.adicionarUsuario(usuario);
        }else {
            usuarioService.atualizarUsuario(usuario);
        }
    }
}