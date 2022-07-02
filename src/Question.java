import java.util.ArrayList;
import java.util.Scanner;

public class Question {
	private String question_text;
	private ArrayList<String> possible_responses;  // bonnes et mauvaises
	private int correct_response_index;
	
	//Un constructeur de la classe
	public Question(String enonce) {
		this.question_text=enonce;
		this.correct_response_index=0;
		this.possible_responses = new ArrayList<String>();
	}
	
	// Ajoute une r�ponse possible � la question. 
	//Elle prend en  param�tre reponse,  bon true si c'est une bonne r�ponse.
	public void ajouterReponse(String reponse, boolean bon) {
		this.possible_responses.add(reponse);
		if(bon)
			this.correct_response_index = this.possible_responses.indexOf(reponse);
	}
	
	// Permet d�afficher la question sur l'�cran.
	//Elle prend en parametre enteteQuestion ce qu'il faut afficher 
	//juste avant d'afficher la question.	
	public void afficher(String enteteQuestion) {
		System.out.println(enteteQuestion+" "+this.question_text);
	}
	
	// Lit la r�ponse au clavier de l'utilisateur 
	//et retourne true si et seulement si la r�ponse est bonne.
	public boolean lireReponseAuClavier() {
		Scanner user_input =  new Scanner(System.in);
		int rep = user_input.nextInt();
		if(rep == this.correct_response_index)
			return true;
		else return false;		
	}

	// surcharge la m�thode toString
	public String toString() {
		int i = 0;
		String ch = this.question_text + ": \n";
		for(String response : this.possible_responses) {
			ch= ch + i + response + ". \n";
			i++;			
		}
		return ch;
	}

	

}
