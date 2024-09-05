import java.util.Scanner;
public class Min_house {

    public static int findMinHouse(int r,int unit, int[] arr)
    {
        if(arr==null || arr.length==0)
        {
            return -1;
        }

        int totalFoodRequired=r*unit;
        int foodCollected=0;
        int housesVisited=0;

        for(int food:arr)
        {
            foodCollected+=food;
            housesVisited++;
            if(foodCollected>totalFoodRequired)
            {
                return housesVisited;
            }

        }
        return 0;

        

    }



    public static void main(String[] args)
    {
        Min_house min=new Min_house();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value for r:");
        int r = scanner.nextInt();
        System.out.println("Enter the number of units:");
        int unit=scanner.nextInt();
        System.out.println("Enter the n value for size of the array:");
        int n = scanner.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scanner.nextInt();
        }
        scanner.close();
        
        int result= min.findMinHouse(r,unit,arr);
        System.out.println(result);
    }
    


    
}
