package no.hvl.dat100.jplab12.oppgave3;

import no.hvl.dat100.jplab12.common.TODO;
import no.hvl.dat100.jplab12.oppgave1.*;
import no.hvl.dat100.jplab12.oppgave2.Tekst;

public class Blogg {

	private Innlegg[] innleggtabell; 
	private int nesteledig;
	
	public Blogg() {
		innleggtabell = new Innlegg[20];
		nesteledig = 0;
		
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
		nesteledig = 0;
	}

	public int getAntall() {
		
		return nesteledig;
		
	}
	
	public Innlegg[] getSamling() {
		return innleggtabell;

	}
	
	// metodene over er godkjent
	
	
	public int finnInnlegg(Innlegg innlegg) {

		boolean funnet = false;
		int pos = 0;
		while ( pos < nesteledig && !funnet) {
			if ( innleggtabell[pos].getId() == innlegg.getId()) {
				funnet = true;
			}else {
				pos++;
			}
		}
		if(funnet) {
			return pos;
		}else {
			return -1;
		}
		
		
	}

	public boolean finnes(Innlegg innlegg) {
		boolean finnes = false;
		
		int i = 0;
		while((finnes == false) && (i <= nesteledig)) {
			if(innleggtabell[i] != null && innlegg.getId() == innleggtabell[i].getId()) {
				finnes = true;
			}
			else{
				i++;
			}
		}
		
		return finnes;
	}

	public boolean ledigPlass() {
		boolean ledig = false;
		
		if(nesteledig < innleggtabell.length) {
			ledig = true;
		}
		
		return ledig;

	}
	
	public boolean leggTil(Innlegg innlegg) {
		boolean lagttil = false;
		
		boolean ny = finnInnlegg(innlegg) == -1;
		
		if(ny && nesteledig < innleggtabell.length) {
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			lagttil = true;
		}
		
		return lagttil;
	}
	
	@Override
	public String toString() {
		String txt = null;
		
		for(int i = 0; i < nesteledig; i++) {
			if(i == 0) {
				txt = nesteledig + "\n";
			}
			txt += innleggtabell[i].toString();
		}
		
		return txt;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());
 
	}
}