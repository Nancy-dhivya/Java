public class ColorCode {
    public static void main(String[] args){
        if(args.length!=1)
        {
            System.out.println("Enter only one argument");
        }

        char colorCode=args[0].charAt(0);

        switch(Character.toUpperCase(colorCode))
        {
            case'R':
                System.out.println("RED");
                break;
            case 'Y':
                System.out.println("Yellow");
            default:
                System.out.println("Invalid color");

        }
    }
    
}
