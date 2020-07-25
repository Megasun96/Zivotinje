package zivotinje_polimorfizam;

/*
 * Klasa opisuje pse i izvedena je iz
 * klase Zivotinja, kao bazne.
 */

public class Pas extends Zivotinja {

	private final String ime;
	private final String rasa;

	// Konstruktor: pravi psa na osnovu datog imena i rase
	public Pas(String ime, String rasa) {
		// Poziv konstruktora iz bazne klase Zivotinja
		// kome prosledjujemo naziv vrste
		super("pas");
		this.ime = ime;
		this.rasa = rasa;
	}

	/*
	 * Implementacija apstraktnog polimorfnog metoda
	 * za oglasavanje, ljutitoOglasavanje i nacinKretanja,
	 * koje imaju isti potpis, isti povratni tip
	 * i isti pristupni atribut kao i u baznoj klasi.
	 */
	@Override
	public String oglasavanje() {
		return "laje";
	}

	@Override
	public String ljutitoOglasavanje() {
		return "reci";
	}

	@Override
	public String nacinKretanja() {
		return "hoda ili trci";
	}

        @Override
	public String toString() {
		return super.toString() + ". Zove se " + ime + ", a rase je " + rasa + ".";
	}

}
