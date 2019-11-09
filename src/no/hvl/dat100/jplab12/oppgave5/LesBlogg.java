package no.hvl.dat100.jplab12.oppgave5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import no.hvl.dat100.jplab12.common.TODO;
import no.hvl.dat100.jplab12.oppgave1.*;
import no.hvl.dat100.jplab12.oppgave2.*;
import no.hvl.dat100.jplab12.oppgave3.*;

import javax.swing.JOptionPane;
import static java.lang.Integer.parseInt;

public class LesBlogg {

	private static String MAPPE = System.getProperty("user.dir") + "/src/no/hvl/dat100/jplab12/tests/";

	private static String TEKST = "TEKST";
	private static String BILDE = "BILDE";

	public static Blogg les(String filnavn) {
		/*Blogg blogg;
		File fil = null;
		try {
			fil = new File(filnavn);
		}catch(FileNotFoundException e) {
			System.out.println("Fil ikke funnet: " + e);
		}
		finally {
			fil.close();
		}
		Scanner les = new Scanner(fil);
		
		blogg = new Blogg(parseInt(les.nextLine()));
		Innlegg[] tab = blogg.getSamling();
		for (int i = 0; i < tab.length; i++) {
			if (les.nextLine() == TEKST) {
				int id = parseInt(les.nextLine());
				String bruker = les.nextLine();
				String dato = les.nextLine();
				int likes = parseInt(les.nextLine());
				String tekst = les.nextLine();

				Tekst txt = new Tekst(id, bruker, dato, likes, tekst);
			} else if (les.nextLine() == BILDE) {
				int id = parseInt(les.nextLine());
				String bruker = les.nextLine();
				String dato = les.nextLine();
				int likes = parseInt(les.nextLine());
				String bildeTxt = les.nextLine();
				String url = les.nextLine();

				Bilde bilde = new Bilde(id, bruker, dato, likes, bildeTxt, url);
			}
			les.close();

		}

		return blogg;
	*/
		
		throw new UnsupportedOperationException(TODO.method());
		
	}
}
