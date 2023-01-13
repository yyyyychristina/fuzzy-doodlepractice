package hashMap;

import java.util.HashMap;

public class dictionary1 {

	public static void main(String[] args) {
		// Create a HashMap object that stores String keys and String values
		HashMap<String, String> dictionary1 = new HashMap<String, String>();
		
		// Add keys and values (word, definition)
		dictionary1.put("stay with", "persevere with an activity or task");
		dictionary1.put("not cease from", "not give up");
		dictionary1.put("raise the morale of", "encourage");
		dictionary1.put("stiffen the resolve of", "to become or something stronger");
		dictionary1.put("lift the sprits of", "raise the morale of");
		
		//Print the HashMap
		System.out.println(dictionary1);
		
		System.out.println();
		
		//Print the HashMap's size
		System.out.println(dictionary1.size());
		
		System.out.println();
		
		//Print all keys from the HashMap
		for (String i : dictionary1.keySet()) {
			System.out.println(i);
		}
		
		System.out.println();
		
		//Print all values from the HashMap
		for (String i : dictionary1.values()) {
			System.out.println(i);
		}
		
		System.out.println();
		
		//Print all keys and values together from the HashMap
		for (String i : dictionary1.keySet()) {
			System.out.println("word:" + i + "\t\t\t" + "definition:" + dictionary1.get(i));			
		}	
		
		System.out.println();
		
		//Access to an item using its key
		System.out.println(dictionary1.get("not cease from"));
		
		System.out.println();
		
		/**if key's length is smaller than 3, NOT delete it, 
		 * INSTEAD SKIP IT (continue) $,
		 * and for each key, print the key and definition ten times*/
		for (String i : dictionary1.keySet()) {
			if ((i.split(" ").length) < 3) { //skip the String[] length smaller than 3
				continue;
			}
			for (int j = 0; j < 10; j++) {
				System.out.println("word:" + i + "\t\t\t" + "definition:" + dictionary1.get(i));
			}
				
		}
        /** $ trying to remove an item using for-loop and for-each-loop doesn't work
         * because the collection is changing size at the same time that the code is trying to loop*/
		
		System.out.println();
		
		/**if key DOES NOT matches the pattern of 
		 * "word(zero or more)spaceword(zero or more)spaceword(zero or more)spaceword(zero or more)", 
		 * skip it (continue)
		 * and for each key, print the key and values,
		 * times depended on the value's length*/
		for (String i : dictionary1.keySet()) {
			if (! i.matches("\\w*\\s\\w*\\s\\w*\\s\\w*")) //refer to p.391 & p.1178
				continue;
			for (int j = 0; j < dictionary1.get(i).split(" ").length; j++) {
				System.out.println("word:" + i + "\t\t\t" + "definition:" + dictionary1.get(i));
				//print times depends on the value's length (i.e. String[] length)
			}
		}
	}
}
