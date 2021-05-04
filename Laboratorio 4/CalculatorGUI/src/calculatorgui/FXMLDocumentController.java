/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorgui;

import businessLogic.Calculadora;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Anabel
 */
public class FXMLDocumentController implements Initializable {

    private float data;
    private int operation = -1;

    @FXML
    private Button one;

    @FXML
    private Button eight;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button plus;

    @FXML
    private Button five;

    @FXML
    private Button seven;

    @FXML
    private Button four;

    @FXML
    private Button six;

    @FXML
    private Button minus;

    @FXML
    private Button nine;

    @FXML
    private Button mult;

    @FXML
    private Button zero;

    @FXML
    private Button equals;

    @FXML
    private Button clear;

    @FXML
    private Button div;

    @FXML
    private Button back;

    @FXML
    private Button mod;

    @FXML
    private Button signo;

    @FXML
    private Button coma;

    @FXML
    private Button tenPow;

    @FXML
    private Button sqrt;

    @FXML
    private Button nFact;

    @FXML
    private Button log;

    @FXML
    private TextField display;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() == one) {
            display.setText(display.getText() + "1");
        } else if (event.getSource() == two) {
            display.setText(display.getText() + "2");
        } else if (event.getSource() == three) {
            display.setText(display.getText() + "3");
        } else if (event.getSource() == four) {
            display.setText(display.getText() + "4");
        } else if (event.getSource() == five) {
            display.setText(display.getText() + "5");
        } else if (event.getSource() == six) {
            display.setText(display.getText() + "6");
        } else if (event.getSource() == seven) {
            display.setText(display.getText() + "7");
        } else if (event.getSource() == eight) {
            display.setText(display.getText() + "8");
        } else if (event.getSource() == nine) {
            display.setText(display.getText() + "9");
        } else if (event.getSource() == zero) {
            display.setText(display.getText() + "0");
        } else if (event.getSource() == clear) {
            display.setText("");
        } else if (event.getSource() == plus) {
            data = Float.parseFloat(display.getText());
            operation = 1; //Addition
            display.setText("");
        } else if (event.getSource() == minus) {
            data = Float.parseFloat(display.getText());
            operation = 2; //Substraction
            display.setText("");
        } else if (event.getSource() == mult) {
            data = Float.parseFloat(display.getText());
            operation = 3; //Mul
            display.setText("");
        } else if (event.getSource() == div) {
            data = Float.parseFloat(display.getText());
            operation = 4; //Division
            display.setText("");
        } else if (event.getSource() == back) {
            String dato = display.getText();
            if (!dato.isEmpty()) {
                dato = display.getText().substring(0, display.getText().length() - 1);
            }
            display.setText(dato);
        } else if (event.getSource() == mod) {
            data = Float.parseFloat(display.getText());
            operation = 5; //Mod
            display.setText("");
        } else if (event.getSource() == signo) {  //signo
            if (operation == 1 || operation == 2 || operation == 3 || operation == 4 || operation == 6) {
                float data2 = 0;
                data2 = Float.parseFloat(display.getText());
                data2 = Calculadora.signo(data2);
                display.setText(String.valueOf(data2));
            }else{
                data = Float.parseFloat(display.getText());
                data = Calculadora.signo(data);
                display.setText(String.valueOf(data));
            }
        } else if (event.getSource() == coma) { //coma
            String dato = display.getText();
            if (!dato.contains(".")) {
                display.setText(display.getText() + ".");
            }
        } else if (event.getSource() == tenPow) { //potencia
            data = Float.parseFloat(display.getText());
            data = Calculadora.power(data);
            display.setText(String.valueOf(data));
        } else if (event.getSource() == sqrt) {  //raiz
            data = Float.parseFloat(display.getText());
            data = Calculadora.square(data);
            display.setText(String.valueOf(data));
        } else if (event.getSource() == nFact) { //factorial
            data = Float.parseFloat(display.getText());
            data = Calculadora.fact(data);
            display.setText(String.valueOf(data));
        } else if (event.getSource() == log) { //logaritmo
            data = Float.parseFloat(display.getText());
            data = Calculadora.log(data);
            display.setText(String.valueOf(data));
        } else if (event.getSource() == equals) {
            float secondOperand = Float.parseFloat(display.getText());
            switch (operation) {
                case 1: //Addition
                    float ans = Calculadora.add(data, secondOperand);
                    display.setText(String.valueOf(ans));
                    break;
                case 2: //Subtraction
                    ans = Calculadora.substract(data, secondOperand);
                    display.setText(String.valueOf(ans));
                    break;
                case 3: //Mul
                    ans = Calculadora.multiply(data, secondOperand);
                    display.setText(String.valueOf(ans));
                    break;
                case 4: //Div
                    ans = 0f;
                    ans = Calculadora.div(data, secondOperand);
                    display.setText(String.valueOf(ans));
                    break;
                case 5: //Mod
                    ans = Calculadora.mod(data, secondOperand);
                    display.setText(String.valueOf(ans));
                    break;
            }
            operation = 0;
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
