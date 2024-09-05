import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int i=0;
        int a=0;
        while(n!=0)
        {   
            int last = n%10;
            n=n/10;
            a += last * Math.pow(2,i);
            i++;
            

        }
        System.out.println(a); 
    }
    
    
}
