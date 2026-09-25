package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;

public class Exercicio08Controller {

    @FXML
    private Button btSort;

    @FXML
    private Label lblNum;

    @FXML
    private Label lblSort1;

    @FXML
    private Label lblSort2;

    @FXML
    private Label lblSort3;

    @FXML
    private Spinner<Integer> spnV1;

    @FXML
    private Spinner<Integer> spnV2;

    @FXML
    private Spinner<Integer> spnV3;

    @FXML
    void btSortClick(ActionEvent event) {
        sortear();
    }

     @FXML 
    void sortear () {
        int v1 = spnV1.getValue();
        int v2 = spnV2.getValue();
        int v3 = spnV3.getValue();

        int n1;
        int n2;
        int n3;

        do{
            n1 = (int)(Math.random()*(v1 + 1));
        } while (n1 > 9);

        do {
            n2 = (int)(Math.random()*v2)+1;
        } while (n2 == n1);

        do {
            n3 = (int)(Math.random()*(v3 - 1)) + 2;
        } while (n3 == n1 || n3 == n2);

        lblSort1.setText(String.valueOf(n1));
        lblSort2.setText(String.valueOf(n2));
        lblSort3.setText(String.valueOf(n3));

        lblNum.setText(
            String.valueOf(n1) + String.valueOf(n2) + String.valueOf(n3)
        );
        
    }

}

    
