import java.util.Scanner;
public class ZombieWorld {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int b=scanner.nextInt();
        int n=scanner.nextInt();
 
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scanner.nextInt();
        }
        scanner.close();

        

        for(int i=0;i<arr.length;i++)
        {
            // if(b>arr[i])
            if(b>0)
            {
                b=b-((arr[i]%2)+(arr[i]/2));
            }
        }
    
        if(b>0)
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    
}
 