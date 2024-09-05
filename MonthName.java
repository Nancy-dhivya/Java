public class MonthName {
    public static void main(String[] args)
    {
        if(args.length!=1)
        {
            System.out.println("Enter only one number for month");
        }

        int monthNum=Integer.parseInt(args[0]);
        String monthName="Invalid";

        switch(monthNum)
        {
            case 1:
                monthName="January";
                break;
            default:
                System.out.println("Enter valid month number");
        }
        System.out.println(monthName);
    }
    
}
