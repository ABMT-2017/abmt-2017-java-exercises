package ch.ethz.ivt.abmt.exercise3;

import java.io.IOException;

public class Exercise3_1 {
	public static void main( String[] args ) {
		// write code that calls performIO() 30 times,
		// and prints "i: result" when IO succeeds,
		// with i the iteration number and result the output of perform IO,
		// and prints an error message but proceeds if
		// IO fails
		for ( int i=0; i < 30; i++ ) {
			try {
				int result = Exercise3Utils.performIO();
				System.out.println( i+": "+ result );
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
