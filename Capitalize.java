import java.util.Scanner;
public class Capitalize {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String fname=scanner.nextLine();//gautham
        String lname=scanner.nextLine();//metha  //output: Gautham METHA
        scanner.close();
        StringBuffer sb = new StringBuffer(fname.toLowerCase());
        sb.setCharAt(0,Character.toUpperCase(sb.charAt(0)));
        String sname=lname.toUpperCase();
        System.out.println(sb.toString()+" "+sname);
    }
    
}



