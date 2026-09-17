package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import util.Util;

public class Exercicio3Controller {

    @FXML
    private Button btConfirmar;

    @FXML
    private TextField tfcpf1;

    @FXML
    private TextField tfcpf2;

    @FXML
    private TextField tfdata1;

    @FXML
    private TextField tfdata2;

    @FXML
    private TextField tfemail1;

    @FXML
    private TextField tfemail2;

    @FXML
    private TextField tfend1;

    @FXML
    private TextField tfend2;

    @FXML
    private TextField tfnm1;
    
    

    @FXML
    private TextField tfnm2;

    @FXML
    void btConfirmarClick(ActionEvent event) {
        String nome = tfnm1.getText().toUpperCase();
        String endereço = tfend1.getText().toUpperCase();
        String data = tfdata1.getText();
        String cpf = tfcpf1.getText();
        String email = tfemail1.getText();
        //NOME
       //lenght conta as letras e contains vê oq tem dentro da variavel nome 
       if(nome.length()>3 && nome.contains(" ")){
        tfnm2.setText(nome);   
       } else{
        //chamando erro
        Util.mensagemErro("NOME INVÁLIDO: O nome deve conter mais de 3 letras e um espaço entre nome e sobrenome!!");
        tfnm1.requestFocus();
       }
       
       //ENDEREÇO
       String novoEnder = endereço;
       if(endereço.length()>3 && endereço.contains(" ")){
        
        novoEnder = novoEnder.replace("AV. ", "AVENIDA ");
        novoEnder = novoEnder.replace("AV ", "AVENIDA ");
        novoEnder = novoEnder.replace("R. ", "RUA ");
        novoEnder = novoEnder.replace("R ", "RUA ");
        novoEnder = novoEnder.replace("AL. ", "ALAMEDA ");
        novoEnder = novoEnder.replace("AL ", "ALAMEDA  ");
        novoEnder = novoEnder.replace("PÇ. ", "PRAÇA ");
        novoEnder = novoEnder.replace("PÇ ", "PRAÇA ");
        
        
       
       } else{
        //chamando erro
        Util.mensagemErro("ENDERÇO INVÁLIDO: Deve conter mais de 3 letras e conter 1 espaço");
        tfend1.requestFocus();
       }
       tfend2.setText(novoEnder);

       //matches verifica se todos os caracteres são números

       //CPF
      if(cpf.length()==11&&cpf.matches("\\d+")){
        tfcpf2.setText(cpf);
      } else{
        Util.mensagemErro("CPF INVÁLIDO: Não cumpre os requisitos, coloque apenas números!");
        tfcpf1.requestFocus();
      }
      
      //DATA DE NASCIMENTO (verificando se foram informados apenas números e se tem 8 caracteres)
      if(data.length()==8&&data.matches("\\d+")){
        //\\d+ significa q deve ser caracter numérico, de  0 a 9
        //substring serve para pegar uma parte da string, o primeiro numero é o inicio e o segundo numero é onde parar
        data = data.substring(0, 2)+"/"+
        data.substring(2,4)+"/"+
        data.substring(4,8);
         } else{
            Util.mensagemErro("DATA INVÁLIDA: Digite apenas números!");
            tfdata1.requestFocus();
         }
      tfdata2.setText(data);

      //E-MAIL
      if(email.length()>5 && email.contains("@") && !email.contains(" ")){
          tfemail2.setText(email);
      } else{
        Util.mensagemErro("E-MAIL INVÁLIDO: Deve conter mais de 5 caracteres, não pode conter espaço e @!!");
      }
    }

}
