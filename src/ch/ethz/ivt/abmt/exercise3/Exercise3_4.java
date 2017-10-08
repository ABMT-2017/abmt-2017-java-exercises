package ch.ethz.ivt.abmt.exercise3;

import java.io.IOException;

public class Exercise3_4 {
	public static void main( String[] args ) {
		// write code that calls performIO(),
		// and wraps the exception in an UncheckedIOException if it occurs
		// Whatever happens, a message should be printed to the console
		// If no exception was raised, an additional message should be printed
		// to the console
		try {
			Exercise3Utils.performIO();
		}
		catch (IOException e) {
			throw new UncheckedIOException( "something happened" , e );
		}
		finally {
			System.out.println( "Whatever happened, we print this" );
		}

		System.out.println( "If you see this, everything went fine!");
	}
}
