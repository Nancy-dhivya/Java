import java.util.*;
public class Remove{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();//IPL!won!this!match
        scanner.close();
        String[] parts = inp.split("!");
        for(String ins:parts)
        {
            System.out.print(ins);
        }

    }
    
}
