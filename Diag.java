import java.util.Scanner;
public class Diag {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                arr[i][j]=scanner.nextInt();
            }
        }
        scanner.close();
        boolean val=true;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j && arr[i][j]!=1)
                {
                    val=false;
                }

                if(i!=j && arr[i][j]!=0)
                {
                    val=false;
                }
            }
        }
        if(val)
        {
            System.out.println("Yes, it is identity matrix");
        }
        else{
            System.out.println("No, it is not identity matrix");
        }

        int sum=0;
        for(int i=0;i <n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println(sum);


    }
    
}
