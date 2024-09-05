/*import java.util.Scanner;
public class PrintSepLine2 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();//Virat is a player
        scanner.close();
        String[] parts=inp.split(" ");
        for(int i=0;i<parts.length;i++)
        {
            System.out.println(parts[i]);
        }
    }
    
}*/
import java.util.*;
public class PrintSeqLine2{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String details = scanner.nextLine();
        StringTokenizer st = new StringTokenizer(details);
        scanner.close();
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}