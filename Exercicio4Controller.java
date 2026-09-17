package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class Exercicio4Controller {

    @FXML
    private ImageView imvPlano;

    @FXML
    private Label lblQ;

    @FXML
    private Label lblX;

    @FXML
    private Label lblY;

    @FXML
    private void initialize(){
        imvPlano.setOnMouseMoved(e -> {
            //fazendo X e Y
            double largura = imvPlano.getBoundsInLocal().getWidth();
            double altura = imvPlano.getBoundsInLocal().getHeight();
           
         double x = e.getX()-(largura/2);
         double y = (altura/2)- e.getY();
         
         //String format arredonda e tira as casa decimais longas
         lblX.setText(String.format("%.0f", x));
         lblY.setText(String.format("%.0f", y));

         //fazendo quadrante
         String quadrante;
         if(x>0 && y>0){
            quadrante = "1º Quadrante";
         } else if(x<0 && y>0){
            quadrante = "2º Quadrante";
         } else if(x<0 &&y<0){
            quadrante = "3º Quadrante";
         } else if(x>0&&y<0){
            quadrante = "4º Quadrante";
         } else{
            quadrante = "Sobre um dos eixos!";
         } 
         lblQ.setText(quadrante);
        });

    }

}
