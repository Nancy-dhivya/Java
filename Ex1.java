//max element in a 2d array 
import java.util.Scanner;
public class Ex1{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns:");
        int col = scanner.nextInt();
        int[][] arr = new int[rows][col];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=scanner.nextInt();
            }
        }
        scanner.close();
        int max = arr[0][0];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(arr[i][j]>max)
                {
                    max=arr[i][j];
                }
            }
        }
        System.out.println("Maximum element in 2d array is:"+max);
        
    }

}