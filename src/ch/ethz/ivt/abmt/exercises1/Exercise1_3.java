package ch.ethz.ivt.abmt.exercises1;

/**
 * @author thibautd
 */
public class Exercise1_3 {
	public static void main( String[] args ) {
		int[] myArray = {1,2,3,4,5};

		for ( int i = 0; i < 24; i++ ) {
			if ( Exercise1Utils.arrayContains( myArray , i ) ) {
				System.out.println( i+" is in the array" );
			}
			else {
				System.out.println( i+" is NOT in the array" );
			}
		}
	}

}
