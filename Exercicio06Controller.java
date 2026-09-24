package controller;

import Util.util;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Exercicio06Controller {

    @FXML
    private Button btCalculo;

    @FXML
    private ImageView imgV;

    @FXML
    private Label lblDelta;

    @FXML
    private Label lblRaizes;

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
    void btCalculoClick(ActionEvent event) {
         Calculo();
        System.out.println("BOTÃO CLICADO!");
    }

    private void Calculo (){

        try{

    double a = Double.parseDouble(tfA.getText());
    double b = Double.parseDouble(tfB.getText());
    double c = Double.parseDouble(tfC.getText());

    if (a == 0){
        util.mensagemErro("O valor de A não pode ser zero");
        return;
    }
    double delta = Math.pow(b, 2)-4*a*c;
    lblDelta.setText(String.valueOf(delta));

    if (delta < 0){
        lblRaizes.setText("A equação não possui raízes reais");
        lblX1.setText("X' = -"); 
        lblX2.setText("X'' = -");

    } else {
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);

        lblRaizes.setText("A equação possui raízes reais.");
        lblX1.setText(String.format("%.2f", x1));
        lblX2.setText(String.format("%.2f", x2));
    }

    if (a > 0) {
        Image img = new Image(
            getClass().getResourceAsStream("/images/parabolaUP.jpg"));
            imgV.setImage(img);
    } else {
        Image img = new Image(
        getClass().getResourceAsStream("/images/parabolaDOWN.jpg"));
        imgV.setImage(img);
    }
        } catch(NumberFormatException e) {
        util.mensagemErro("Digite valores numéricos válidos.");
        }
    }
    }


