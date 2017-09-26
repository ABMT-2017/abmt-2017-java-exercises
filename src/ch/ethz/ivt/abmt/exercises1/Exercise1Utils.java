package ch.ethz.ivt.abmt.exercises1;

/**
 * @author thibautd
 */
public class Exercise1Utils {
	public static boolean arrayContains( int[] array , int value ) {
		for ( int i=0; i < array.length; i++ ) {
			if ( array[ i ] == value ) return true;
		}
		return false;
	}
}
