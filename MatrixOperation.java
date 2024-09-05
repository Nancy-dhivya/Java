import java.util.*;
public class MatrixOperation {
    

    public static void main(String[] args)
    {

    

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of rows:");
    int rows = scanner.nextInt();
    System.out.println("Enter the number of columns:");
    int cols = scanner.nextInt();
    int[][] arr = new int[rows][cols];
    for(int i=0;i<rows;i++)
    {
        for(int j=0;j<cols;j++)
        {
            arr[i][j]=scanner.nextInt();
        }
    }
    

    int[] evenElements = new int[rows*cols];
    int[] oddElements = new int[rows*cols];
    int evenCount=0, oddCount=0;

    for(int i=0;i<rows;i++)
    {
        for(int j=0;j<cols;j++)
        {
            if((i*cols+j) % 2==0)
            {
                evenElements[evenCount++]=arr[i][j];//after assinging the values are incremented from 0 to 1
            }
            else
            {
                oddElements[oddCount++] = arr[i][j];
            }
        }
    }




    evenElements=Arrays.copyOf(evenElements,evenCount);
    oddElements=Arrays.copyOf(oddElements,oddCount);
    
    Arrays.sort(evenElements);
    Arrays.sort(oddElements);

    int secondLargestEven = secondLargest(evenElements);
    int secondLargestOdd = secondLargest(oddElements);

    int sum= secondLargestEven + secondLargestOdd;

    System.out.println(sum);
    scanner.close();
    }

    public static int secondLargest(int[] arr)
    {
        if(arr.length<2)
        {
            return -1;
        }
        
            return arr[arr.length-2];
        

    }

    }


    

    

