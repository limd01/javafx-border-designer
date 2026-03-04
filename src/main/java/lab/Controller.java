package lab;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * Name: Donggheon Lim	
 * Username: limd01
 */

public class Controller {
	
	@FXML
	private RadioButton salmonRdo, springGreenRdo, orangeRdo, cyanRdo;
	@FXML
	private ToggleGroup colorToggleGroup;
	@FXML
	private CheckBox northChk, eastChk, southChk, westChk;
	@FXML
	private Label northLbl, eastLbl, westLbl, southLbl;
	@FXML
	private TextField textField;
	
	@FXML
    private void initialize() {
        colorToggleGroup = new ToggleGroup();
        salmonRdo.setToggleGroup(colorToggleGroup);
        springGreenRdo.setToggleGroup(colorToggleGroup);
        orangeRdo.setToggleGroup(colorToggleGroup);
        cyanRdo.setToggleGroup(colorToggleGroup);
        
        salmonRdo.setStyle("-fx-text-fill: salmon");
        springGreenRdo.setStyle("-fx-text-fill: springgreen");
        orangeRdo.setStyle("-fx-text-fill: orange");
        cyanRdo.setStyle("-fx-text-fill: cyan");
    }

	public void colorChange() {
	    String color = getSelectedColor();
	    
	    if (northChk.isSelected()) northLbl.setStyle("-fx-background-color: " + color);
	    if (eastChk.isSelected()) eastLbl.setStyle("-fx-background-color: " + color);
	    if (southChk.isSelected()) southLbl.setStyle("-fx-background-color: " + color);
	    if (westChk.isSelected()) westLbl.setStyle("-fx-background-color: " + color);
	}

private String getSelectedColor() {
    if (salmonRdo.isSelected()) return "salmon";
    else if (springGreenRdo.isSelected()) return "springgreen";
    else if (orangeRdo.isSelected()) return "orange";
    else if (cyanRdo.isSelected()) return "cyan";
    return ""; 
}

public void diverge() {
	String input = textField.getText();
	String [] words = input.split(" ");
	
	if (words.length == 4) {
	northLbl.setText(words[0]);
	eastLbl.setText(words[1]);
	southLbl.setText(words[2]);
	westLbl.setText(words[3]);
}
	else {
		textField.setText("");
		textField.setPromptText("Please enter exactly four words");	
	}
}
	
}
