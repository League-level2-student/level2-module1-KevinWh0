package intro_to_array_lists;

import java.util.ArrayList;
public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> list = new ArrayList<String>();

		//2. Add five Strings to your list
		for (int i = 0; i < 5; i++) {
			list.add(i+"");
			
			System.out.println(list.get(i));
			if(i % 2  == 0) {
				System.out.println(list.get(i));
				
			}
		}
		for (int i = 5; i > 0; i--) {
			list.add(i+"");
			if(list.get(i).contains("e")) {
				System.out.println(i);
			}
			
		}
		
		for (String i : list) {
			System.out.println(i);

		}
		
		//3. Print all the Strings using a standard for-loop
		
		//4. Print all the Strings using a for-each loop
		
		//5. Print only the even numbered elements in the list.
		
		//6. Print all the Strings in reverse order.
		
		//7. Print only the Strings that have the letter 'e' in them.
	}
}
