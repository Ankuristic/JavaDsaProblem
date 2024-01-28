
import java.util.Scanner;

public class asteriek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the string: ");
	        String s = scanner.nextLine();

	        int result = countAsterisks(s);

	        System.out.println("Number of '*' excluding those between each pair of '|': " + result);

	        // Close the scanner to prevent resource leaks
	        scanner.close();
	    }

	    public static int countAsterisks(String s) {
	        String pipe = "";
	        int asterik = 0;

	        for (int i = 0; i < s.length(); i++) {
	            if (s.charAt(i) == '|') {
	                // Check if the current pair is even
	                System.out.println("Debug: Found '|' at index " + i);

	                if (pipe.length() % 2 == 0) {
	                    System.out.println("Debug: Even pair found - " + pipe);
	                    // Count asterisks in the even pair
	                    for (int j = 0; j < pipe.length(); j++) {
	                        if (pipe.charAt(j) == '*') {
	                            asterik++;
	                        }
	                    }
	                    System.out.println("Debug: Asterisks count in even pair: " + asterik);
	                }
	                // Reset the pipe for the new pair
	                pipe = "";
	            } else {
	                // Add characters to the current pipe
	                pipe += s.charAt(i);
	            }
	        }

	        return asterik;
	    }
	}