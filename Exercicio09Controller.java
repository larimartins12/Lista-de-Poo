package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import model.Aluno;
import util.Util;


public class Exercicio07Controller {

    @FXML
    private Button btCad;

    @FXML
    private DatePicker dpDnasc;

    @FXML
    private ToggleGroup grupoCurso;

    @FXML
    private RadioButton rbtEdif;

    @FXML
    private RadioButton rbtEletro;

    @FXML
    private RadioButton rbtInfo;

    @FXML
    private TextField tfEmail;

    @FXML
    private TextField tfNome;

    @FXML
    private TextField tfPront;

    @FXML
    void btCadClick(ActionEvent event) {

        if (tfNome.getText().isEmpty() 
            || tfEmail.getText().isEmpty()|| tfPront.getText().isEmpty()|| dpDnasc.getValue() == null || (!rbtInfo.isSelected() && !rbtEletro.isSelected() && !rbtEdif.isSelected())){
            
            Util.mensagemErro("Preencha todos os campos!!");
            return;
        }

        Aluno aluno = new Aluno();
        aluno.setNome (tfNome.getText());
        aluno.setEmail(tfEmail.getText());
        aluno.setProntuario (tfPront.getText());
        aluno.setdNasc(dpDnasc.getValue());

        if (rbtInfo.isSelected()) {
            aluno.setCurso("Informática");
        } else  if (rbtEletro.isSelected()) {
            aluno.setCurso("Eletromecânica");
        } else {
            aluno.setCurso("Edificações");
        }

        String mensagem = "Nome: "+ aluno.getNome() + "\nE-mail: " + aluno.getEmail() + "\nP"
    }
    }

