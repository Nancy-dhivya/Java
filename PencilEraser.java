//number of P pencils and E erasers to choose from N pencils and M erasers(use combinations formula)
public class PencilEraser {
    public static void main(String[] args)
    {



        int N=3;
        int M=2;
        int P=2;
        int E=1;

        int R=N-P;
        int Q=M-E;

        int result=(Fact(N)/(Fact(P)*Fact(R))) * (Fact(M)/(Fact(E)*Fact(Q)));

        System.out.println(result);
    }

    public static int Fact(int num)
    {
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        return fact;
    }

    
    
    
}
