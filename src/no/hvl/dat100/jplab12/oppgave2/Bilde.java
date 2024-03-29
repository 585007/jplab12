package no.hvl.dat100.jplab12.oppgave2;

import no.hvl.dat100.jplab12.common.TODO;

public class Bilde extends Tekst {
	
	private String url;
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		
		setId(id);
		setBruker(bruker);
		setDato(dato);
		setLikes(0);
		setTekst(tekst);
		this.url = url;
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		
		setId(id);
		setBruker(bruker);
		setDato(dato);
		setLikes(likes);
		setTekst(tekst);
		this.url = url;
	}
	
	public String getUrl() {
		return url;

	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		
		String txt = "BILDE\n" + getId()+ "\n" + getBruker()+ "\n" + getDato()+ "\n" + getLikes() + "\net bilde\n" + getUrl() + "\n";		
		return txt;

	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
