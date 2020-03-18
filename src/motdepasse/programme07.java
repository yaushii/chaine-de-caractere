package motdepasse;

import java.util.Scanner;

public class programme07 {

	public static void main(String[] args) {
		int n =1;
		String motDePasse = new String();
		motDePasse = "";
		
		Scanner clavier = new Scanner(System.in);
		
		while (motDePasse.equals("Sesame") == false && n <4){
			System.out.println("entrer le mot de passe : ");// saisie du mot de passe
			motDePasse = clavier.next();
			n++;// incrementation du compteur d'essaie
			
		}
		if (motDePasse.equals("Sesame")){
			System.out.println("mot de passe ok");
		}else{
			System.out.println("Error");
		}
		clavier.close();
	}

}
