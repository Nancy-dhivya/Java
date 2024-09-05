import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size=scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<size;i++)
        {
            arr[i]= scanner.nextInt();
        }

        scanner.close();

        int max = arr[0];
        int min = arr[0];

        for(int j=0; j<arr.length;j++)
        {
            if(arr[j]>max)
            {
                max=arr[j];
            }

            if(arr[j]<min)
            {
                min=arr[j];
            }
        }

        System.out.println("Max element of the array:"+max);
        System.out.println("Min element of the array:"+min);
    }
}
