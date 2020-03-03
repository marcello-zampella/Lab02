package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionary {
	private List<WordErhanced> parole;
	
	public AlienDictionary() {
		parole= new ArrayList<WordErhanced>();
	}

	public void addWord(String alienWord, List translation) {
		WordErhanced parola= new WordErhanced(alienWord,translation);
		int prova=parole.indexOf(parola);
		if(prova!=-1) {
			parole.get(prova).aggiungiNuovaTraduzione(translation);
		}
		else
			parole.add(parola);
	}
	
	public void addWord(String alienWord, String translation) {
		ArrayList<String> temp= new ArrayList<String>();
		temp.add(translation);
		this.addWord(alienWord, temp);
	}
	
	public String translateWord (String alienWord) {
		WordErhanced parola= new WordErhanced(alienWord,null);
		int prova=parole.indexOf(parola);
		int i=0;
		if(prova!=-1) {
			String ritorno=alienWord+" = ";
			for(String s: parole.get(prova).getTranslation()) {
				i++;
				if(parole.get(prova).getTranslation().size()!=i)
					ritorno+=s+" /";
				else
					ritorno+=s;
			}
			return ritorno;
		}
		return null;
	}
	
	

}
