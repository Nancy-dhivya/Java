import java.util.Scanner;
public class IsUpper {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int row=scanner.nextInt();
        int col=scanner.nextInt();
        int[][] arr=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=scanner.nextInt();
            }
        }
        scanner.close();

        boolean isupper=true;
        for(int i=1;i<row;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(arr[i][j]!=0)
                {
                    isupper=false;
                }
            }
        }
        if(isupper)
        {
            System.out.println("It is a upper triangular matrix");
        }
        else{
            System.out.println("It is not a upper triangular matrix");
        }

    }
    
}
