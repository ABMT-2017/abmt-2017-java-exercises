package ch.ethz.ivt.abmt.exercises2;

/**
 * @author thibautd
 */
public class Passenger {
	private final String name;

	public Passenger( String name ) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}
