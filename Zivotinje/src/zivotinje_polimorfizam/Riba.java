package zivotinje_polimorfizam;

public class Riba extends Zivotinja {

	private final String ime;
	private final String podvrsta;

	public Riba(String ime, String podvrsta) {
		super("riba");
		this.ime = ime;
		this.podvrsta = podvrsta;
	}

	@Override
	public String oglasavanje() {
		return null;
	}

	@Override
	public String ljutitoOglasavanje() {
		return null;
	}

	@Override
	public String nacinKretanja() {
		return "pliva";
	}

        @Override
	public String toString() {
		return super.toString() + ". Ime je: " + ime + ", a podvrsta: " + podvrsta + ".";
	}

}
