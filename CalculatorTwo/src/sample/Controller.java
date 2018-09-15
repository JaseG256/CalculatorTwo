package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;



public class Controller {

    @FXML
    private Text output;

    // Should be converted to Enum defining operator symbols i.e. (+,-,*,/ etc)
    private String operator;

    @FXML
    private void processNumPad(ActionEvent event) {
        String value = ((Button)event.getSource()).getText();
        output.setText(output.getText() + value);
    }

    @FXML
    private void processOperator(ActionEvent event) {
        String value = ((Button)event.getSource()).getText();

        if (!"=".equals(value)) {

        }
    }
}
