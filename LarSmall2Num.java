public class LarSmall2Num {
    public static void main(String[] args)
    {
        int[] arr={1,4,34,56,7};

        int firstMin=Integer.MAX_VALUE;
        int secondMin=Integer.MAX_VALUE;
        int firstMax=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;

        for(int num:arr)
        {
            if(num<firstMin)
            {
                secondMin=firstMin;
                firstMin=num;
            }
            else if (num<secondMin)
            {
                secondMin=num;
            }

            if(num>firstMax)
            {
                secondMax=firstMax;
                firstMax=num;
            }
            else if(num>secondMax)
            {
                secondMax=num;
            }
        }

        System.out.println("Largest and smallest 2 numbers are:" + firstMax + "," + secondMax + "," + firstMin + "," + secondMin);

    }
    
}
