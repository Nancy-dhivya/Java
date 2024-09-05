import java.util.Scanner;
public class TypeofChar {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = scanner.next().charAt(0);

        if(Character.isDigit(ch))
        {
            System.out.println("It is a digit");
        }
        else if(Character.isLetter(ch))
        {
            System.out.println("It is a alphabet");
        }
        else
        {
            System.out.println("It is a special character");
        }
    }
    
}
