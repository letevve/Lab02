package it.polito.tdp.alien;

import java.net.URL;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.TreeMap;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {
	
	AlienDictionary a = new AlienDictionary();
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtInsert;

    @FXML
    private Button btnTranslate;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnClear;

    @FXML
    void doClear(ActionEvent event) {
    	a.clear();
    	txtResult.clear();
    	txtInsert.clear();
    }
    
    @FXML
    void doTranslate(ActionEvent event) {
    	String inserimento = txtInsert.getText();
    	inserimento.split(" ");
    	
    	String[] arrayLettura = inserimento.split(" ");
    	
    	if(inserimento.matches(".*[a-zA-Z].*")==false){
	    	inserimento = inserimento.toLowerCase();
	    		
	    	if(arrayLettura.length == 1){
	    		//restituire traduzione
	    		String parola = arrayLettura[0];
	    		String result = a.translateWord(parola);
	    		txtResult.setText(result);
	    	}
	    	
	    	if(arrayLettura.length == 2){
	    		//inserisci nel dizionario
	    		String parola1 = arrayLettura[0];
	    		String parola2 = arrayLettura[1];
	    		a.addWord(parola1, parola2);
	    		txtResult.setText("Parola inserita nel dizionario");
	    	}
	    	
	    	if(arrayLettura.length >2){
	    		//gestire eccezione
	    		txtResult.setText("Errore: inserire una o due parole");
	    	}
	    	
	    	if(arrayLettura.length == 0){
	    		txtResult.setText("Inserire almeno una parola");
	    	}
    	}
    	else{
    		txtResult.setText("Inserisci una parola in un formato valido");
    	}
    }

    @FXML
    void initialize() {
        assert txtInsert != null : "fx:id=\"txtInsert\" was not injected: check your FXML file 'Alien.fxml'.";
        assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
        assert btnClear != null : "fx:id=\"btnClear\" was not injected: check your FXML file 'Alien.fxml'.";

    }
}

