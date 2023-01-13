package demopPalindrome;

import java.util.Scanner;

public class ClassPalindrome {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
		System.out.print("Enter a string:");
		
		
        String word = input.nextLine();
		
        
        
        
        
        
        
        boolean found = true;
        
        
        for (int i = 0; i < word.length(); i++) {
        	if (word.charAt(i) != word.charAt(word.length()-1-i)) {
    			found = false;	
        	}
        	if (word.length() % 2 != 0 && i == (word.length()-1)/2)
        		break;
        }

		if (found) {
			System.out.println("This word is a palindrome.");
		}
		else {
			System.out.println("This word is not a palindrome.");
		}
		}
		}
		
		
		
		
		
		

		

		
			

	


