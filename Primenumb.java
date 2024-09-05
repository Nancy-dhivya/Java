import java.util.Scanner;
public class Primenumb {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the nth value to find prime number");

        int n = scanner.nextInt();
        scanner.close();

        int count=0;
        int num=1;
        int nthprime=0;

        while(count<n)
        {
            num++;
            if(isPrimenum(num))
            {
                count++;
                nthprime=num;
            }
        }
        
        System.out.print(nthprime);
    }


        public static boolean isPrimenum(int num)
        {
            if(num<=1)
            {
                return false;
            }
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
        
    
