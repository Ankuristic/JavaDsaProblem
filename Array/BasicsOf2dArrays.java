public class BasicsOf2dArrays {
    public static void main(String[] args) {
        int [] [] arr2d = new int [3][4];
        System.out.println(arr2d[1][2]);

        arr2d[2][1] =12;
        System.out.println(arr2d[2][1]);

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            arr2d[i][j]=i*j;
        }
        System.out.print(arr2d[1][1]);
        for(int i=0;i<5;i++)
        {
            arr2d[i][0]=2;
        }
        System.out.print(arr2d[3][0]);
    }
}