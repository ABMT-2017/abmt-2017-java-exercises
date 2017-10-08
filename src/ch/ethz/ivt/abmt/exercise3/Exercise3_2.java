package ch.ethz.ivt.abmt.exercise3;

import java.io.IOException;

public class Exercise3_2 {
	public static void main( String[] args ) {
		// write code that calls performIO() 30 times,
		// and prints "i: result" when IO succeeds,
		// with i the iteration number and result the output of perform IO.
		// We now assume that if there is a problem in IO,
		// we cannot recover from it, and should thus abort,
		// by throwing an UncheckedIOException
		for ( int i=0; i < 30; i++ ) {
			try {
				int result = Exercise3Utils.performIO();
				System.out.println( i+": "+ result );
			} catch (IOException e) {
				throw new UncheckedIOException( "something bad happened!" , e );
			}
		}
	}
}
