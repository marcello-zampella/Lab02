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
		//int prova=parole.indexOf(parola);
		int i;
		boolean flag=true;
		String ritorno=null;
		for(WordErhanced w: parole) {
		if(w.equals(parola)) {
			i=0;
			if(flag==false) {
				ritorno+="\n ma anche: \n";
			}
			else if (parola.getAlien().contains("?"))
				ritorno="La parola contierene "+parola.getAlien()+" il carattere misterioso \n";
			else
				ritorno="";
			flag=false;
			ritorno+=w.getAlien()+" = ";
			for(String s: w.getTranslation()) {
				i++;
				if(w.getTranslation().size()!=i)
					ritorno+=s+" /";
				else
					ritorno+=s;
			}
		}
		}
			return ritorno;
		
	}
	
	

}
