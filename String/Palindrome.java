
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
