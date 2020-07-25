package zivotinje_polimorfizam;

public class Pingvin extends Zivotinja {

	private final String ime;

	public Pingvin(String ime) {
		super("pingvin");
		this.ime = ime;
	}

	@Override
	public String oglasavanje() {
		return "gace";
	}

	@Override
	public String ljutitoOglasavanje() {
		return null;
	}

	@Override
	public String nacinKretanja() {
		return "se gega";
	}

        @Override
	public String toString() {
		return super.toString() + ". Ime je: " + ime + ".";
	}

}
