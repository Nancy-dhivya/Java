public class star_pat_while {
    public static void main(String[] args)
    {
        if(args.length==0)
        {
            System.out.println("Enter a valid integer");
            return;
        }

        int n=Integer.parseInt(args[0]);
        int i=1;

        while(i<=n)
        {
            int j=1;
            while(j<=i)
            {
                System.out.print("* ");
                j++;
            }
            i++;
            System.out.println();
        }
        
    }
    
}
