package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import util.Util;

public class Exercicio1Controller {

    @FXML
    private Button btDiv;

    @FXML
    private Button btMult;

    @FXML
    private Button btSoma;

    @FXML
    private Button btSub;

    @FXML
    private Label lblResul;

    @FXML
    private TextField tfVal1;

    @FXML
    private TextField tfVal2;

    private boolean validarNumeros(){
   try{
    Double.parseDouble(tfVal1.getText());
    Double.parseDouble(tfVal2.getText());
    return true;
   } catch(NumberFormatException e){
    Util.mensagemErro("Apenas números serão aceitos!!");
    return false;

   }
}

    @FXML
    void btDivClick(ActionEvent event) {
        if (!validarNumeros()) {
            return;
        }
        double v1 = Double.parseDouble(tfVal1.getText());
        double v2 = Double.parseDouble(tfVal2.getText());
        double resul;
        if(v2==0){
            Util.mensagemErro("Não divide zero não!");
            return;
        } else{
            resul = v1/v2;
        }
        lblResul.setText(String.valueOf(resul));


    }

    @FXML
    void btMultClick(ActionEvent event) {
         if (!validarNumeros()) {
            return;
        }
        double v1 = Double.parseDouble(tfVal1.getText());
        double v2 = Double.parseDouble(tfVal2.getText());
        double resul = v1*v2;
        lblResul.setText(String.valueOf(resul));
      

    }

    @FXML
    void btSomaClick(ActionEvent event) {
         if (!validarNumeros()) {
            return;
        }
        double v1 = Double.parseDouble(tfVal1.getText());
        double v2 = Double.parseDouble(tfVal2.getText());
        double resul = v1+v2;
        lblResul.setText(String.valueOf(resul));

    }

    @FXML
    void btSubClick(ActionEvent event) {
         if (!validarNumeros()) {
            return;
        }
        double v1 = Double.parseDouble(tfVal1.getText());
        double v2 = Double.parseDouble(tfVal2.getText());
        double resul = v1-v2;
        lblResul.setText(String.valueOf(resul));

    }

}
