import java.util.Scanner;
public class StockIncDec {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scanner.nextInt();
        }
        if(arr[0]<arr[1])
        {
            for(int i=2;i<arr.length;i++)
            {
                if(arr[i]<arr[i+1])
                {
                    return true;
                }
                return true;
            }
        }
        else if(arr[0]>arr[1])
        {
            for(int i=2;i<arr.length;i++)
            {
                if(arr[i]>arr[i+1])
                {
                    return true;
                }
                return true;
            }
        }
        else
        {
            return false;
        }
    }

     
}
