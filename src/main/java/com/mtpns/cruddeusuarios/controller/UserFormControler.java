package com.mtpns.cruddeusuarios.controller;

import com.mtpns.cruddeusuarios.model.Usuario;
import com.mtpns.cruddeusuarios.service.UsuarioService;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class UserFormControler {

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
    private DatePicker dataNascimentoPicker;
    @FXML
    private ChoiceBox<String> sexoChoiceBox;
    @FXML
    private TextField enderecoField;

    private Stage stage;
    private Usuario usuario;
    private UsuarioService usuarioService;

    public void initialize(){

    }
    public void setStage(){

    }
    public void setUsuario(){

    }
    @FXML
    public void handleSalvar(){

    }
}
