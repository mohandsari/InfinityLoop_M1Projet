package fr.dauphine.JavaAvance.Components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * 
 * Type of the piece enum
 * 
 */
public enum PieceType {
	VOID, ONECONN, BAR, TTYPE, FOURCONN, LTYPE
	;

	public Orientation getOrientation(Orientation ori) {
		// TODO Auto-generated method stub
		//if(this==VOID) return  
		return null;
		
	}
	// Each Type has a number of connectors and a specific value

	public LinkedList<Orientation> setConnectorsList(Orientation ori) {
		// TODO Auto-generated method stub
		LinkedList<Orientation> l = new LinkedList<Orientation>();
		if(ori == Orientation.NORTH && this == VOID) l.add(Orientation.NORTH);

		
		if(ori == Orientation.NORTH && this == ONECONN) l.add(Orientation.NORTH);
		if(ori == Orientation.EAST && this == ONECONN) l.add(Orientation.EAST);
		if(ori == Orientation.SOUTH && this == ONECONN) l.add(Orientation.SOUTH);
		if(ori == Orientation.WEST && this == ONECONN) l.add(Orientation.NORTH);
		
		if(ori == Orientation.NORTH && this == BAR) l.add(Orientation.NORTH);l.add(Orientation.SOUTH);
		if(ori == Orientation.EAST && this == BAR) l.add(Orientation.EAST);l.add(Orientation.WEST);
		
		if(ori == Orientation.NORTH && this == TTYPE) l.add(Orientation.NORTH);l.add(Orientation.EAST);l.add(Orientation.WEST);
		if(ori == Orientation.EAST && this == TTYPE) l.add(Orientation.NORTH);l.add(Orientation.SOUTH);l.add(Orientation.EAST);
		if(ori == Orientation.SOUTH && this == TTYPE) l.add(Orientation.EAST);l.add(Orientation.SOUTH);l.add(Orientation.WEST);
		if(ori == Orientation.WEST && this == TTYPE) l.add(Orientation.NORTH);l.add(Orientation.SOUTH);l.add(Orientation.WEST);
		
		if(ori == Orientation.NORTH && this == FOURCONN) l.add(Orientation.NORTH);l.add(Orientation.SOUTH);l.add(Orientation.WEST);l.add(Orientation.EAST);
		
		if(ori == Orientation.NORTH && this == LTYPE) l.add(Orientation.NORTH);l.add(Orientation.EAST);
		if(ori == Orientation.EAST && this == LTYPE) l.add(Orientation.EAST);l.add(Orientation.SOUTH);
		if(ori == Orientation.SOUTH && this == LTYPE) l.add(Orientation.SOUTH);l.add(Orientation.WEST);
		if(ori == Orientation.WEST && this == LTYPE) l.add(Orientation.WEST);l.add(Orientation.NORTH);

		
		return null;
	}

	public ArrayList<Orientation> getListOfPossibleOri() {
		// TODO Auto-generated method stub
		ArrayList<Orientation> p = new ArrayList<Orientation>();
		if(this==VOID) p.add(Orientation.NORTH);
		if(this==ONECONN) p.add(Orientation.NORTH);p.add(Orientation.SOUTH);p.add(Orientation.EAST);p.add(Orientation.WEST);
		if(this==BAR) p.add(Orientation.NORTH);p.add(Orientation.EAST);
		if(this==TTYPE) p.add(Orientation.NORTH);p.add(Orientation.SOUTH);p.add(Orientation.EAST);
		if(this==FOURCONN) p.add(Orientation.NORTH);
		if(this==LTYPE) p.add(Orientation.NORTH);p.add(Orientation.SOUTH);p.add(Orientation.EAST);p.add(Orientation.WEST);
		return p;
	}

	public static PieceType getTypefromValue(int typeValue) {
		// TODO Auto-generated method stub
		if(typeValue == 0) return 	VOID;
		if(typeValue == 1) return 	ONECONN;
		if(typeValue == 2) return 	BAR;
		if(typeValue == 3) return 	TTYPE;
		if(typeValue == 4) return 	FOURCONN;
		if(typeValue == 5) return 	LTYPE;
		return null;
	}

	public int getNbConnectors() {
		// TODO Auto-generated method stub
		if(this==VOID) return 0;
		if(this==ONECONN) return 4;
		if(this==BAR) return 2;
		if(this==TTYPE) return 3;
		if(this==FOURCONN) return 1;
		if(this==LTYPE) return 4;
		return 0;
	}
	

}
