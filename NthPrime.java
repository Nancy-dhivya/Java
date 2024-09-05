public class NthPrime {
    public static boolean isPrime(int n)
    {
        if(n<=1)
        {
            System.out.println("neither prime nor composite");
        }

        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }

    public int findNthPrime(int num)
    {
        int count=0;
        int number=1;
        while(count<num)
        {
            number++;
            if(isPrime(number))
            {
                count++;
            }
        }
        return number;
    }
    public static void main(String[] args)
    {
        NthPrime user = new NthPrime();
        int n=10;
        int result=user.findNthPrime(n);
        System.out.println(result);
    }
    
}
