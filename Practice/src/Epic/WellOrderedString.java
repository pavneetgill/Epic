package Epic;

import java.util.HashMap;

import Util.populateHashMapABC;

public class WellOrderedString {

	public static void main(String  args[]){

		System.out.println(" wellOrderedString " + wellOrderedString("baisy"));
		
		System.out.println(" duplicateWellOrderedString " +  duplicateWellOrderedString("baisy"));
	}

	private static Boolean wellOrderedString(String sample) {

		try{
			boolean isWellOrdered =  false;

			HashMap< String, Integer> hashMap = new HashMap<String, Integer>();
			hashMap = populateHashMapABC.populateHashMap(hashMap);

			char[] characterArray = sample.toCharArray();
			int tempCharacter = hashMap.get(String.valueOf(characterArray[0]));
			
			int lowerCharacter = 0;

			for(int i=1; i < characterArray.length; i++){
				lowerCharacter = tempCharacter;
				tempCharacter =  hashMap.get(String.valueOf(characterArray[i]));
			
				if(lowerCharacter > tempCharacter){
					return false;
				}

			}

			isWellOrdered = true;

			return isWellOrdered; 
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}finally{

		}

	}
	
	private static Boolean duplicateWellOrderedString(String sample){
		
		try{
			boolean iswellOrdered =  true;
			
			HashMap< String, Integer> hashMap =  new HashMap<String, Integer>();
			hashMap = populateHashMapABC.populateHashMap(hashMap);
			
			char[] characterArray = sample.toCharArray();
			int tempChar = hashMap.get(String.valueOf(characterArray[0]));
			int lowerChar = 0;
			
			for(int i=1; i< characterArray.length; i++){
				lowerChar = tempChar;
				tempChar = hashMap.get(String.valueOf(characterArray[i]));
				if(lowerChar > tempChar){
					return false;
				}
			}
			return iswellOrdered;
		}catch (Exception e){
			e.printStackTrace();
			return false;
		}
	}


}
