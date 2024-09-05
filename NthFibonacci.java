public class NthFibonacci{
    public static void main(String[] args)
    {
        int n=4;
        if(n<=0)
        {
            System.out.println("Enter a valid integer");
        }
        else
        {
            UserMainCode user = new UserMainCode();
            int result = user.Nthfib(n);
            System.out.println(result);
        }
    }
    }

        class UserMainCode
        {
            public int Nthfib(int input1)
            {
                if(input1==1)
                {
                    return 0;
                }
                else if(input1==2)
                {
                    return 1;
                }

                int a=0,b=1,fib=0;
                for(int i=3 ;i<=input1;i++)
                {
                    fib=a+b;
                    a=b;
                    b=fib;
                }
                return fib;
            }
        }
        
        
        
    