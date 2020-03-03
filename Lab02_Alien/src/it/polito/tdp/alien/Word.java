package it.polito.tdp.alien;

public class Word {
	
	private String alien;
	private String translation;
	public Word(String alienWord, String translation) {
		this.alien=alienWord;
		this.translation=translation;
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	public String getAlien() {
		return alien;
	}





	public void setAlien(String alien) {
		this.alien = alien;
	}





	public String getTranslation() {
		return translation;
	}





	public void setTranslation(String translation) {
		this.translation = translation;
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
		Word other = (Word) obj;
		if (alien == null) {
			if (other.alien != null)
				return false;
		} else if (!alien.toLowerCase().equals(other.alien.toLowerCase()))
			return false;
		return true;
	}





	@Override
	public String toString() {
		return "Word [alien=" + alien + ", translation=" + translation + "]";
	}
	
	
	

}
