import java.util.Scanner;
public class SumOfDigits {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=scanner.nextInt();

        int sum=0;
        while(number!=0)
        {
            sum+=number%10;//to take the last digit
            number/=10;//to eliminate the last digit
        }

        System.out.println(sum);
    }


    
}
