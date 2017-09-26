package ch.ethz.ivt.abmt.exercises1;

/**
 * @author thibautd
 */
public class Exercise1_5 {
	public static void main( String[] args ) {
		Agent1_5[] agents = new Agent1_5[2];

		agents[0] = new Agent1_5( "Smith" , new int[]{1,4,8,12} );
		agents[1] = new Agent1_5( "Two" , new int[]{5,12,14,18});

		// stores the next time we need to wake up each agent
		int[] nextTime = new int[ agents.length ];
		for ( int i=0; i < nextTime.length; i++ ) {
			nextTime[ i ] = 0;
		}

		// iterate through the whole day
		for ( int time=0; time < 24; time++ ) {
			// for each time step, ask agent to act if we are at the time of an event
			for ( int i=0; i < agents.length; i++ ) {
				if ( nextTime[ i ] == time ) {
					nextTime[ i ] = agents[ i ].act( time );
				}
			}
		}
	}
}

class Agent1_5 {
	private final String name;
	// this stores the ordered list of times where the agent switches from "acting" to "traveling"
	private final int[] events;
	// this stores the index of the next event in the events array
	private int currentIndex = 0;

	// state of the agent: in an activity or in a trip?
	private boolean inActivity = true;

	public Agent1_5( String name , int[] events ) {
		this.name = name;
		this.events = events;
	}

	public void sayHello() {
		System.out.println( "Hello, I am agent "+name );
	}

	public int act( int time ) {
		if ( time == events[ currentIndex ] ) {
			currentIndex++;
			inActivity = !inActivity;
		}
		// this statement can be replaced by an if statement, but it demonstrates the use of the ternary operator (see book)
		System.out.println( "It is "+time+"h, I am agent "+name+" and I am peforming "+( inActivity ? "an activity" : "a trip" ) );

		return currentIndex < events.length ? events[ currentIndex ] : Integer.MAX_VALUE;
	}

}
