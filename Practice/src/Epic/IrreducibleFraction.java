package Epic;

import Util.GCD;

public class IrreducibleFraction {

	public static void main(String args[]){

		System.out.println(findIrreducibleFraction(.35));
	}


	private static String findIrreducibleFraction(double X){

		double Y = 10000;
		X  =  X * Y; 
		double Z = GCD.getGCD(X,Y);
		return X/Z + "/" + Y/Z;


	}

}
