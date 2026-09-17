package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.image.ImageView;

public class Exercicio2Controller {

    @FXML
    private Button bt1;

    @FXML
    private Button bt2;

    @FXML
    private Button bt3;

    @FXML
    private CheckBox chkDesativar;

    @FXML
    private ImageView img1;

    @FXML
    private ImageView img2;

 
    @FXML
    private ImageView img3;

    @FXML
    void bt1Click(ActionEvent event) {
        if(img1.isVisible()){ 
            img1.setVisible(false);
        }else{
            img1.setVisible(true);
        }
       
        
    }

    @FXML
    void bt2Click(ActionEvent event) {
           if(img2.isVisible()){ 
            img2.setVisible(false);
        }else{
            img2.setVisible(true);
        }

    }

    @FXML
    void bt3Cick(ActionEvent event) {
        if(img3.isVisible()){ 
            img3.setVisible(false);
        }else{
            img3.setVisible(true);
        }

    }

    @FXML
    void chkDesativarClick(ActionEvent event) {
        if(chkDesativar.isSelected()){
          bt1.setDisable(true);
          bt2.setDisable(true);
          bt3.setDisable(true);
        }else{
          bt1.setDisable(false);
          bt2.setDisable(false);
          bt3.setDisable(false);

        }

    }

}
