public class SumAvg{
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5};
        
        int sum=0;
        for(int num:arr)
        {
            sum+=num;
        }
         double average = (double) sum/arr.length;

         System.out.println("Sum is"+sum);
         System.out.println("Average is:"+average);
    }
}