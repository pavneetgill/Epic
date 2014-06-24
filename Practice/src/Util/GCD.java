package Util;

public class GCD {
	
	public static double getGCD(double a, double b){
		if(b==0){
			
			return a;
		}
		return getGCD(b,a%b);
		
	}

}
