package Epic;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates {

	public static void main(String args[]){

		ArrayList<String> List1 =  new ArrayList<String>();

		List1.add("a");
		List1.add("b");
		List1.add("c");
		List1.add("d");
		List1.add("e");
		ArrayList<String> List2 =  new ArrayList<String>();

		List2.add("b");
		List2.add("c");
		List2.add("d");
		List2.add("e");
		List2.add("f");
		removeDuplicates(List1, List2);
	}

	public static void removeDuplicates(ArrayList<String> list1, ArrayList<String> list2 ){
		
		try{
		HashSet<String> storeHashMap = new HashSet<String>();
		for(int i=0; i< list1.size(); i++){

			storeHashMap.addAll(list1);
			storeHashMap.addAll(list2);
		}
		for (String s : storeHashMap) {
		    System.out.println(s);
		}
		
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
