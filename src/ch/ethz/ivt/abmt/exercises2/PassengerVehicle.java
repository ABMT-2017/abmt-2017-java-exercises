package ch.ethz.ivt.abmt.exercises2;

/**
 * @author thibautd
 */
public class PassengerVehicle extends Vehicle {
	private Passenger passenger;

	public PassengerVehicle( double speed ) {
		super( speed );
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger( Passenger passenger ) {
		this.passenger = passenger;
	}
}
