import java.util.Scanner;

public class Prime {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=scanner.nextInt();
        scanner.close();

        boolean flag=false;

        if(num==1){
            System.out.println("1 is neither prime nor composite");
            return;

        }

        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%2==0)
            {
                flag=true;
                break;
            }
        }

        if(!flag)
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("not prime");
        }


    }
    
}
