import java.util.Scanner;
public class PrimeRange {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the starting number:");
        int start = scanner.nextInt();
        System.out.println("Enter the ending number:");
        int end = scanner.nextInt();
        scanner.close();

        for(int i=start; i<=end; i++)
        {
            if(isPrime(i))
            {
                System.out.println(i+" ");
            }
        }
    }

        public static boolean isPrime(int num)
        {
            for(int i=2;i<=Math.sqrt(num);i++)
            {
                if(num%i==0)
                {
                    return false;
                }
            }
            return true;
        }

    
}
