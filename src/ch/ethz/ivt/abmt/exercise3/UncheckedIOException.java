package ch.ethz.ivt.abmt.exercise3;

import java.io.IOException;

public class UncheckedIOException extends RuntimeException {
	public UncheckedIOException( String message  , IOException cause) {
		super( message , cause );
	}
}
