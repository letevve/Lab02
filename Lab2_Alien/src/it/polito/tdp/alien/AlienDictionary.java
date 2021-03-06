package it.polito.tdp.alien;

import java.util.LinkedList;


public class AlienDictionary {
	
	private String alienWord;
	private String translation;
	
	LinkedList<WordEnhanced> listWords = new LinkedList<WordEnhanced>();
	//LinkedList<String> listTranslate = new LinkedList<String>();
	
	
	public void addWord(String alienWord, String translation){
		boolean trovato = false;
		for(WordEnhanced w : listWords){
			if(w.getAlienWord().compareTo(alienWord)==0){
				trovato = true;
				w.setTranslation(translation);
				break;
			}
		}
		
		if(trovato==false){
			listWords.add(new WordEnhanced(alienWord, translation));
		}
		
	}
	
	public String translateWord(String alienWord){
		String traduzione = "nessuna traduzione";
		for(WordEnhanced w : listWords){
			if(w.getAlienWord().compareTo(alienWord)==0)
				traduzione = w.getTranslation();
		}
		return traduzione;
	}
	
	public void clear(){
		listWords.clear();
	}

}
