package ch.ethz.ivt.abmt.exercise3;

import java.io.IOException;

public class Exercise3_3 {
	public static void main( String[] args ) {
		for ( int i=0; i < 30; i++ ) {
			try {
				int result = Exercise3Utils.performIO();
				System.out.println( i+": "+ result );
				if ( result < 0 ) throw new RuntimeException();
			}
			catch (IOException e) {
				System.out.println( i+": something happened" );
			}
			catch (RuntimeException e) {
				System.out.println( i+": result was negative" );
			}
		}
	}
}
