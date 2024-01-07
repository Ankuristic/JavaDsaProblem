import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        Scanner ankur = new Scanner(System.in);
        int N = ankur.nextInt();
        // int sum=0;

        for(int i = 1 ;i>=N; i++){
            if(N%3==0 && N%5==0){
                System.out.println("FizzBuzz");
            } else if( N%3==0){
                System.out.println("FIZZ");
            }
            else if(N%5==0){
                System.out.println("BUZZ");
            }else{
                System.out.println(i);
            }
            // if(sum > 3*N){
            //     break;
            // }
            
        }
    }
    
}
