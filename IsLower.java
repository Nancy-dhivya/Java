import java.util.Scanner;
public class IsLower {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=scanner.nextInt();
            }
        }
        scanner.close();

        boolean val=true;
        for(int i=1;i<n;i++)
        {
            for(int j=i+1;j<i;j++)
            {
                if(arr[i][j]!=0)
                {
                    val=false;
                }
            }
        }
        if(val)
        {
            System.out.println("It is a lower triangular matrix");
        }
        else{
            System.out.println("Not lower triangular matrlix");
        }

    }
    
}
