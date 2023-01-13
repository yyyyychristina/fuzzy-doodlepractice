package demoPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class demoPractice {
	public static void main(String[] args) {
		ArrayList<ArrayList> vocabulary = new ArrayList<ArrayList>(); //nested ArrayList
		ArrayList<String> vocabulary1 = new ArrayList<String>();
		ArrayList<String> vocabulary2 = new ArrayList<String>();
		
		/**Add 10 strings to ArrayList vocabulary1*/
		vocabulary1.add("notwithstanding");
		vocabulary1.add("nimble");
		vocabulary1.add("profane");
		vocabulary1.add("surmise");
		vocabulary1.add("dissertation");
		vocabulary1.add("trifling");
		vocabulary1.add("hypocrite");
		vocabulary1.add("amortize");
		vocabulary1.add("deduce");
		vocabulary1.add("accord");
		
		vocabulary.add(vocabulary1);//add ArrayList vocabulary1 into nested ArratyList vocabulary
		
		/**Add 10 strings to ArrayList vocabulary2*/
		vocabulary2.add("affair");
		vocabulary2.add("tend");
		vocabulary2.add("profound");
		vocabulary2.add("philosophy");
		vocabulary2.add("demise");
		vocabulary2.add("prominent");
		vocabulary2.add("sitcom");
		vocabulary2.add("sociology");
		vocabulary2.add("clamor");
		vocabulary2.add("defer");
		
		vocabulary.add(vocabulary2);//add ArrayList vocabulary2 into nested ArratyList vocabulary
		
		/**Display the list*/
		for (int i = 0; i < vocabulary.size(); i++) {      //for each ArraysList in vocabulary
			for (int j = 0; j < vocabulary.get(i).size(); j++) {    //for each string in ArrayList
				if (j == vocabulary.get(i).size()-1) {
					System.out.println(vocabulary.get(i).get(j));
				}
				else {
					System.out.print(vocabulary.get(i).get(j) + " ");
				}
			}
		}
		
		/**Create a new ArrayList call vocabulary3*/
		ArrayList<String> vocabulary3 = new ArrayList<String>();
		
		/**Let user to enter vocabulary until the user enter zero , 
		 * and add it to the ArrayList vocabulary3*/
		
		String enteredvocab;
		do {
			//Create a Scanner object
			Scanner input = new Scanner(System.in);
			System.out.print("Enter strings (input ends with zero):");
			enteredvocab = input.nextLine();
			/**Add the string if it is not equals to zero and
			 * if it is not in the ArrayList*/
			if (! enteredvocab.equals("zero") && ! vocabulary3.contains(enteredvocab))
				vocabulary3.add(enteredvocab);
		}
        while (! enteredvocab.equals("zero")); //Don't use != because != means different memory location 
		//indeed, each words entered has different memory location which makes != a INFINITE LOOP
		
		
		/**Display the list*/
		for (int i = 0; i < vocabulary3.size(); i++) { //for each string in ArrayList
			for (int j = 0; j < 10; j++) {    //for each string display 10 times
				System.out.println(vocabulary3.get(i));
			}
		}
	}
}