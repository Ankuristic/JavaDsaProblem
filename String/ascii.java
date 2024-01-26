import java.util.Scanner;

public class ascii {

    
        public static void main(String[] args) {
            // you code goes here
            Scanner sc = new Scanner(System.in);
    
            int N = sc.nextInt();
    
            String s = Integer.toString(N);
    
            int firstDig = s.charAt(0) - '0'; // 1
            int lastDig = s.charAt(s.length() - 1) - '0'; // 3
    
            System.out.println(firstDig + lastDig);
        }
  
}
