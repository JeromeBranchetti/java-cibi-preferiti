package org.generation.italy.array;

import java.util.Random;
import java.util.Scanner;

public class CibiMedi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] listaCibi = {"pasta", "riso", "carote", "pizza", "patatine", "kebabm", "insalata", "zucchine", "ciccia", "cavolfiore" };
		int numeroCibi = listaCibi.length;
		int numMezzo = (numeroCibi / 2) - 1;
		Random r = new Random();
		System.out.println("Immagino tu voglia informazioni sulle mie abitudini alimentari");
		System.out.print("Cosa vuoi sapere: preferito, quotidiano, detestato? ");
		Scanner scan = new Scanner(System.in);
		String scelta = scan.next().toLowerCase();
		String risposta = "";
		int[] numeretti = {-2, -1, 1, 2};
		if (scelta.equals("preferito") || scelta.equals("detestato") ) {
			risposta += "Beh questo è facile, sicuramente ";  
			if (scelta.equals("preferito")){
				risposta += listaCibi[0];
			}
			else if (scelta.equals("detestato")) {
				risposta += listaCibi[numeroCibi - 1];
			}
		}
		else if (scelta.equals("quotidiano")) {
			int casuale = r.nextInt(4);
			risposta += "Mi sa che è " + listaCibi[numMezzo + numeretti[casuale]];
			System.out.println(risposta);
			risposta = "No, scherzo, di solito mangio " + listaCibi[numMezzo];
			
		}
		else {
			risposta = "Non so come rispondere!";
		}
		System.out.println(risposta);
	}

}
