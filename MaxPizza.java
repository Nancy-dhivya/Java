import java.util.Scanner;
public class MaxPizza {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();

        
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scanner.nextInt();
        }

        scanner.close();

        int r=k-1;
        int count=0;
        int maxcount=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=r)
            {
                count++;
                maxcount=Math.max(maxcount,count);
            }
            else
            {
                count=0;
            }
        }
        System.out.println(maxcount);


    }
    
}
