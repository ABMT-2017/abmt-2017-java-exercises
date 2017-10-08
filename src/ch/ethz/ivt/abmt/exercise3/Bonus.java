package ch.ethz.ivt.abmt.exercise3;

public class Bonus {
	public static void main( String[] args ) {
		Person parent = new Person( "parent" );
		Person child = new Person( "child" );

		parent.setTarget( child );
		child.setTarget( parent );

		parent.aim( new Ball() );
	}
}

class Ball extends Throwable {}

class Person {
	private final String name;
	private Person target;

	Person(String name) {
		this.name = name;
	}

	public void aim( Ball ball ) {
		try {
			System.out.println( name+" throws the ball!" );
			throw ball;
		}
		catch (Ball b) {
			System.out.println( target.name+" catches it." );
			target.aim( b );
		}
	}

	public void setTarget(Person target) {
		this.target = target;
	}
}
