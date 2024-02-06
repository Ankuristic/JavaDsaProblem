import java.util.Scanner;

public class lowercaseAndAlphanumeric {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String originalString = scanner.nextLine();

        // Convert to lowercase using a for loop
        StringBuilder lowercaseStringBuilder = new StringBuilder();
        for (int i = 0; i < originalString.length(); i++) {
            char currentChar = originalString.charAt(i);
            lowercaseStringBuilder.append(Character.toLowerCase(currentChar));
        }
        String lowercaseString = lowercaseStringBuilder.toString();

        // Remove non-alphanumeric characters using regular expression
        String cleanString = lowercaseString.replaceAll("[^a-zA-Z0-9]", "");

        // Print the result
        System.out.println("Original String: " + originalString);
        System.out.println("Cleaned String: " + cleanString);

        // Close the scanner
        scanner.close();
    }
}

