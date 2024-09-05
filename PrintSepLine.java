import java.util.Scanner;
public class PrintSepLine {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        String inputs=scanner.nextLine();
        scanner.close();
        String[] parts1=inputs.split(",");
        for(String ins:parts1)
        {
            System.out.println(ins.trim());
        }
    }
    
}
