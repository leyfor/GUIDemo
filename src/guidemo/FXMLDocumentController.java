/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guidemo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.ChoiceBox;

/**
 *
 * @author jeffr
 */
public class FXMLDocumentController implements Initializable {

    // These items are for the CheckBox example
    @FXML private Label label;
    @FXML private CheckBox pepperoniCheckBox;
    @FXML private CheckBox pineAppleCheckBox;
    @FXML private CheckBox beconCheckBox;
    @FXML private Button button;

    // These items are for the ChoiceBox examples
    @FXML private ChoiceBox choiceBox;
    @FXML private  Label choiceBoxLabel;
    
    @FXML private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }

    /**
     * This is update the label for the ChoiceBox
     */

    public void choiceBoxButtonPushed() {
        choiceBoxLabel.setText("My favourite fruit is:\n " +  choiceBox.getValue().toString());
        
    }


    /**
     * This is for the CheckBox example
     */
    public void pizzaOrderButtonPush() {
        String order = "Toppings are: ";
        
        if(pineAppleCheckBox.isSelected()) {
            order += "\npineapple";
        } 
        if(beconCheckBox.isSelected()) {
            
            order += "\nbecon";
            
        } 
        if (pepperoniCheckBox.isSelected()) {
            order += "\npeperoni";
        }
        
        this.label.setText(order);
        
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        label.setText("");

        // This items are for the configuring the choiceBox example
        choiceBoxLabel.setText("");
        choiceBox.getItems().add("apples");
        choiceBox.getItems().add("bananas");
        choiceBox.getItems().addAll("oranges", "pears", "strawberries");
        choiceBox.setValue("apples");
    }    
    
}
