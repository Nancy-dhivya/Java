//possible number of ways to climb steps with given the starting position, the skip value
//and the initial position where we are starting (used dynamic programming approach)
import java.util.Scanner;
public class RockClimbing {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N=scanner.nextInt();//number of steps - 6
        int X=scanner.nextInt();//skip value - 2
        int I=scanner.nextInt();//initial position -3

        scanner.close();

        int arr[]=new int[N+1];

        arr[I]=1;

        for(int i=I+1;i<=N;i++)
        {
            for(int j=1;j<=X;j++)
            {
                if(i-j>=I)
                {
                    arr[i]=arr[i]+arr[i-j];
                }
            }
        }

        System.out.println(arr[N]);

    }
    
}
