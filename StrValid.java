import java.util.*;
public class StrValid {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string");
        String a = scanner.nextLine();
        System.out.println("Enter the second string");
        String b = scanner.nextLine();
        scanner.close();
        if(a.length()!=b.length()){
            for(int i=0;i<a.length();i++){
                if((char)(a.charAt(i)+1)!=b.charAt(i)){
                    System.out.println("Invalid");
                    break;

                }
            }
        }
        System.out.println("Valid");
    }

}
