package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.ToggleGroup;

public class Exercicio07Controller {

    @FXML
    private ToggleGroup gTemp;

    @FXML
    private Label lblCelsius;

    @FXML
    private Label lblFah;

    @FXML
    private Label lblKelvin;

    @FXML
    private RadioButton rdbCelsius;

    @FXML
    private RadioButton rdbFah;

    @FXML
    private RadioButton rdbKelvin;

    @FXML
    private Slider sldTemp;

@FXML  
    public void initialize() {

        attLimites();
        sldTemp.valueProperty().addListener((obs, oldVal, newVal) -> {
            attTemperaturas();
        });
        rdbCelsius.setOnAction(e -> {
            attLimites();
            attTemperaturas();
        });

         rdbKelvin.setOnAction(e -> {
            attLimites();
            attTemperaturas();
        });

         rdbFah.setOnAction(e -> {
            attLimites();
            attTemperaturas();
        });
    }
        private void attLimites() {
            if (rdbCelsius.isSelected()){
                sldTemp.setMin(-273.15);
                sldTemp.setMax(100);
            }  else if (rdbKelvin.isSelected()){
                sldTemp.setMin(0);
                sldTemp.setMax(373.15);
            }else if (rdbFah.isSelected()){
                sldTemp.setMin(-459.67);
                sldTemp.setMax(212);
            }
        }

        private void attTemperaturas(){
            double temp = sldTemp. getValue();
            double celsius; 
            double kelvin; 
            double fah;

            if (rdbCelsius.isSelected()){
                celsius =  temp;
                kelvin  = celsius + 273.15; 
                fah  =  celsius * 9/5 + 32; 
            }  else  if (rdbKelvin.isSelected()){
                kelvin =  temp; 
                celsius =  kelvin - 273.15; 
                fah = (kelvin -  273.15)  * 9/5 + 32; 
            }  else {
                fah  =  temp; 
                celsius  = (fah - 32) * 5/9;
                kelvin =  (fah -  32) * 5/9 + 273.15; 
            }

            lblCelsius.setText(String.format("%.2f °C", celsius));
            lblKelvin.setText(String.format("%.2f K", kelvin));
            lblFah.setText(String.format("%.2f °F", fah));

        }
     
} 
                                                                                                                                                                                                      



