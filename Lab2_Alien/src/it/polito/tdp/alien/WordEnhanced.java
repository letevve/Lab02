package it.polito.tdp.alien;

import java.util.*;

public class WordEnhanced {
	
	private String alienWord;
	private String translation;
	
	LinkedList<String> tradMultiple = new LinkedList<String>();
	
	public WordEnhanced(String alienWord, String translation) {

		this.alienWord = alienWord;
		this.translation = translation;
	}
	
	

	public String getAlienWord() {
		return alienWord;
	}



	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}



	public String getTranslation() {
		String ris = "";
		ris = translation + "\n" + this.toStringList(tradMultiple);
		return ris;
	}



	public void setTranslation(String translation) {
		tradMultiple.add(translation);
	}

	public String toStringList(LinkedList<String> elenco){
		String ris = "";
		for(String s : elenco){
			ris += s + "\n";
		}
		return ris;
	}
	
}

