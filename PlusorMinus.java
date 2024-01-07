import java.util.Scanner;

public class PlusorMinus {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		int N  = sc.nextInt();
		int a =sc.nextInt();
		int b =sc.nextInt();
		int c =sc.nextInt();
		
		if(a+b==c) {
			System.out.println("+");
		}else if (a-b==c) {
			System.out.println("-");
		}else {
			System.out.println("");
		}
    
}

}