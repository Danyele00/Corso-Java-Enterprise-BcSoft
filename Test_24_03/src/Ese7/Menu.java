package Ese7;


import java.util.TimeZone;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Date;

public class Menu {

	public static void main(String[] args) {
		
		//metodo di partenza che lancia il menu' principale
		principale();
		
	}
	
	public static void principale() {
		
	int selezionato; // variabile locale 
			
			while(true) {
				selezionato = selezionePrincipale(); //lancio il metodo che stampa menu' princ. e restituisce la selezione da tastiera
				
				if (selezionato <= 0) { //uscita dal programma
					System.out.println("Ciao e arrivederci!!");
					break;
				}
				//switch del menu'
				switch (selezionato) {
				case 1:inverti();
				break;
				case 2:eliminaVocali();
				break;
				case 3:conversioneASCII();
				break;
				case 4:saluta();
				break;
				case 5:sostituisciSpazio();
				break;
				case 6:reclami();
				break;
				default: selezionePrincipale();
				}
			}
	}
	
	public static int selezionePrincipale() {
	
		int comando; //variabile locale 
		
		do {
			System.out.println("\nMenù manipolazione stringhe\n1-Inverti stringa\n2-Elimina vocali\n3-Converti ASCII1"
				+ "\n4-Saluta\n5-Sostituisci spazio\n6-Menù reclami\n0-Esci\n");
		
			comando = Tastiera.leggiIntero("Inserisci il comando: " ); //lancio metodo statico per lettura int da tastiera
			if (comando > 6) System.out.println("inserimento non valido\n--------------------"); //controllo dell'input
		} while (comando > 6);
		
		return comando; //restituisco l'intero al chiamante (principale()) corrispondente alla scelta del menu'
	}
	
	public static void inverti () {
		
		String stringa = Tastiera.leggiStringa("Inserisci una Stringa >> "); //Lettura da tastiera di una stringa
		
		System.out.print("Il reverse di " + stringa + " è --> ");
		for (int i=stringa.length()-1; i>=0; i--) //Ciclo for dalla fine della stringa (stringa.length()-1) fino a 0
			System.out.print(stringa.charAt(i));
		
		System.out.println("\n--------------------");		
	}
	
	public static void eliminaVocali() {
		
		char car;
		
		String stringa = Tastiera.leggiStringa("Inserisci una Stringa >> "); //Lettura da tastiera di una stringa
		System.out.println("La stringa originale e' --> "+ stringa);
		
		System.out.print("La stringa senza vocali e' --> ");
		for(int i=0; i<stringa.length();i++) {
			car = stringa.charAt(i); //Variabile locale con il carattere alla posizione i (per semplificare le condizioni succ.)
			if (car != 'a' && car!='e'&& car!='i' && car!='o'&& car!='u') {
				System.out.print(car);
			}//Altrimenti non fare niente
		}
		System.out.println("\n--------------------");
	}
	
	public static void conversioneASCII() {
		
		String stringa= Tastiera.leggiStringa("Inserisci una stringa --> ");  //Lettura da tastiera di una stringa
		System.out.println("La stringa originale e' --> "+ stringa);
		
		System.out.print("Conversione in ASCII  --> ");
		for (int i=0; i<stringa.length();i++) {
			if (stringa.charAt(i)!= ' ')
				System.out.print((int)stringa.charAt(i)+"-"); //Cast del valore di tipo char in int per conversione ascii
		}
		System.out.println("\n--------------------");
		
	}
	
	public static void saluta() {
		
		String nome = Tastiera.leggiStringa("Inserisci un nome --> "); //Lettura da tastiera di una stringa
		char finale = nome.charAt(nome.length()-1); //Salvo il carattere alla posizione finale della stringa
		
		int ora = Tastiera.leggiIntero("Inserire orario (0-23) --> "); //lettura da tastiera di un int
		if (finale =='i'|| finale =='o' || finale == 'e') { 
			if (ora > 0 && ora <= 13) //controllo dell'ora in caso sia true (maschio)
				System.out.println("Buongiorno Signor " + nome);
			else if (ora > 13 && ora < 19)
				System.out.println("BuonPomeriggio Signor " + nome);
				else System.out.println("Buonasera Signor " + nome);
		} else if (ora >0 && ora <=13) //Controllo dell'ora in caso sia false (femmina)
			System.out.println("Buongiorno Signora " + nome);
			else if (ora >13 && ora <19)
			System.out.println("BuonPomeriggio Signora " + nome);
				else System.out.println("Buonasera Signora " + nome);
		
		System.out.println("\n--------------------");
	}
	
	public static void sostituisciSpazio() {
		
		String stringa = Tastiera.leggiStringa("Inserisci una stringa >> ");  //Lettura da tastiera di una stringa
		System.out.println("La stringa originale e' --> " + stringa);
		
		System.out.print("La stringa modificata e' --> ");
		char car;
		for (int i=0; i<stringa.length(); i++) { //Ciclo for della stringa per confronto e ristampa del singolo carattere
			 car = stringa.charAt(i);
			 
			 if (car != ' ') //Se e' diverso da ' ' stampa il carattere altrimenti stampa in simbolo
				 System.out.print(car);
			 else 
				 System.out.print("@");
		}
		System.out.println("\n--------------------");
	}

	public static void reclami() {
		//Utilizzo libreria Calendar, Date, DateFormat per la creazione, gestione e stampa delle date
		Calendar calendar= Calendar.getInstance(TimeZone.getTimeZone( "Europe/Rome"),Locale.ITALY);
		Date data = calendar.getTime();
		DateFormat dateFormat = DateFormat.getDateInstance (DateFormat.SHORT, Locale.ITALY);
		
		String azienda="";
		int sel;
		
		while(true) { 
			sel= selezioneReclami(); //lancio il metodo che stampa menu' reclami e restituisce la selezione da tastiera
			
			if (sel <= 0) {  //Uscita dal menu' e ritorno al chimante ( principale() )
				System.out.println("Ritorno al menù principale");
				break;
			}
			
			String nome =Tastiera.leggiStringa("Inserisci Nome e Cognome >>"); //Lettura da tastiera 
			String motivo = Tastiera.leggiStringa("Inserisci il motivo >> "); //Lettura da tastiera 
			
			switch (sel) { //Switch del valore di selezione e assegnazione alla variabile usata nella stampa
			case 1: azienda="Azienda Agrigola";
			break;
			case 2: azienda="Azienda Elettrica";
			break;
			case 3: azienda="Servio Luce e Gas";
			break;
			case 4: azienda="Gestore telefonico";
			break;
			}
			System.out.println("In data "+ dateFormat.format(data)+ " il/la sig/sig.ra "+ nome + " contatta questo ufficio per la seguente motivazione ["
					+ motivo + "]. \nIn attesa di risoluzione del reclamo porgiamo distinti saluti.\n" + azienda );
			System.out.println("\n--------------------");
		}
	}

	public static int selezioneReclami() {
			
			int intero;
			
			do {
				System.out.println("\nSottomenù reclamo\n1-Azienda Idrica\n2-Azienda elettrica\n3-Servizio luce e gas"
					+ "\n4-Gestore telefonico\n0-Indietro\n");
				intero= Tastiera.leggiIntero("Inerisci il comando --> ");  //lancio metodo statico per lettura int da tastiera
				
				if (intero > 4) //controllo dell'input
					System.out.println("inserimento non valido\n--------------------");
			}while ( intero > 4);
			return intero; //restituisco l'intero al chiamante (reclami()) corrispondente alla scelta del menu'
		}
}
























