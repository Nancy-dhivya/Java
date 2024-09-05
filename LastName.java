import java.util.Scanner;
public class LastName {
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        String person1=scanner.nextLine();
        String person2=scanner.nextLine();
        scanner.close();
        String[] nam1=person1.split(" ");
        String[] nam2=person2.split(" ");

        if(nam1[1].equalsIgnoreCase(nam2[1]))
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    
}
