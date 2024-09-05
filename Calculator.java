public class Calculator {
    public static double powerInt(int num1,int num2)
    {
        return Math.pow(num1,num2);
    }

    public static double powerDouble(double num1,int num2)
    {
        return Math.pow(num1,num2);

    }

    public static void main(String[] args) {
        
        double a=powerInt(2,3);
        double b=powerDouble(2.5, 5);
        System.out.println(a);
        System.out.println(b);

    }
    
}
