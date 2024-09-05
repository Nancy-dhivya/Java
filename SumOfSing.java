public class SumOfSing{
    public int addNum(int num)
    {
        int sum=0;
        while(num!=0)
        {
            int d=num%10;
            num=num/10;
            if(d%2==0){ //to add only the even numbers 
            sum=sum+d;

            }        
            
        }

        if(sum>=10)
        {
            sum=addNum(sum);
            
            
        }
        return sum;

    }

    public static void main(String[] args)
    {
        SumOfSing sos = new SumOfSing();
        int n=1234;
        int result = sos.addNum(n);
        System.out.println(result);
    }
}