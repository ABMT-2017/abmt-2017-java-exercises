package ch.ethz.ivt.abmt.exercise3;

import java.io.IOException;
import java.util.Random;

public class Exercise3Utils {
	private static final Random random = new Random();

	public static int performIO() throws IOException {
		if ( random.nextBoolean() ) throw new IOException( "Hoho, something occured!" );
		return random.nextInt();
	}
}
