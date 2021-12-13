package fr.dauphine.JavaAvance.Components;

import java.util.HashMap;

/**
 * 
 * Orientation of the piece enum
 * 
 */
public enum Orientation {
	/* Implement all the possible orientations and 
	 *  required methods to rotate
	 */
	NORTH
	, EAST, SOUTH, WEST;

	public static Orientation getOrifromValue(int orientationValue) {
		// TODO Auto-generated method stub
		if(orientationValue == 0) return EAST;
		if(orientationValue == 1) return SOUTH;
		if(orientationValue == 2) return WEST;
		else return NORTH;
	}

	public Orientation turn90() {
		// TODO Auto-generated method stub
		// MODIFIER
		if(this == NORTH) return EAST;
		if(this == EAST) return SOUTH;
		if(this == SOUTH) return WEST;
		else return NORTH;
	}

	public int[] getOpposedPieceCoordinates(Piece p) {
		// TODO Auto-generated method stub
		
		return null;
	}

	public Orientation getOpposedOrientation() {
		// MODIFIER
		if(this == NORTH) return SOUTH;
		if(this == EAST) return WEST;
		if(this == WEST) return EAST;
		else return NORTH;
	}

}
