package esercitazionestringhe;
import java.util.Scanner;

public class esercitazioneStringhe {
	public static void main(String[] args) {
		
		/*
		  Esercizio 1: 
			
			Scrivi un programma che chieda all’utente 1) una stringa e 2) un carattere da sostituire 3) con un altro carattere. Stampa la stringa risultante.
			
			TIPS: 
			
			char oldChar = scanner.next().charAt(0); //CI PERMETTE DI PRENDERE UN SOLO CARATTERE IN INPUT
			
			Esercizio 2:
			
			Trova la posizione di un carattere: scrivi un programma che chieda all’utente una stringa e un carattere, e restituisca la posizione della prima occorrenza del carattere.
			
			Esercizio 3:
			
			Scrivi un programma che prenda in input una stringa e rimuova tutte le vocali.
		 */
		
		//Variabili Es.1
		String stringa =""; //Stringa da richiedere
		String caratteresostiruire=" ";//Carattere da sostituire
		String caratterecambia =" ";
		//Variabili Es.2
		String caratterecerca =" ";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Esercitazione 1: ");
		
		System.out.println("Scrivi una stringa ...");
		stringa = scanner.nextLine();
		
		//Ciclo per controllare che abbia messo solo un carattere nella stringa
		do {
			System.out.println("Inserisci un carettere sostiruiente ...");
			caratteresostiruire = scanner.nextLine();
			//Controllo per vedere se abbia inserito un solo carattere
			if(caratteresostiruire.length()!=1) {
				System.out.println("Valore inserito non valido!");
			}
		}while(caratteresostiruire.length()!=1);//Continua finche sia un solo carattere
		
		//Ciclo per controllare che abbia messo solo un carattere nella stringa
		do {
			System.out.println("Inserisci un carettere con il quale lo vuoi cambiare ...");
			caratterecambia = scanner.nextLine();
			//Controllo per vedere se abbia inserito un solo carattere
			if(caratterecambia.length() !=1) {
				System.out.println("Valore inserito non valido!");
			}
		}while(caratterecambia.length()!=1);//Continua finche sia un solo carattere
		
		System.out.println(stringa);
		//Stampa il sostituimento 
		System.out.println(stringa.replace(caratteresostiruire, caratterecambia));
		
		System.out.println("\n\nEsercitazione 2: ");
		
		System.out.println("Scrivi una stringa ...");
		stringa = scanner.nextLine();
		
		//Ciclo per controllare che abbia messo solo un carattere nella stringa
		do {
			System.out.println("Inserisci un carettere da cercare ...");
			caratterecerca = scanner.nextLine();
			//Controllo per vedere se abbia inserito un solo carattere
			if(caratterecerca.length()!=1) {
				System.out.println("Valore inserito non valido!");
			}
		}while(caratterecerca.length()!=1);//Continua finche sia un solo carattere
		
		System.out.println("La posizione dellaprima cella si trova a " + stringa.indexOf(caratterecerca));
		
		System.out.println("\n\nEsercitazione 3: ");
		
		System.out.println("Scrivi una stringa ...");
		stringa = scanner.nextLine();
		
		System.out.println(stringa.replaceAll("[AEIOUaeiou]", ""));

	}
}
