import java.util.Scanner;
public class CharAscendOrd {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first character");
        char firstChar = scanner.next().charAt(0);
        System.out.println("Enter the second character");
        char secondChar = scanner.next().charAt(0);

        scanner.close();

        if(firstChar<secondChar)
        {
            System.out.println(firstChar+","+secondChar);
        }
        else{
            System.out.println(secondChar+","+firstChar);
        }
    }
    
}
