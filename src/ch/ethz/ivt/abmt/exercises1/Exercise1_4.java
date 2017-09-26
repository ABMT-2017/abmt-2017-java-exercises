package ch.ethz.ivt.abmt.exercises1;

/**
 * @author thibautd
 */
public class Exercise1_4 {
	public static void main( String[] args ) {
		Agent1_4 agent = new Agent1_4( "Smith" );
		agent.sayHello();
	}
}

class Agent1_4 {
	private final String name;

	public Agent1_4( String name ) {
		this.name = name;
	}

	public void sayHello() {
		System.out.println( "Hello, I am agent "+name );
	}
}
