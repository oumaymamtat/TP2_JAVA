import java.util.ArrayList;

public class Questionnaire {
	private String titre;
	private ArrayList<Question> questions_List;
	private int total_points;
	private int index_question_courante;
	
	// Crée un questionnaire avec un titre.
	//Elle prend en parametre titre titre du questionnaire.
	public Questionnaire(String titre) {
		this.titre = titre;
		this.index_question_courante = -1;
		this.total_points = 0;
		this.questions_List = new ArrayList<Question>();
	}
	
	//Ajoute une question au questionnaire. Elle prend en parametre question
	public void ajouterQuestion(Question question) {
		this.questions_List.add(question);
	}
	
	//Indique s'il reste des questions à poser.
	//return true si et seulement s'il reste des questions à poser.
	public boolean resteDesQuestions() {
		return(this.index_question_courante != this.questions_List.size()-1);
						
	}
	
	// Réinitialise le QCM. La prochaine question à poser sera la première question.
	public void reinitialiser() {
		this.index_question_courante = -1;
		this.total_points = 0;
	}
	
	// Retourne le résultat obtenu par l'utilisateur
	public int resultat() {
		
		return Math.round(this.total_points/this.questions_List.size());
		/*
		int res = 0 ;
		for(Question question : this.questions_List) {
			if(question.lireReponseAuClavier())
				res++;
		}
		return res;*/
	}
	
	// Affiche la question suivante du questionnaire.
	public void afficherQuestionSuivante() {
		System.out.println(this.questions_List.get(index_question_courante+1) );
	}
	
	// Lit au clavier la réponse de l'utilisateur à la question qui vient d'être affichée.
	public void lireReponseQuestion() {
		
	//	Stream user_input = new Stream(System.in);
		
	}
	
	//  Retourne le titre du QCM.
	public String titre() {
		return titre;
	}
	
	public String toString() {
		String ch = "";
		for(Question question : this.questions_List)
			ch += question.toString();
		return ch;
	}

	

}
