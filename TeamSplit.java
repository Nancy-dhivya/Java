import java.util.Scanner;
public class TeamSplit {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String teams=scanner.nextLine();//Royal Challengers#Mumbai Indians#Kolkata Knight Riders 
        scanner.close();//output: 3
        String[] parts=teams.split("#");
        System.out.println(parts.length);
    }
    
}
