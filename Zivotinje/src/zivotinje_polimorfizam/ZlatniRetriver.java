package zivotinje_polimorfizam;

/*
 * ZlatniRetriver je izvedena klasa klase Pas,
 * a Pas je izvedena klasa klase Zivotinja.
 * ZlatniRetriver ima sve osobine koje ima i Pas,
 * pa je jedino potrebno definisati kontruktor.
 * Nema potrebe za dodatnim instancnim promenljivim,
 * niti predefinisanjem bilo kog metoda.
 */
public class ZlatniRetriver extends Pas {

	// private String ime;

	public ZlatniRetriver(String ime) {
		// Pozivamo konstruktor klase Pas sa datim
		// imenom i navedenom rasom "zlatni retriver"
		super(ime, "zlatni retriver");
	}

}
