import java.util.Arrays;
import java.util.Scanner;

public class SumoFArray {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the size of the array: "); 
//		 int arr_size = 0;
////		int N  = sc.nextInt();
//		int [] ankur =  new int[arr_size];
////		System.out.println(ankur[5]);
//		
//		for(int a = 0;a<ankur.length;++a) {;
//		
////		int i;
//		System.out.println(ankur[a]);
		
		
		try (Scanner scanner = new Scanner(System.in)) {
			// Get the size of the array from the user
			System.out.print("Enter the size of the array: ");
			int size = scanner.nextInt();
			int sum = 0;

			// Create an array of the specified size
			int[] arr = new int[size];

			// Get user input for each element of the array
			System.out.println("Enter the elements of the array:");
			for (int i = 0; i < size; i++)
			{

			    arr[i] = scanner.nextInt();
			    sum = sum + arr[i];
			}

			// Print the array
			System.out.println("Entered array: " + Arrays.toString(arr));
			System.out.println(sum);
		}
		}

	}


