/* Oscar Hedblad
 * COP3330, 0001
 * 
 * DESCRIPTION: The code takes input from the user, first an integer for the value of k,
 * followed by the actual text that will be encoded (shifted). 
 */


// Import scanner which reads input from user.
import java.util.Scanner;
public class Cipher {

	// Main function
	public static void main(String[] args){
		
		// List the charachters in the English alphabeth, twice for functionallity.
		String [] alpha = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"
				, "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X"
				, "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"
				, "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X"
				, "Y", "Z"};
		
		// Asks the user to input a value for k.
		System.out.println("Please enter number of characters to be shifted: ");
		// Declear a scanner named "key".
		Scanner key = new Scanner(System.in);
		// Scans the value inputted by the user as an integer.
		int moves = key.nextInt();
		// The integer "moves" mod (remainder) 26, which is the length of the alphabeth.
		moves = moves % 26;
		
		// Asks the user to enter a message to encrypt.
		System.out.println("Please enter message to encrypt: ");
		// Creates another scanner named "input".
		Scanner input = new Scanner(System.in);
		// Scans the text inputted by the user as a string.
		String text = input.nextLine();
		
		String after = "";
		
		// A for-loop that runs as long as i is less than the length of the text string.
		for(int i=0; i < text.length();i++){
			// Creates a char named "chara" and sets it to text at where ever i is.
			char chara = text.charAt(i);
			/* If chara is less than or equal to 90 OR greater than or equal to
			 * 65, and NOT equal to a space. This is all because of the ASCII values 
			 * for the different characters, which range from 65-90.
			 */
		if( (chara <= 90 || chara >= 65) && chara != ' ' ){
			
			// First, a cast to (int), then as long as chara+moves is less than 90...
			if((int)(chara + moves) > 90){
				// do after = after + the charachter at i MINUS length of alphabeth MINUS moves.
				after += (char)(((int)(text.charAt(i)) - (26 - moves)));
			}
			else
			{
				// If above line not executed, do else. after = after + charachter at i PLUS moves.
			after += (char)(int)(text.charAt(i) + moves);
			}
		}
		else{
			
			// my variable after = after + SPACE. Takes care of the space issue.
			after += ' ';
		}
		}
		
		// Prints out the result stored in "after".
		
		System.out.println("The new enciphed word is: " +after);

			
	}
}