import java.util.Scanner;
public class star_pat_while_getinput {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n=scanner.nextInt();

        scanner.close();

        int i=1;
        while(i<=n)
        {
            int j=1;
            while(j<=i)
            {
                System.out.print("* ");
                j++;
            }
            i++;
            System.out.println();
        }
        
    }
    
}
