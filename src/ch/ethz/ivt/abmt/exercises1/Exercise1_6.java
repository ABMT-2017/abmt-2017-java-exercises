/* *********************************************************************** *
 * project: org.matsim.*
 *                                                                         *
 * *********************************************************************** *
 *                                                                         *
 * copyright       : (C) 2013 by the members listed in the COPYING,        *
 *                   LICENSE and WARRANTY file.                            *
 * email           : info at matsim dot org                                *
 *                                                                         *
 * *********************************************************************** *
 *                                                                         *
 *   This program is free software; you can redistribute it and/or modify  *
 *   it under the terms of the GNU General Public License as published by  *
 *   the Free Software Foundation; either version 2 of the License, or     *
 *   (at your option) any later version.                                   *
 *   See also COPYING, LICENSE and WARRANTY file                           *
 *                                                                         *
 * *********************************************************************** */
package ch.ethz.ivt.abmt.exercises1;

/**
 * @author thibautd
 */
public class Exercise1_6 {
	public static void main( String[] args ) {
		int myInt = 1;
		int[] myArray = {1,2,3,4};

		messAround( myArray , myInt );

		System.out.println( "myInt = "+ myInt );

		for ( int i=0; i < myArray.length; i++ ) {
			System.out.println( "myArray["+i+"] = "+myArray[ i ] );
		}
	}

	public static void messAround( int[] array, int var ) {
		var = 10;
		array[ 1 ] = 10;
	}
}
