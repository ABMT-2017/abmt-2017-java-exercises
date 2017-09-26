package ch.ethz.ivt.abmt.exercises1;

/**
 * @author thibautd
 */
public class Exercise1_2 {
	public static void main( String[] args ) {
		int[] myArray = {1,2,3,4,5};

		for ( int i = 0; i < myArray.length; i++ ) {
			System.out.println( "value "+i+" is "+myArray[ i ] );
		}

		int i = 0;
		while ( i < myArray.length ) {
			System.out.println( "value "+i+" is "+myArray[ i ] );
			i++;
		}

		// note that this will crash with an array of size 0
		i = 0;
		do {
			System.out.println( "value " + i + " is " + myArray[ i ] );
			i++;
		}
		while ( i < myArray.length );
	}
}
