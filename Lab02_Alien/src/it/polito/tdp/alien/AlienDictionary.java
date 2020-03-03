package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionary {
	private List<Word> parole;
	
	public AlienDictionary() {
		parole= new ArrayList<Word>();
	}

	public void addWord(String alienWord, String translation) {
		Word parola= new Word(alienWord,translation);
		int prova=parole.indexOf(parola);
		if(prova!=-1) {
			parole.get(prova).setTranslation(translation);
		}
		else
			parole.add(parola);
	}
	public String translateWord (String alienWord) {
		Word parola= new Word(alienWord,null);
		int prova=parole.indexOf(parola);
		if(prova!=-1) {
			return parole.get(prova).getTranslation();
		}
		return null;
	}
	
	

}
