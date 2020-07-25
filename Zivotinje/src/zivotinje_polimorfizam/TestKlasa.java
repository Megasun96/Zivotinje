package zivotinje_polimorfizam;

import java.util.Random;

public class TestKlasa {

	public static void main(String[] args) {

		// Niz zivotinja - da bi elementi bili Pas, Zlatni Retriver,
		// Riba, Pingvin, niz je tipa bazne klase Zivotinja
		Zivotinja[] zivotinje = {
				new Pas("Hund", "nemacki ovcar"),
				new ZlatniRetriver("Dzeki"),
				new Riba("Dori", "plava tang riba"),
				new Pingvin("Kovalski")
		};

		// Objekat klase Random predstavlja generator
		// pseudoslucajnih celih brojeva
		Random izbor = new Random();

		// 4 puta se slucajno bira element niza zivotinja
		for(int i = 0; i < 4; i++) {
			// primerak je promenljiva tipa bazne klase koja cuva
			// referencu na objekat izvedene klase

			// izbor.nextInt(n) vraca slucajan ceo broj iz opsega [0,...,n-1]
			// sto je validan indeks niza koji ima n elemenata
			Zivotinja primerak = zivotinje[izbor.nextInt(zivotinje.length)];
			System.out.println(primerak);
			// Ako je zadat nacin oglasavanja, ispisujemo ga
			if(primerak.oglasavanje() != null) {
				if(primerak.ljutitoOglasavanje() != null)
					System.out.println("Oglasava se tako sto " + primerak.oglasavanje() +
							", a kad se ljuti tako sto " + primerak.ljutitoOglasavanje() + ".");
				else
					System.out.println("Oglasava se tako sto " + primerak.oglasavanje() + ".");
			}
			System.out.println("Krece se tako sto " + primerak.nacinKretanja() + ".\n");

		}

	}

}
