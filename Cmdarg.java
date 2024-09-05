public class Cmdarg {
    public static void main(String[] args){
        if(args.length!=2)
        {
            System.out.println("Please give two arguments");
            return;
        }

        String company=args[0];
        String location=args[1];

        String result=company + "Technologies" + location;

        System.out.println(result);

    
    }
    
}
