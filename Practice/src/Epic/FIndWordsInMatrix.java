package Epic;

import java.util.ArrayList;

public class FIndWordsInMatrix {


	public static void main(String args[]){

		char[][] matrix={{'a','b','c','d','e'},{'l','b','c','d','e'},{'m','b','c','d','e'},{'a','b','c','d','e'},{'a','b','c','d','e'}};
		int rowNum = 5;
		int columnNum = 5;
		
		
		ArrayList<String> wordsToBeSearched = new ArrayList<String>();
		wordsToBeSearched.add("abc");
		wordsToBeSearched.add("lma");
		wordsToBeSearched.add("cbd");
		
		
		for(String word :wordsToBeSearched){
			findTheWord(matrix, rowNum, columnNum, word);
		}
		
		
	}

	public static void findTheWord(char [][] matrix, int x, int y, String word){

		try{
//horizontal
		for(int i = 0; i<y;i++){
			for(int j = 0; j< (x-word.length()); j++){
				boolean match =  true;
				
				for(int k = 0; k<word.length(); k++){
					if(matrix[i][j+k] != word.charAt(k)){
						match = false;
						break;
					}
				}
				
				if(match){
					System.out.println("Horizontal match for " + word + "  found at "+ i+","+j );
				}else{
				//	System.out.println("Not Found " + word + "  found at "+ i+","+j );
				}
			}
		}
		
		//vertical
		
		for(int j=0;j<x;j++){
			for(int i=0; i<(y-word.length());i++){
				boolean found = true;
				
				for(int k = 0; k< word.length();k++){
					if(matrix[i][j+k] != word.charAt(k)){
						found = false;
						break;
					}
				}
				
				if(found){
					System.out.println("Verical match for " + word + "  found at "+ i+","+j );
				}else{
				//	System.out.println("Verical Not Found " + word + "  found at "+ i+","+j );
				}
				
			}
		}

		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
