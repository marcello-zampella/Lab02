package it.polito.tdp.alien;

/**
 * Sample Skeleton for 'Alien.fxml' Controller Class
 */



import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {
	
	private Test test;
	
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private TextField txtWord;
    @FXML
    private TextArea txtResult;
    @FXML
    private Button btnTranslate;
    @FXML
    private Button btnReset;
        
    
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	assert txtWord != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnTranslate != null : "fx:id=\"bntTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Alien.fxml'.";
    	test= new Test();
    }
  
    
    @FXML
    void doTranslate(ActionEvent event) {
    	    	String parola=this.txtWord.getText();
    	    	this.txtWord.clear();
    	    	parola =parola.trim();
    	    	if(parola==null || parola.length()==0) {
    	    		this.txtResult.appendText("inserire una parola \n");
    	    		return;
    	    	}
    	    	for(int i=0;i<parola.length();i++) {
    	    		int lettera=parola.charAt(i);
    	    		if((lettera<65 && lettera!=63) || lettera>122 || (lettera<97 && lettera>90) ) {
    	    			this.txtResult.appendText("INSERIRE PAROLA CORRETTA \n");
    	    			return;
    	    		}
    	    	}
    	    /*	if (!parola.matches("[a-zA-Z]*" || )) {
    	    		this.txtResult.appendText("inserire una parola corretta \n");
    	    		return;
    	    	} */
    	    	AlienDictionary traduzione= test.prova;
    	    	if(traduzione.translateWord(parola)==null)
    	    		this.txtResult.appendText("La parola cercata non esiste \n");
    	    	else
    	    		this.txtResult.appendText(traduzione.translateWord(parola)+"\n");
    	    	
    }
    
    
    @FXML
    void doReset(ActionEvent event) {
    	this.txtResult.clear();

    }
    
}
