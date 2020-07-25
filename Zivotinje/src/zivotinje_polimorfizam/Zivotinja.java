package zivotinje_polimorfizam;

/*
 * Bazna klasa Zivotinja definisana je kao apstraktna klasa.
 * Polimorfni metodi oglasavanje, ljutitoOglasavanje i
 * nacinKretanja definisani su kao apstraktni metodi,
 * sto znaci da se navodi samo prototip metoda
 * uz dodatnu kljucnu rec abstract.
 */

public abstract class Zivotinja {

	private final String vrsta;

	public Zivotinja(String vrsta) {
		this.vrsta = vrsta;
	}

	public abstract String oglasavanje();

	public abstract String ljutitoOglasavanje();

	public abstract String nacinKretanja();

//	public String getVrsta() {
//		return vrsta;
//	}
//
//	public void setVrsta(String vrsta) {
//		this.vrsta = vrsta;
//	}

        @Override
	public String toString() {
		return "Vrsta zivotinje je " + vrsta;
	}

}
