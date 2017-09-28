package ch.ethz.ivt.abmt.exercises2;

import ch.ethz.ivt.abmt.exercises2.lib.TimedQueue;

/**
 * A simple link for queue simulation. The link can accept any number of vehicle in at any time step,
 * but only one vehicle can get out at every time step. Moreover, vehicles can only exit after they went through the
 * whole link. The time needed depends on the speed of the vehicle and the length of the link.
 *
 * @author thibautd
 */
public class Link {
	private final double length;
	private final TimedQueue queue = new TimedQueue();

	public Link( final double length ) {
		this.length = length;
	}

	public void addVehicle( Vehicle vehicle , double time ) {
		double travelTime = length / vehicle.getSpeed();
		double exitTime = time + travelTime;
		queue.addElementAtEnd( vehicle , exitTime );
	}

	public Vehicle doTimeStep( double time ) {
		// The TimedQueue is written to accept any Object.
		// We know that we put objects that are Vehicles into it: "cast" the output to Vehicle
		return (Vehicle) queue.removeFirstIfArrived( time );
	}

	public int getNumberOfVehicleOnLink() {
		return queue.size();
	}
}
