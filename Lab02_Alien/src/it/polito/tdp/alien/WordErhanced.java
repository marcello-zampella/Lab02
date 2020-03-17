package it.polito.tdp.alien;

import java.util.*;

public class WordErhanced {

	private String alien;
	private ArrayList<String> translation;
	
	public WordErhanced(String alienWord, List translation) {
		this.translation= new ArrayList<String>();
		this.alien=alienWord;
		if(translation!=null) {
		this.translation.addAll(translation);
		}
		else
			this.translation=null;
		
	}
	
	
	
	public String getAlien() {
		return alien;
	}





	public void setAlien(String alien) {
		this.alien = alien;
	}





	public ArrayList<String> getTranslation() {
		return translation;
	}





	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alien == null) ? 0 : alien.hashCode());
		return result;
	}
	





	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WordErhanced other = (WordErhanced) obj;
		if (alien == null) {
			if (other.alien != null)
				return false;
		} else if (!alien.toLowerCase().equals(other.alien.toLowerCase()) ) {
			if(other.alien.contains("?")) {
				boolean risposta =true;
				int min;
				if(alien.length()<other.alien.length())
					min=alien.length();
				else
					min=other.alien.length();
				for(int d=0; d<min;d++) {
					if(!(alien.charAt(d)==other.alien.charAt(d) || other.alien.charAt(d)=='?' ))
						risposta=false;
				}
				if(alien.length()!=other.alien.length())
					risposta=false;
			if(risposta)
				return true;
			else
				return false;
			}
			return false;
		}
			
		return true;
	}



	public void aggiungiNuovaTraduzione(List translation2) {
		this.translation.addAll(translation2);
		// TODO Auto-generated method stub
		
	}
	
	
	
	




	
	
	

}
