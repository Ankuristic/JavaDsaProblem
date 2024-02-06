
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner sc = new Scanner(System.in)) {
			String str = sc.next();
			
			int i = 0 ; int j = str.length()-1;
			
			String ans ="Yes";
			
			while(i<= j) {
				if(str.charAt(i)!=str.charAt(j)) {
					ans = "No";
					break;
				}
				
				i++;
				j--;
			}
			
			System.out.println(ans);
		}

	}

}


// the for loop method are as as follow :
// public class Palindrome {

//     public static void main(String[] args) {
//         // Create Scanner object for user input
//         Scanner sc = new Scanner(System.in);

//         // Prompt user to enter a string
//         System.out.print("Enter a string: ");
//         String str = sc.next();

//         // Initialize variables
//         int length = str.length();
//         String ans = "yes";

//         // Check for palindrome using a for loop
//         for (int i = 0; i < length / 2; i++) {
//             if (str.charAt(i) != str.charAt(length - 1 - i)) {
//                 ans = "No";
//                 break;
//             }
//         }

//         // Print the result
//         System.out.println("Is it a palindrome? " + ans);

//         // Close the Scanner
//         sc.close();
//     }
// }

