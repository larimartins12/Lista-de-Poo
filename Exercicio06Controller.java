package controller;

import Util.util;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class Exercicio06Controller {

    @FXML
    private ImageView imgV;

    @FXML
    private Label lblDelta;

    @FXML
    private Label lblX1;

    @FXML
    private Label lblX2;

    @FXML
    private TextField tfA;

    @FXML
    private TextField tfB;

    @FXML
    private TextField tfC;

    @FXML
    private void Calculo (){
    double a = Double.parseDouble(tfA.getText());
    double b = Double.parseDouble(tfB.getText());
    double c = Double.parseDouble(tfC.getText());

   double delta = (b*b)-4*a*c;
   lblDelta.setText(String.valueOf(delta));

   
   
    }
}
