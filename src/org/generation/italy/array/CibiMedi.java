package org.generation.italy.array;

import java.util.Random;
import java.util.Scanner;

public class CibiMedi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] listaCibi = {"pasta", "riso", "carote", "pizza", "patatine", "kebab", "insalata", "zucchine", "ciccia", "cavolfiore" };
		int numeroCibi = listaCibi.length;
		int numMezzoPari = (numeroCibi / 2) - 1;
		int numMezzoDispari = numeroCibi / 2;
		Random r = new Random();
		System.out.println("Immagino tu voglia informazioni sulle mie abitudini alimentari");
		System.out.print("Cosa vuoi sapere: preferito, quotidiano, detestato? ");
		Scanner scan = new Scanner(System.in);
		String scelta = scan.next().toLowerCase();
		String risposta = "";
		int[] numerini = {-1, 1};
		int[] numeretti = {-2, -1, 1, 2};
		
		if((scelta.equals("preferito")) || (scelta.equals("quotidiano")) || (scelta.equals("detestato"))) {
			if (numeroCibi == 0) {
				risposta = "Non mangio niente.";
			}
			else if (numeroCibi == 1) {
				risposta = "Mangio solo una cosa cioè " + listaCibi[0];
			}
			else if (numeroCibi == 2) {
				if (scelta.equals("quotidiano")){
					risposta = "Non ho un cibo quotidiano";
				}
				else if (scelta.equals("preferito")){
					risposta = "Sicuramente adoro mangiare " + listaCibi[0];
				}
				else if (scelta.equals("detestato")){
					risposta = "Sicuramente non mi piace " + listaCibi[1];
				}
				}
			else if (numeroCibi == 3) {
				if (scelta.equals("quotidiano")){
					risposta = "Beh di solito mangio " + listaCibi[1] ;
				}
				else if (scelta.equals("preferito")){
					risposta = "Sicuramente adoro mangiare " + listaCibi[0];
				}
				else if (scelta.equals("detestato")){
					risposta = "Sicuramente non mi piace " + listaCibi[2];
				}
				}
			else if (numeroCibi % 2 == 0 && numeroCibi > 2 ) {
				if (scelta.equals("quotidiano")){
					risposta = "Beh di solito mangio " + listaCibi[numMezzoPari] + " o " + listaCibi[numMezzoPari + 1];
				}
				else if (scelta.equals("preferito")){
					risposta = "Sicuramente adoro mangiare " + listaCibi[0];
				}
				else if (scelta.equals("detestato")){
					risposta = "Sicuramente non mi piace " + listaCibi[numeroCibi - 1];
				}
				}
			else if (!(numeroCibi % 2 == 0) && numeroCibi > 2 ) {
				if (scelta.equals("quotidiano")){
					risposta = "Beh di solito mangio " + listaCibi[numMezzoDispari];
				}
				else if (scelta.equals("preferito")){
					risposta = "Sicuramente adoro mangiare " + listaCibi[0];
				}
				else if (scelta.equals("detestato")){
					risposta = "Sicuramente non mi piace " + listaCibi[numeroCibi - 1];
				}
				}
			
			
		}
		else {
			risposta = "Non so come risponderti";
		}
		System.out.println(risposta);
		scan.close();
		}

}
