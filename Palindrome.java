import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number to check for palindrome");
        int n = scanner.nextInt();

        int originalNum=n;
        int reversed=0;

        while(n!=0)
        {
            int digit=n%10;
            reversed = reversed*10+digit;
            n/=10;
        
        }

        if(originalNum==reversed)
        {
            System.out.println("The number is palindrome");
        }
        else
        {
            System.out.println("The number is not palindrome");
        }

    }
    
}
