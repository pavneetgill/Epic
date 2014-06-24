package Epic;

import java.awt.Color;


public class RBG {

	
	public static void main(String args[]){
		
		hexToRgb(0x1144f6);
	}
	
	private static void hexToRgb(int hex){
		int r = (hex & 0xFF0000)>>16;
		int g = (hex & 0X00FF00)>>8;
		int b = (hex & 0x0000FF);
		
		
	 System.out.println("red: " + r +" / blue: " + b +" / green: " + g );
	}
	
	private static void rgbToHex(int r, int g, int b){
		
		Color color =  new Color(r,g,b);
		String hexValue = Integer.toHexString(color.getRGB() & 0x00ffffff);
		
	}
}