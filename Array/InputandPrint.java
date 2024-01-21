import java.util.Scanner;

public class InputandPrint {

    public static void main(String[] args) {
        Scanner ank = new Scanner(System.in);
        System.out.println("Enter the number");
        int rows = ank.nextInt();

        int colms = ank.nextInt();
        System.out.println("Enter the number of colms");

        int [] [] arr = new int[rows][colms];

        for(int i =0;i<rows;i++){
            for(int j =0; j<colms;j++){
                System.out.println("enter the element at" + i+ "row"+j +"colms");
                arr[i][j]=ank.nextInt();
            }
            // for(int i = 0; i<rows;i++){
            //     for(int j =0;j<colms;j++);
            //     System.out.println(arr[i][j] + "");
            // }
            // System.out.println();
        }


    }
    
}
