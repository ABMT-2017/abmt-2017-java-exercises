package ch.ethz.ivt.abmt.exercises2;

/**
 * @author thibautd
 */
public class Simulation {
	// it is usually a good idea to define parameters as constants rather than putting them directly into the code
	private static final double LINK_LENGTH = 100;
	private static final String[] PASSENGER_NAMES = {"Joe","Jack","Joseph","Joe"};
	private static final double SPEED = 30 / 3.6;

	public static void main( String[] args ) {
		Link link = new Link( LINK_LENGTH );

		// for each passenger, create a vehicle, put the passenger into the vehicle, and add the vehicle to the link
		for ( String name : PASSENGER_NAMES ) {
			Passenger passenger = new Passenger( name );
			PassengerVehicle vehicle = new PassengerVehicle( SPEED );
			vehicle.setPassenger( passenger );
			link.addVehicle( vehicle , 0 );
		}

		// The following are two equivalent variant, so that you can see for yourself how a for loop is really only
		// an often more convenient syntax to write a while loop.

		// as long as there are vehicles on the link, increment time and see if a vehicle arrived
		// this for loop is an example of an advanced use of the for statement, where the stopping criterion
		// does not depend on the iteration variable (time)
		for ( int time=0; link.getNumberOfVehicleOnLink() > 0; time++ ) {
			Vehicle out = link.doTimeStep( time );
			if ( out != null ) {
				PassengerVehicle passengerVehicle = (PassengerVehicle) out;
				Passenger passenger = passengerVehicle.getPassenger();
				System.out.println( passenger+" arrived at time step "+time );
			}
		}

		// This while loop is a more standard way to write things.
		// notice how we need to declare the time variable again (define its type):
		// in a for loop, the scope of the iteration variable is within the loop only.
		// here, time will be visible until the end of the method
		//
		// Exercise: run the class and observe what is on the console. You will notice that this part of the code
		// does not produce any output. Why?
		// (Hint: do not search for an error in the code itself. It is strictly equivalent to the previous loop)
		int time = 0;
		while ( link.getNumberOfVehicleOnLink() > 0 ) {
			Vehicle out = link.doTimeStep( time );
			if ( out != null ) {
				PassengerVehicle passengerVehicle = (PassengerVehicle) out;
				Passenger passenger = passengerVehicle.getPassenger();
				System.out.println( passenger+" arrived at time step "+time );
			}
			time++;
		}
	}
}
