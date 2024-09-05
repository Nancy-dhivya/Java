import java.util.*;
public class ChangeCase {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input =scanner.nextLine();//hELlo //output:HelLO
        StringBuffer sb = new StringBuffer(input);
        scanner.close();
        for(int i=0;i<input.length();i++)
        {
            if(Character.isLowerCase(input.charAt(i)))
            {
                sb.setCharAt(i,Character.toUpperCase(input.charAt(i)));
            }
        
            else if(Character.isUpperCase(input.charAt(i)))
            {
                sb.setCharAt(i,Character.toLowerCase(input.charAt(i)));
            }
        }
        System.out.println(sb);
    }

}

