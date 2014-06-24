package Epic;

public class RedBlackMatrix {
	public static void main(String[] args) { 

		char[][] matrix = {{'r','r','r','b'},{'b','r','b','r'},{'b','r','r','b'},{'b','r','b','b'}}; 
		int row = 4, column=4; 
		int red_count = findCount(matrix,row,column,'r'); 
		int blue_count = findCount(matrix,row,column,'b'); 
		System.out.println("Count of red triplets: "+red_count); 
		System.out.println("Count of blue triplets: "+blue_count); 
	} 



	public static int findCount(char[][] matrix, int x, int y, char c){ 

		int count = 0; 


		for(int i = 0; i < x; i++){ 

			for(int j = 0; j < y; j++){ 
				//Horizontal 
				if(j < y-2 && matrix[i][j]==c && matrix[i][j+1]==c && matrix[i][j+2]==c){ 
					count++; 
				} 
				//Vertical 
				if(i < x-2 && matrix[i][j]==c && matrix[i+1][j]==c && matrix[i+2][j]==c){ 
					count++; 
				} 
				//Diagonal left to right 
				if(i < x-2 && j < y-2 && matrix[i][j]==c && matrix[i+1][j+1]==c && matrix[i+2][j+2]==c){ 
					count++; 
				} 

			} 

			for(int j = y-1; j > 0; j--){ 

				//Diagonal right to left 
				if(i < x-2 && j > 1 && matrix[i][j]==c && matrix[i+1][j-1]==c && matrix[i+2][j-2]==c){ 
					count++; 
				} 
			} 

		} 


		return count; 
	}


	public static int duplicateCountTriplets(char[][] matrix, int x, int y,char color){
		try{
			int count = 0;

			for(int i = 0; i < x; i++){
				for(int j=0; j<y; j++){

					//horizontal
					if((j < y-2) &&  (matrix[i][j]==color) && matrix[i][j+1] ==color && matrix[i][j+2]==color ){
						count++;
						//vertical
					}else if((i< x-2) && (matrix[i][j] ==color) &&(matrix[i+1][j] == color) && (matrix[i+2][j] == color )){
						count ++;
						//diagonal left to right
					}else if((i<x-2) && (j<y-2) && matrix[i][j] == color && matrix[i+1][j+1]== color && matrix[i+2][j+2]== color){
						count ++;
					}
				}

				
				//diagnal from bottom left to top right
				for(int j=y-1 ; j>0;j--){

					if((j<x-2) && (j>1) && (matrix[i][j]== color) && (matrix[i+1][j-1]== color) && (matrix[i+2][j-2]== color)){
						count ++;
					}

				}

			}



			return count;
		}catch(Exception e){
			e.printStackTrace();
			return 0;
		}
	}
}
