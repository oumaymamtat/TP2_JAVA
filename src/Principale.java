
public class Principale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world!");
	    Questionnaire questionnaire = new Questionnaire("QCM de g�ographie");
	    
	    Question question = new Question("Qu'est-ce que Java ?");
	    question.ajouterReponse("Une �le de l'oc�an Atlantique", false);
	    question.ajouterReponse("Une �le de l'oc�an Indien", true);
	    questionnaire.ajouterQuestion(question);
	    
	    question = new Question("Combien d'habitants en France ?");
	    question.ajouterReponse("Moins de 20 millions", false);
	    question.ajouterReponse("Entre 20 et 50 millions", false);
	    question.ajouterReponse("Plus de 50 millions", true);
	    questionnaire.ajouterQuestion(question);
	    
		// Pour indiquer que la prochaine question � poser sera la 1�re question et initialiser le total des points obtenus par l'utilisateur.
	    questionnaire.reinitialiser();
	    System.out.println(questionnaire.titre());
	    System.out.println();
	    while (questionnaire.resteDesQuestions()) {  
	    	// Affiche une question et lit la r�ponse de l'utilisateur
	      questionnaire.afficherQuestionSuivante();
	      questionnaire.lireReponseQuestion();
	    }
	    System.out.println();
	    System.out.println("Votre note : " + questionnaire.resultat());
	    // Pr�pare le questionnaire pour la prochaine fois
	    questionnaire.reinitialiser();  
	}

}
