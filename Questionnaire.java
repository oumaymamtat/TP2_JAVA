package QCM;

import  java.io.IOException;
import  java.util.ArrayList;

	//import  qcm.Question;
	/*
	La   classe  Questionnaire  :  QCM
	*/
	public  class  Questionnaire  { 

private  ArrayList<Question>   questions  =  new  ArrayList<Question>() ;   

	
	private  int  numeroQuestionEnCours   =  -1;//Le   num?ro   de   la   derni?re  question   pos?e.

	private  String  titre;  //Le   titre   du  Questionnaire.
	private  int  total  =  0;  //Total   des  points   gagn?s  par  l'utilisateur

	

	public  Questionnaire(String   titre)  {  //constructeur   de   la   classe  Questionnaire
	this.titre  =  titre;
	}

	/*
	Ajoute   une  question   au  questionnaire.
	@param  question
	*/

	public  void  ajouterQuestion(Question   question)  {
	this.questions.add(question);
	}

	/*
	Indique  s'il   reste   des  questions  ?  poser.
	@return  true   si   et   seulement  s'il   reste   des  questions  ?  poser.
	*/

	public  boolean  resteDesQuestions()   {
	return  numeroQuestionEnCours   !=  questions.size()  -  1;
	}

	/*
	R?initialise   le  QCM.
	La   prochaine  question  ?  poser   sera   la   premi?re  question.
	*/

	public void reinitialiser() 
	{ numeroQuestionEnCours = -1;
	 total  =  0;
	}

	/*
	*  Retourne  le  r?sultat  obtenu  par  l'utilisateur,
	*  compte  tenu  des  questions  d?j?  pos?es.
	*  La  note  est  sur  20.  Chaque  bonne  r?ponse
	*  compte  pour  1  point.
	*  Par  exemple,  si  l'utilisateur  a  r?pondu  juste
	*  ?  3  questions  sur  4  il  aura  la  note  de  15.
	*  La  note  est  arrondie  ?  l'entier  le  plus  proche.
	*  @return  la  note  sur  20.
	*/


	public  int  resultat()  {
	int  res=Math.round(total   /  (float)(numeroQuestionEnCours  +  1)  *  20);
	return  res;

	}

	
	//  Affiche  la  question  suivante  du  questionnaire.
	

	public  void  afficherQuestionSuivante()   {

	if  (numeroQuestionEnCours   <  questions.size()  -  1)  

	{          numeroQuestionEnCours++;

 questions.get(numeroQuestionEnCours).afficher("Question   "  +   (numeroQuestionEnCours   +  1)  +  ".  ");
	}
	}

	/*
	Lit   la   r?ponse   au   clavier   la   r?ponse   de  l'utilisateur ?   la  question   qui   vient  d'?tre   affich?e.
	@throws  IOException
	@throws  NumberFormatException
	*/
	public  void  lireReponseQuestion()   throws  NumberFormatException,   IOException  {

	boolean  bonneReponse  = questions.get(numeroQuestionEnCours).lireReponseAuClavier();

	if  (bonneReponse)  {
	total++;
	}
	}

	/*
	Retourne   le   titre   du  QCM.
	@return
	*/
	public  String  titre()  {
	return  titre;
	}

	@Override
	public  String  toString()  {
	return  "Questionnaire  [numeroQuestionEnCours="   +  numeroQuestionEnCours
	+  ",  questions="  +  questions  +  ",  titre="  +  titre  +  ",  total="  +  total
	+  "]";
	}
	}



  