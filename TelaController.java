package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import model.Cliente;
import util.Util;

public class TelaController {

    @FXML
    private Button btCadastrar;

    @FXML
    private Button btLimpar;

    @FXML
    private Button btLista;

    @FXML
    private Label lbNome;

    @FXML
    private ListView<String> lvClientes;

    @FXML
    private TextField tfCEP;

    @FXML
    private TextField tfCPF;

    @FXML
    private TextField tfData;

    @FXML
    private TextField tfEndereco;

    @FXML
    private TextField tfNome;

    @FXML
    void btCadastrarClick(ActionEvent event) {

        String cep;
        int valorCep;

        if(tfNome.getText().trim().isEmpty()){
            Util.mensagemErro("ERROUUUUUUUUUUUU - preenche o nome pfv :( ");
            tfNome.requestFocus();;
            return;
        }
        if(tfCPF.getText().trim().isEmpty()){
            Util.mensagemErro("ERROUUUUUUUUUUUU - preenche o CPF pfv :( ");
            tfCPF.requestFocus();
                valorCep = Integer.parseInt(tfCEP.getText());
            return;
        }
        if(tfCEP.getText().trim().isEmpty()){
            Util.mensagemErro("ERROUUUUUUUUUUUU - preenche o CEP pfv :( ");
            tfCEP.requestFocus();
            return;
        }
        if(tfEndereco.getText().trim().isEmpty()){
            Util.mensagemErro("ERROUUUUUUUUUUUU - preenche o endereço pfv :( ");
            tfEndereco.requestFocus();
            return;
        }
        if(tfData.getText().trim().isEmpty()){
            Util.mensagemErro("ERROUUUUUUUUUUUU - preenche a data pfv :( ");
            tfData.requestFocus();
            return;
        }
       Cliente cli = new Cliente();
       cli.setNomeCliente(tfNome.getText());
       cli.setCEP((Integer.parseInt(tfCEP.getText())));
       cli.setCPF(tfCPF.getText());
       cli.setEndereco(tfEndereco.getText());
       cli.setDataNasc(tfData.getText());
       //para add os nomes na lista
       lvClientes.getItems().add(cli.getNomeCliente());
    }

    @FXML
    void btLimparClick(ActionEvent event) {
        tfNome.clear();
        tfCEP.clear();
        tfCPF.clear();
        tfData.clear();
        tfEndereco.clear();
          
            
    }

    @FXML
    void btListaClick(ActionEvent event) {
       lvClientes.getItems().clear();

    }

}
