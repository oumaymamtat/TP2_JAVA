package QCM;
import  java.util.Scanner;
import  java.util.ArrayList;
 
public  class  Question {

private  ArrayList<String> reponses = new ArrayList<String>()    ;

private  int  indiceBonneReponse   =  -1;     //  L'indice   de   la   bonne   réponse.
private  String  enonce; 
public   Question(String  enonce)  {  //Constructeur   de   la   classe  question
this.enonce  =  enonce;
}

public  void  ajouterReponse(String   reponse,  boolean  bon)  {
this.reponses.add(reponse);
if  (bon)  {
indiceBonneReponse   =  reponses.size();
}}

public  void  afficher(String  enteteQuestion)  {
System.out.println("-------------"); 
System.out.println(enteteQuestion   +  "  "   +  enonce); 

for  (int  i  =  0;  i  <  reponses.size();  i++)  {
System.out.println((i   +  1)  +  ".  "  +  reponses.get(i));
}}
public  boolean  lireReponseAuClavier()     {

System.out.print("Tapez   le   numéro   de   la   bonne   réponse  :  ");

 Scanner  scan  =  new  Scanner(System.in);
int   rep=scan.nextInt();

if  (rep  >=  1  &&   rep  <=  reponses.size())  {
//   Réponse   valable
if  (rep  ==  indiceBonneReponse)   {
return  true;
}
else  {
return  false;}}
else  {
return  false;
}}
@Override
public  String  toString()  {
return  "Question  [enonce="  +  enonce  +  ",  indiceBonneReponse="
+  indiceBonneReponse   +  ",  reponses="  +  reponses.get(indiceBonneReponse-1)  +  "]";
}}

